-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 13, 2023 at 01:50 PM
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
-- Database: `ahmad_rifai_penjualan`
--

-- --------------------------------------------------------

--
-- Table structure for table `tabel_barang`
--

CREATE TABLE `tabel_barang` (
  `kode_barang` char(4) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `kode_jenis` char(4) NOT NULL,
  `id_distributor` char(6) NOT NULL,
  `harganet` double NOT NULL,
  `hargajual` double NOT NULL,
  `stok` smallint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tabel_detailpenjualan`
--

CREATE TABLE `tabel_detailpenjualan` (
  `nomor_faktur` char(10) NOT NULL,
  `kode_barang` char(4) NOT NULL,
  `jumlah` smallint(4) NOT NULL,
  `subtotal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tabel_distributor`
--

CREATE TABLE `tabel_distributor` (
  `id_distributor` char(6) NOT NULL,
  `nama_distributor` varchar(80) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `email` varchar(80) NOT NULL,
  `telepon` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tabel_jenis`
--

CREATE TABLE `tabel_jenis` (
  `kode_jenis` char(4) NOT NULL,
  `jenis` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tabel_penjualan`
--

CREATE TABLE `tabel_penjualan` (
  `nomor_faktur` char(10) NOT NULL,
  `tanggal_penjualan` varchar(30) NOT NULL,
  `id_petugas` char(6) NOT NULL,
  `bayar` double NOT NULL,
  `sisa` double NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tabel_petugas`
--

CREATE TABLE `tabel_petugas` (
  `id_petugas` char(6) NOT NULL,
  `nama_petugas` varchar(80) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `email` varchar(80) NOT NULL,
  `telepon` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tabel_barang`
--
ALTER TABLE `tabel_barang`
  ADD PRIMARY KEY (`kode_barang`),
  ADD UNIQUE KEY `kode_jenis` (`kode_jenis`),
  ADD UNIQUE KEY `id_distributor` (`id_distributor`);

--
-- Indexes for table `tabel_detailpenjualan`
--
ALTER TABLE `tabel_detailpenjualan`
  ADD UNIQUE KEY `nomor_faktur` (`nomor_faktur`),
  ADD UNIQUE KEY `kode_barang` (`kode_barang`);

--
-- Indexes for table `tabel_distributor`
--
ALTER TABLE `tabel_distributor`
  ADD PRIMARY KEY (`id_distributor`);

--
-- Indexes for table `tabel_jenis`
--
ALTER TABLE `tabel_jenis`
  ADD PRIMARY KEY (`kode_jenis`);

--
-- Indexes for table `tabel_penjualan`
--
ALTER TABLE `tabel_penjualan`
  ADD PRIMARY KEY (`nomor_faktur`),
  ADD UNIQUE KEY `id_petugas` (`id_petugas`);

--
-- Indexes for table `tabel_petugas`
--
ALTER TABLE `tabel_petugas`
  ADD PRIMARY KEY (`id_petugas`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tabel_barang`
--
ALTER TABLE `tabel_barang`
  ADD CONSTRAINT `tabel_barang_ibfk_1` FOREIGN KEY (`kode_jenis`) REFERENCES `tabel_jenis` (`kode_jenis`),
  ADD CONSTRAINT `tabel_barang_ibfk_2` FOREIGN KEY (`id_distributor`) REFERENCES `tabel_distributor` (`id_distributor`);

--
-- Constraints for table `tabel_detailpenjualan`
--
ALTER TABLE `tabel_detailpenjualan`
  ADD CONSTRAINT `tabel_detailpenjualan_ibfk_1` FOREIGN KEY (`nomor_faktur`) REFERENCES `tabel_penjualan` (`nomor_faktur`),
  ADD CONSTRAINT `tabel_detailpenjualan_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `tabel_barang` (`kode_barang`);

--
-- Constraints for table `tabel_penjualan`
--
ALTER TABLE `tabel_penjualan`
  ADD CONSTRAINT `tabel_penjualan_ibfk_1` FOREIGN KEY (`id_petugas`) REFERENCES `tabel_petugas` (`id_petugas`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
