-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 13, 2023 at 01:51 PM
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
-- Database: `ahmad_rifai_perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `kd_anggota` char(10) DEFAULT NULL,
  `nm_anggota` varchar(20) DEFAULT NULL,
  `jk_anggota` varchar(15) DEFAULT NULL,
  `jurusan` varchar(20) DEFAULT NULL,
  `angkatan` int(11) DEFAULT NULL,
  `alamat_anggota` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `kd_buku` char(10) DEFAULT NULL,
  `judul_buku` varchar(30) DEFAULT NULL,
  `penulis_buku` varchar(20) DEFAULT NULL,
  `penerbit_buku` varchar(20) DEFAULT NULL,
  `thn_terbit_buku` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `kd_pinjam` char(10) DEFAULT NULL,
  `tgl_pinjam` date DEFAULT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `kd_petugas` char(10) DEFAULT NULL,
  `kd_anggota` char(10) DEFAULT NULL,
  `kd_buku` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pengembalian`
--

CREATE TABLE `pengembalian` (
  `kd_pinjam` char(10) DEFAULT NULL,
  `tgl_pinjam` date DEFAULT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `kd_petugas` char(10) DEFAULT NULL,
  `kd_anggota` char(10) DEFAULT NULL,
  `kd_buku` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `kd_petugas` char(10) DEFAULT NULL,
  `nm_petugas` varchar(20) DEFAULT NULL,
  `jk` varchar(15) DEFAULT NULL,
  `jabatan` varchar(20) DEFAULT NULL,
  `jam_tugas` time DEFAULT NULL,
  `telp` int(12) DEFAULT NULL,
  `alamat` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rak`
--

CREATE TABLE `rak` (
  `kd_rak` char(10) DEFAULT NULL,
  `nm_rak` varchar(20) DEFAULT NULL,
  `kd_buku` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
