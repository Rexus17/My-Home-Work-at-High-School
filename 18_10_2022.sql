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
-- Database: `18_10_2022`
--

-- --------------------------------------------------------

--
-- Table structure for table `coba1`
--

CREATE TABLE `coba1` (
  `id_coba1` int(12) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `tujuan` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `coba2`
--

CREATE TABLE `coba2` (
  `id_coba2` int(12) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `asal` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `coba1`
--
ALTER TABLE `coba1`
  ADD PRIMARY KEY (`id_coba1`);

--
-- Indexes for table `coba2`
--
ALTER TABLE `coba2`
  ADD PRIMARY KEY (`id_coba2`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `coba1`
--
ALTER TABLE `coba1`
  MODIFY `id_coba1` int(12) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `coba2`
--
ALTER TABLE `coba2`
  MODIFY `id_coba2` int(12) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
