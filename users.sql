-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 21, 2024 at 10:20 PM
-- Server version: 8.2.0
-- PHP Version: 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `userlogs`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id_user` varchar(11) NOT NULL,
  `first_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `last_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `date_of_registration` date DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id_user`, `first_name`, `last_name`, `email`, `user_name`, `date_of_birth`, `date_of_registration`) VALUES
('BA125678934', 'Benito', 'Arrutia', 'Benito12@info.com', 'Benito2312', '2002-01-03', '2024-01-24'),
('CL904389765', 'Celeste', 'Lopez', 'Celeste33@info.com', 'Cel1299', '2004-01-16', '2024-01-24'),
('CT285684120', 'Carlos', 'Tesorero', 'Carlos99@info.com', 'Carlos12', '2005-03-24', '2024-01-24'),
('EL894501232', 'Esmeralda', 'Llanos', 'Esmeralda134@info.com', 'Esmtep12', '1993-04-07', '2024-01-24'),
('GA145763091', 'Gilberto', 'Aveiro', 'Gilberto19@info.com', 'Gil19', '2007-02-28', '2024-01-24'),
('JD950128459', 'Joel', 'Dominguez', 'Joel269@info.com', 'Jo21el', '2003-06-29', '2024-01-24'),
('JM984015378', 'Jose', 'Mendez', 'Jose21@info.com', 'MendezJos12', '2004-06-01', '2024-01-24'),
('JR269251519', 'Josue', 'Reyes', 'josue51@info.com', 'Josue551', '1991-10-15', '2024-01-25'),
('LO946758912', 'Lemur', 'Ortiz', 'Lemur256@info.com', 'OrtizLm12', '2000-09-07', '2024-01-24'),
('MD946391847', 'Magaly', 'Diaz', 'Magaly25@info.com', 'Mdiaz4', '1992-05-30', '2024-01-24'),
('MG019645387', 'Monica', 'Garces', 'Monica01@info.com', 'Mini123', '2001-02-01', '2024-01-24'),
('MG910258321', 'Milena', 'Gonzalez', 'Milena98@info.com', 'Mil124', '2011-01-01', '2024-01-22'),
('OP984532718', 'Olga', 'Pena', 'Olga51@info.com', 'Olg124', '1991-12-31', '2024-01-24'),
('RT204946787', 'Romel', 'Tejada', 'Romel07@info.com', 'RomelTeja7', '2002-08-02', '2024-01-24'),
('SP680103083', 'Silvia', 'Perez', 'silvia55@info.com', 'SilviA21', '1999-10-20', '2024-01-25');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
