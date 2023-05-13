-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 13, 2023 at 01:56 PM
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
-- Database: `coba_stored_procedure`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `tampilBanyakDataBarangMasuk` ()   BEGIN
    	SELECT * FROM tb_masuk;
    END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `tampilSatuDataBarangMasuk` (IN `id_terima` INT)   BEGIN
    	SELECT * FROM tb_masuk WHERE id_masuk = id_terima;
    END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `totalBarangKeluar` (IN `id_petugas` INT(11), OUT `total` INT(11))   BEGIN
        DECLARE jmlh_barang_keluar INT(11);
        
        SELECT SUM(jumlah) INTO jmlh_barang_keluar FROM tb_keluar WHERE id_keluar = id_supplier;
        
        SET total = jmlh_barang_keluar;
    END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `totalBarangMasuk` (IN `id_supplier` INT(11), OUT `total` INT(11))   BEGIN
        DECLARE jmlh_barang_masuk INT(11);
        
        SELECT SUM(jumlah) INTO jmlh_barang_masuk FROM tb_masuk WHERE id_masuk = id_supplier;
        
        SET total = jmlh_barang_masuk;
    END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `totalStokGudang` (IN `id_supplier_dan_petugas` INT(11), OUT `total` INT(11))   BEGIN
        DECLARE jmlh_barang_masuk INT(11);
        DECLARE jmlh_barang_keluar INT(11);
        
        SELECT SUM(jumlah) INTO jmlh_barang_masuk FROM tb_masuk WHERE id_masuk = id_supplier_dan_petugas;
        SELECT SUM(jumlah) INTO jmlh_barang_keluar FROM tb_keluar WHERE id_keluar = id_supplier_dan_petugas;
        
        SET total = jmlh_barang_masuk - jmlh_barang_keluar;
    END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `updatedUsers` (IN `id_pengguna` INT(11), IN `total_pengguna` INT(11))   BEGIN
        DECLARE total_pengguna INT(11);
        
        UPDATE tb_users SET id_users = id_users + total_pengguna WHERE id_users = id_pengguna;
        UPDATE tb_users SET id_users = id_users - total_pengguna WHERE id_users = id_pengguna;
        
        SELECT SUM(total_pengguna) FROM tb_users WHERE id_users = total_pengguna;
    END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tb_keluar`
--

CREATE TABLE `tb_keluar` (
  `id_keluar` int(15) NOT NULL,
  `foto` blob NOT NULL,
  `nama` varchar(200) NOT NULL,
  `jenis` varchar(200) NOT NULL,
  `jumlah` int(100) NOT NULL,
  `satuan` varchar(100) NOT NULL,
  `tanggal` timestamp NOT NULL,
  `tujuan` varchar(200) NOT NULL,
  `id_masuk` int(15) NOT NULL,
  `id_petugas` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tb_masuk`
--

CREATE TABLE `tb_masuk` (
  `id_masuk` int(15) NOT NULL,
  `foto` blob NOT NULL,
  `nama` varchar(200) NOT NULL,
  `jenis` varchar(200) NOT NULL,
  `jumlah` int(100) NOT NULL,
  `satuan` varchar(100) NOT NULL,
  `tanggal` timestamp NOT NULL,
  `id_users` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tb_petugas`
--

CREATE TABLE `tb_petugas` (
  `id_petugas` int(15) NOT NULL,
  `foto` blob NOT NULL,
  `nama` varchar(300) NOT NULL,
  `telepon` varchar(15) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `level` enum('Petugas','Admin','Supplier') NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
(14, 0x363334303232343336333465632e706e67, 'SMK Tunas Media', '082968041857', 'admin', '$2y$10$Fd1uQHCRq76FuJPixm47julL.Yf9tlLfqOzJW78.pyVQI0iM5Pf2y', 'admin', 'Jln. Ciputat - Parung'),
(17, 0x363334313130646238303535372e706e67, 'Lulu Falya Tantri', '084916473829', 'petugas', '$2y$10$XOrJjdWg.5uAOq23m41MOuHls6Wa.GkMcH70ZA494Yvd3uTFuFqHm', 'petugas', 'gg. Naik Haji'),
(18, 0x363334313438386631393037322e706e67, 'Mustika Ayu Wulandari', '085613769405', 'supplier', '$2y$10$QWhwiUTsklRZqG1EzKZ2y.5XXDV2pSiVP5G9Wk3sNSi5p0uUeUh0e', 'supplier', 'gg. Naik Haji');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_keluar`
--
ALTER TABLE `tb_keluar`
  ADD PRIMARY KEY (`id_keluar`),
  ADD UNIQUE KEY `id_masuk` (`id_masuk`),
  ADD UNIQUE KEY `id_petugas` (`id_petugas`);

--
-- Indexes for table `tb_masuk`
--
ALTER TABLE `tb_masuk`
  ADD PRIMARY KEY (`id_masuk`),
  ADD UNIQUE KEY `id_users` (`id_users`);

--
-- Indexes for table `tb_petugas`
--
ALTER TABLE `tb_petugas`
  ADD PRIMARY KEY (`id_petugas`);

--
-- Indexes for table `tb_users`
--
ALTER TABLE `tb_users`
  ADD PRIMARY KEY (`id_users`);

--
-- AUTO_INCREMENT for dumped tables
--

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
-- AUTO_INCREMENT for table `tb_petugas`
--
ALTER TABLE `tb_petugas`
  MODIFY `id_petugas` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_users`
--
ALTER TABLE `tb_users`
  MODIFY `id_users` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_keluar`
--
ALTER TABLE `tb_keluar`
  ADD CONSTRAINT `tb_keluar_ibfk_1` FOREIGN KEY (`id_masuk`) REFERENCES `tb_masuk` (`id_masuk`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tb_keluar_ibfk_2` FOREIGN KEY (`id_petugas`) REFERENCES `tb_petugas` (`id_petugas`);

--
-- Constraints for table `tb_masuk`
--
ALTER TABLE `tb_masuk`
  ADD CONSTRAINT `tb_masuk_ibfk_1` FOREIGN KEY (`id_users`) REFERENCES `tb_users` (`id_users`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
