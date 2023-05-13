-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 13, 2023 at 02:00 PM
-- Server version: 5.7.33
-- PHP Version: 8.1.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventory_items_last_assignment`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `ambilQuantityGudang` (IN `id_warehouse` INT(15), IN `kurang_jumlah` INT(15))   BEGIN
    	UPDATE tb_gudang SET jumlah = jumlah - kurang_jumlah WHERE
        id_gudang = id_warehouse;
	END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `tambahGudang` ()   BEGIN
    	INSERT INTO tb_gudang VALUES (id_gudang, foto, nama, jenis, jumlah, satuan, kode_barang, id_masuk);
    END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `tampilDataUser` ()   BEGIN
    	SELECT * FROM tb_users;
	END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `updateJumlahGudang` (IN `items_code` VARCHAR(100), IN `up_quantity` INT)   BEGIN
    	UPDATE tb_gudang
        SET
        jumlah = up_quantity WHERE kode_barang = items_code;
	END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tb_gudang`
--

CREATE TABLE `tb_gudang` (
  `id_gudang` int(15) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `jenis` varchar(200) NOT NULL,
  `jumlah` int(100) NOT NULL,
  `satuan` varchar(100) NOT NULL,
  `kode_barang` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_gudang`
--

INSERT INTO `tb_gudang` (`id_gudang`, `nama`, `jenis`, `jumlah`, `satuan`, `kode_barang`) VALUES
(60, ' ODP Solid 8 Core', 'Electronic', 0, 'PCS', 'BAR-1122001'),
(61, 'Splitter 1:8 solid', 'Electronic', 0, 'PCS', 'BAR-1122002'),
(62, 'Klem Ring', 'Electronic', 0, 'PCS', 'BAR-1122003'),
(63, 'Span Wartel 3/8\"', 'Electronic', 0, 'PCS', 'BAR-1122004'),
(64, 'Stopping', 'Electronic', 0, 'PCS', 'BAR-1122005'),
(65, 'Spliter 1x4', 'Electronic', 0, 'PCS', 'BAR-1122006');

-- --------------------------------------------------------

--
-- Table structure for table `tb_jenis_barang`
--

CREATE TABLE `tb_jenis_barang` (
  `id_jenis_barang` int(15) NOT NULL,
  `jenis_barang` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_jenis_barang`
--

INSERT INTO `tb_jenis_barang` (`id_jenis_barang`, `jenis_barang`) VALUES
(1, 'Electronic'),
(2, 'Fashion'),
(4, 'Food'),
(5, 'Drink'),
(6, 'Car'),
(7, 'Motorcycle'),
(8, 'Bus'),
(9, 'Truck');

-- --------------------------------------------------------

--
-- Table structure for table `tb_keluar`
--

CREATE TABLE `tb_keluar` (
  `id_keluar` int(15) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `jenis` varchar(200) NOT NULL,
  `jumlah` int(100) NOT NULL,
  `satuan` varchar(100) NOT NULL,
  `tanggal` timestamp NOT NULL,
  `tujuan` varchar(200) NOT NULL,
  `id_transaksi` varchar(1000) NOT NULL,
  `kode_barang` varchar(100) NOT NULL,
  `nama_petugas` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Triggers `tb_keluar`
--
DELIMITER $$
CREATE TRIGGER `barang_keluar` AFTER INSERT ON `tb_keluar` FOR EACH ROW BEGIN
	UPDATE tb_gudang SET jumlah = jumlah - NEW.jumlah
	WHERE kode_barang = NEW.kode_barang;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `batal_keluar` AFTER DELETE ON `tb_keluar` FOR EACH ROW BEGIN
	UPDATE tb_gudang SET jumlah = jumlah + OLD.jumlah
	WHERE kode_barang = OLD.kode_barang;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tb_masuk`
--

CREATE TABLE `tb_masuk` (
  `id_masuk` int(15) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `jenis` varchar(200) NOT NULL,
  `jumlah` int(100) NOT NULL,
  `satuan` varchar(100) NOT NULL,
  `tanggal` timestamp NOT NULL,
  `id_transaksi` varchar(1000) NOT NULL,
  `kode_barang` varchar(100) NOT NULL,
  `nama_supplier` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Triggers `tb_masuk`
--
DELIMITER $$
CREATE TRIGGER `barang_masuk` AFTER INSERT ON `tb_masuk` FOR EACH ROW BEGIN
	UPDATE tb_gudang SET jumlah = jumlah + NEW.jumlah
	WHERE kode_barang = NEW.kode_barang;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `batal_masuk` AFTER DELETE ON `tb_masuk` FOR EACH ROW BEGIN
	UPDATE tb_gudang SET jumlah = jumlah - OLD.jumlah
    WHERE kode_barang = OLD.kode_barang;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tb_satuan`
--

CREATE TABLE `tb_satuan` (
  `id_satuan` int(15) NOT NULL,
  `satuan` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_satuan`
--

INSERT INTO `tb_satuan` (`id_satuan`, `satuan`) VALUES
(2, 'Pack'),
(3, 'Unit'),
(4, 'PCS'),
(6, 'Butir'),
(7, 'Kg'),
(8, 'Dus'),
(9, 'Box'),
(10, 'Liter'),
(11, 'Set');

-- --------------------------------------------------------

--
-- Table structure for table `tb_users`
--

CREATE TABLE `tb_users` (
  `id_users` int(15) NOT NULL,
  `foto` blob NOT NULL,
  `nama` varchar(300) NOT NULL,
  `telepon` varchar(15) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `level` enum('supplier','admin','petugas') NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_users`
--

INSERT INTO `tb_users` (`id_users`, `foto`, `nama`, `telepon`, `username`, `password`, `level`, `alamat`) VALUES
(53, 0x363337636133623432646534612e706e67, 'Uzumaki Naruto', '081267946817', 'naruto', '$2y$10$fPEZseOADH8MnMFK4AJlSeVvkGIEQJAB/Cc/i/BNx11SjEaI0Rf1q', 'admin', 'Jln. Hokage 07');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_gudang`
--
ALTER TABLE `tb_gudang`
  ADD PRIMARY KEY (`id_gudang`);

--
-- Indexes for table `tb_jenis_barang`
--
ALTER TABLE `tb_jenis_barang`
  ADD PRIMARY KEY (`id_jenis_barang`);

--
-- Indexes for table `tb_keluar`
--
ALTER TABLE `tb_keluar`
  ADD PRIMARY KEY (`id_keluar`);

--
-- Indexes for table `tb_masuk`
--
ALTER TABLE `tb_masuk`
  ADD PRIMARY KEY (`id_masuk`);

--
-- Indexes for table `tb_satuan`
--
ALTER TABLE `tb_satuan`
  ADD PRIMARY KEY (`id_satuan`);

--
-- Indexes for table `tb_users`
--
ALTER TABLE `tb_users`
  ADD PRIMARY KEY (`id_users`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_gudang`
--
ALTER TABLE `tb_gudang`
  MODIFY `id_gudang` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;

--
-- AUTO_INCREMENT for table `tb_jenis_barang`
--
ALTER TABLE `tb_jenis_barang`
  MODIFY `id_jenis_barang` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `tb_keluar`
--
ALTER TABLE `tb_keluar`
  MODIFY `id_keluar` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_masuk`
--
ALTER TABLE `tb_masuk`
  MODIFY `id_masuk` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_satuan`
--
ALTER TABLE `tb_satuan`
  MODIFY `id_satuan` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `tb_users`
--
ALTER TABLE `tb_users`
  MODIFY `id_users` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
