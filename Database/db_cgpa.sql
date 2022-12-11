-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 03, 2022 at 05:47 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_cgpa`
--

-- --------------------------------------------------------

--
-- Table structure for table `tblc`
--

CREATE TABLE `tblc` (
  `id` int(11) NOT NULL,
  `sem` varchar(50) CHARACTER SET ascii NOT NULL,
  `totalmark` int(11) NOT NULL,
  `cgpa` float NOT NULL,
  `checkbox` int(11) NOT NULL,
  `sum1` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblc`
--

INSERT INTO `tblc` (`id`, `sem`, `totalmark`, `cgpa`, `checkbox`, `sum1`) VALUES
(1, 'sem1', 210, 8.86754, 0, 210),
(2, 'sem2', 0, 10, 0, 0),
(3, 'sem3', 0, 0, 0, 0),
(4, 'sem4', 0, 0, 0, 0),
(5, 'sem5', 0, 0, 0, 0),
(6, 'sem6', 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `tblclet`
--

CREATE TABLE `tblclet` (
  `id` int(11) NOT NULL,
  `sem` varchar(50) CHARACTER SET ascii NOT NULL,
  `totalmark` int(11) NOT NULL,
  `sum3` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblclet`
--

INSERT INTO `tblclet` (`id`, `sem`, `totalmark`, `sum3`) VALUES
(1, 'sem3let', 0, 0),
(2, 'sem4let', 0, 0),
(3, 'sem5let', 0, 0),
(4, 'sem6let', 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tblc`
--
ALTER TABLE `tblc`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tblclet`
--
ALTER TABLE `tblclet`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tblc`
--
ALTER TABLE `tblc`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tblclet`
--
ALTER TABLE `tblclet`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
