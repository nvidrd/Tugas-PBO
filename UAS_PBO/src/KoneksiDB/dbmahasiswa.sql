-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 11 Jun 2023 pada 01.40
-- Versi server: 10.4.25-MariaDB
-- Versi PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbmahasiswa`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_data`
--

CREATE TABLE `tb_data` (
  `NIM` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `Alamat` varchar(255) NOT NULL,
  `Prodi` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Angkatan` varchar(50) NOT NULL,
  `Status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_data`
--

INSERT INTO `tb_data` (`NIM`, `Password`, `Nama`, `Alamat`, `Prodi`, `Email`, `Angkatan`, `Status`) VALUES
('2109106041', '111', 'Novia Indah Ramadhani', 'Jalan Cendana Gang 15 ', 'Informatika', 'novia@gmail.com', '2021', 'Tidak Aktif'),
('2109106000', '111', 'Ayam', 'Jalan Perjuangan 7', 'Informatika', 'email@email.com', '2021', 'Tidak Aktif'),
('Admin', '111', 'Admin', '', '', '', '', 'Admin'),
('Admin', '111', 'Admin', '', '', '', '', 'Admin'),
('2109106042', '111', 'Nopenul', 'Jalan Cendana', 'Informatika', 'novia@gmail.com', '2021', 'Aktif'),
('2209106010', '111', 'Refal Hady', 'Jalanin dulu', 'Informatika', 'repal@gmail.com', '2022', 'Aktif');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
