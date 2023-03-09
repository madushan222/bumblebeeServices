-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 09, 2023 at 07:39 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bumble_bee`
--

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `brand_id` int(11) NOT NULL,
  `cat_id` int(11) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `brand`
--

INSERT INTO `brand` (`brand_id`, `cat_id`, `name`, `status`) VALUES
(1, 2, 'Samsung', 'USED'),
(2, 3, 'Nike', 'USED'),
(3, 3, 'GUCCI', 'PENDING'),
(5, 2, 'Apple', 'USED');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `cat_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `added_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`cat_id`, `name`, `status`, `added_date`) VALUES
(2, 'Mobile Accessories', 'USED', '2023-02-24'),
(3, 'Clothes', 'USED', '2023-02-24');

-- --------------------------------------------------------

--
-- Table structure for table `loan`
--

CREATE TABLE `loan` (
  `loan_id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `amount` float DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `loan`
--

INSERT INTO `loan` (`loan_id`, `user_id`, `status`, `start_date`, `end_date`, `amount`, `product_id`) VALUES
(1, 4, 'ONGOING', '2023-02-06', '2023-04-06', 6000, 2);

-- --------------------------------------------------------

--
-- Table structure for table `loanshedule`
--

CREATE TABLE `loanshedule` (
  `ins_id` int(11) NOT NULL,
  `loan_id` int(11) DEFAULT NULL,
  `ins_amount` float DEFAULT NULL,
  `due_date` date DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `pay_date` date DEFAULT NULL,
  `paid_amount` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `loanshedule`
--

INSERT INTO `loanshedule` (`ins_id`, `loan_id`, `ins_amount`, `due_date`, `status`, `pay_date`, `paid_amount`) VALUES
(1, 1, 2000, '2023-02-06', 'PAID', '2023-03-06', 2000),
(2, 1, 2000, '2023-03-06', 'PENDING', NULL, NULL),
(3, 1, 2000, '2023-04-06', 'PENDING', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `product_id` int(11) NOT NULL,
  `cat_id` int(11) DEFAULT NULL,
  `brand_id` int(11) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `added_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`product_id`, `cat_id`, `brand_id`, `name`, `status`, `added_date`) VALUES
(2, 3, 2, 'T Shirt M2', 'PENDING', NULL),
(3, 2, 5, 'Iphone 10', 'PENDING', '2023-02-28');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `userId` int(11) NOT NULL,
  `fName` varchar(100) DEFAULT NULL,
  `mName` varchar(100) DEFAULT NULL,
  `lName` varchar(100) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `nic` varchar(13) DEFAULT NULL,
  `address1` varchar(100) DEFAULT NULL,
  `address2` varchar(100) DEFAULT NULL,
  `address3` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `mobile` int(11) DEFAULT NULL,
  `userType` char(2) DEFAULT NULL,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userId`, `fName`, `mName`, `lName`, `dob`, `nic`, `address1`, `address2`, `address3`, `email`, `mobile`, `userType`, `username`, `password`) VALUES
(1, 'Madushani', 'Thiwanka', 'Hapuarachchi', '1998-08-01', '982140374V', '154,Pokuna Rd,Siddamulla', 'Piliyandala', '', 'shanrox111@gmail.com', 765870700, 'A', 'madushan001', '1234'),
(2, 'Kaushan', 'Ruwanga', 'Hapuarachchi', '1992-09-01', '92458745V', '154,Pokuna Rd,Siddamulla', 'Piliyandala', '', 'maxinhome@gmail.com', 754876985, 'A', 'kaushan001', '1234'),
(4, 'Waruni', 'Thamali', 'Perera', '1998-11-12', '988171352V', '88/1, Mahalwarawa', 'Pannipitiya', '', 'warunithamali98@gmail.com', 766108823, 'C', 'waruni001', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`brand_id`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`cat_id`);

--
-- Indexes for table `loan`
--
ALTER TABLE `loan`
  ADD PRIMARY KEY (`loan_id`);

--
-- Indexes for table `loanshedule`
--
ALTER TABLE `loanshedule`
  ADD PRIMARY KEY (`ins_id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`product_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `brand`
--
ALTER TABLE `brand`
  MODIFY `brand_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `cat_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `loan`
--
ALTER TABLE `loan`
  MODIFY `loan_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `loanshedule`
--
ALTER TABLE `loanshedule`
  MODIFY `ins_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `product_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `userId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
