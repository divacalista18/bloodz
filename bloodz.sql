-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.30 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for bloodz
CREATE DATABASE IF NOT EXISTS `bloodz` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bloodz`;

-- Dumping structure for table bloodz.darah
CREATE TABLE IF NOT EXISTS `darah` (
  `id_kantong` varchar(11) NOT NULL,
  `id_pendonoran` varchar(11) NOT NULL,
  `gol_darah` enum('A','B','AB','O') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `status` enum('Tersedia','Tidak tersedia') NOT NULL DEFAULT 'Tersedia',
  PRIMARY KEY (`id_kantong`),
  KEY `FK_darah_pendonoran` (`id_pendonoran`),
  CONSTRAINT `FK_darah_pendonoran` FOREIGN KEY (`id_pendonoran`) REFERENCES `pendonoran` (`id_pendonoran`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table bloodz.darah: ~120 rows (approximately)
INSERT INTO `darah` (`id_kantong`, `id_pendonoran`, `gol_darah`, `status`) VALUES
	('KA00001', 'DO00001', 'AB', 'Tidak tersedia'),
	('KA00002', 'DO00002', 'A', 'Tidak tersedia'),
	('KA00003', 'DO00003', 'B', 'Tidak tersedia'),
	('KA00004', 'DO00004', 'AB', 'Tersedia'),
	('KA00005', 'DO00005', 'O', 'Tidak tersedia'),
	('KA00006', 'DO00006', 'A', 'Tersedia'),
	('KA00007', 'DO00007', 'A', 'Tidak tersedia'),
	('KA00008', 'DO00008', 'B', 'Tidak tersedia'),
	('KA00009', 'DO00009', 'AB', 'Tersedia'),
	('KA00010', 'DO00010', 'B', 'Tidak tersedia'),
	('KA00011', 'DO00011', 'B', 'Tersedia'),
	('KA00012', 'DO00012', 'A', 'Tidak tersedia'),
	('KA00013', 'DO00013', 'A', 'Tersedia'),
	('KA00014', 'DO00014', 'O', 'Tidak tersedia'),
	('KA00015', 'DO00015', 'A', 'Tersedia'),
	('KA00016', 'DO00016', 'A', 'Tersedia'),
	('KA00017', 'DO00017', 'O', 'Tidak tersedia'),
	('KA00018', 'DO00018', 'A', 'Tersedia'),
	('KA00019', 'DO00019', 'B', 'Tersedia'),
	('KA00020', 'DO00020', 'AB', 'Tersedia'),
	('KA00021', 'DO00021', 'A', 'Tersedia'),
	('KA00022', 'DO00022', 'A', 'Tersedia'),
	('KA00023', 'DO00023', 'AB', 'Tersedia'),
	('KA00024', 'DO00024', 'O', 'Tidak tersedia'),
	('KA00025', 'DO00025', 'A', 'Tersedia'),
	('KA00026', 'DO00026', 'O', 'Tersedia'),
	('KA00027', 'DO00027', 'B', 'Tersedia'),
	('KA00028', 'DO00028', 'O', 'Tersedia'),
	('KA00029', 'DO00029', 'B', 'Tersedia'),
	('KA00030', 'DO00030', 'B', 'Tersedia'),
	('KA00031', 'DO00031', 'O', 'Tersedia'),
	('KA00032', 'DO00032', 'AB', 'Tersedia'),
	('KA00033', 'DO00033', 'B', 'Tersedia'),
	('KA00034', 'DO00034', 'O', 'Tersedia'),
	('KA00035', 'DO00035', 'O', 'Tersedia'),
	('KA00036', 'DO00036', 'O', 'Tersedia'),
	('KA00037', 'DO00037', 'O', 'Tersedia'),
	('KA00038', 'DO00038', 'A', 'Tersedia'),
	('KA00039', 'DO00039', 'O', 'Tersedia'),
	('KA00040', 'DO00040', 'AB', 'Tersedia'),
	('KA00041', 'DO00041', 'B', 'Tersedia'),
	('KA00042', 'DO00042', 'A', 'Tersedia'),
	('KA00043', 'DO00043', 'O', 'Tersedia'),
	('KA00044', 'DO00044', 'A', 'Tersedia'),
	('KA00045', 'DO00045', 'B', 'Tersedia'),
	('KA00046', 'DO00046', 'O', 'Tersedia'),
	('KA00047', 'DO00047', 'O', 'Tersedia'),
	('KA00048', 'DO00048', 'B', 'Tersedia'),
	('KA00049', 'DO00049', 'AB', 'Tersedia'),
	('KA00050', 'DO00050', 'A', 'Tersedia'),
	('KA00051', 'DO00051', 'O', 'Tersedia'),
	('KA00052', 'DO00052', 'O', 'Tersedia'),
	('KA00053', 'DO00053', 'A', 'Tersedia'),
	('KA00054', 'DO00054', 'B', 'Tersedia'),
	('KA00055', 'DO00055', 'O', 'Tersedia'),
	('KA00056', 'DO00056', 'O', 'Tersedia'),
	('KA00057', 'DO00057', 'AB', 'Tersedia'),
	('KA00058', 'DO00058', 'A', 'Tersedia'),
	('KA00059', 'DO00059', 'B', 'Tersedia'),
	('KA00060', 'DO00060', 'B', 'Tersedia'),
	('KA00061', 'DO00061', 'B', 'Tersedia'),
	('KA00062', 'DO00062', 'A', 'Tersedia'),
	('KA00063', 'DO00063', 'B', 'Tersedia'),
	('KA00064', 'DO00064', 'A', 'Tersedia'),
	('KA00065', 'DO00065', 'A', 'Tersedia'),
	('KA00066', 'DO00066', 'AB', 'Tersedia'),
	('KA00067', 'DO00067', 'A', 'Tersedia'),
	('KA00068', 'DO00068', 'O', 'Tersedia'),
	('KA00069', 'DO00069', 'AB', 'Tersedia'),
	('KA00070', 'DO00070', 'O', 'Tersedia'),
	('KA00071', 'DO00071', 'AB', 'Tersedia'),
	('KA00072', 'DO00072', 'O', 'Tersedia'),
	('KA00073', 'DO00073', 'A', 'Tersedia'),
	('KA00074', 'DO00074', 'O', 'Tersedia'),
	('KA00075', 'DO00075', 'AB', 'Tersedia'),
	('KA00076', 'DO00076', 'A', 'Tersedia'),
	('KA00077', 'DO00077', 'B', 'Tersedia'),
	('KA00078', 'DO00078', 'B', 'Tersedia'),
	('KA00079', 'DO00079', 'A', 'Tersedia'),
	('KA00080', 'DO00080', 'O', 'Tersedia'),
	('KA00081', 'DO00081', 'O', 'Tersedia'),
	('KA00082', 'DO00082', 'A', 'Tersedia'),
	('KA00083', 'DO00083', 'O', 'Tersedia'),
	('KA00084', 'DO00084', 'AB', 'Tersedia'),
	('KA00085', 'DO00085', 'A', 'Tersedia'),
	('KA00086', 'DO00086', 'AB', 'Tersedia'),
	('KA00087', 'DO00087', 'O', 'Tersedia'),
	('KA00088', 'DO00088', 'AB', 'Tersedia'),
	('KA00089', 'DO00089', 'A', 'Tersedia'),
	('KA00090', 'DO00090', 'O', 'Tersedia'),
	('KA00091', 'DO00091', 'O', 'Tersedia'),
	('KA00092', 'DO00092', 'B', 'Tersedia'),
	('KA00093', 'DO00093', 'B', 'Tersedia'),
	('KA00094', 'DO00094', 'B', 'Tersedia'),
	('KA00095', 'DO00095', 'O', 'Tersedia'),
	('KA00096', 'DO00096', 'B', 'Tersedia'),
	('KA00097', 'DO00097', 'A', 'Tersedia'),
	('KA00098', 'DO00098', 'O', 'Tersedia'),
	('KA00099', 'DO00099', 'AB', 'Tersedia'),
	('KA00100', 'DO00100', 'A', 'Tersedia'),
	('KA00101', 'DO00101', 'A', 'Tersedia'),
	('KA00102', 'DO00102', 'A', 'Tersedia'),
	('KA00103', 'DO00103', 'AB', 'Tersedia'),
	('KA00104', 'DO00104', 'B', 'Tersedia'),
	('KA00105', 'DO00105', 'O', 'Tersedia'),
	('KA00106', 'DO00106', 'O', 'Tersedia'),
	('KA00107', 'DO00107', 'O', 'Tersedia'),
	('KA00108', 'DO00108', 'O', 'Tersedia'),
	('KA00109', 'DO00109', 'A', 'Tersedia'),
	('KA00110', 'DO00110', 'AB', 'Tersedia'),
	('KA00111', 'DO00111', 'A', 'Tersedia'),
	('KA00112', 'DO00112', 'AB', 'Tersedia'),
	('KA00113', 'DO00113', 'O', 'Tersedia'),
	('KA00114', 'DO00114', 'A', 'Tersedia'),
	('KA00115', 'DO00115', 'AB', 'Tersedia'),
	('KA00116', 'DO00116', 'A', 'Tersedia'),
	('KA00117', 'DO00117', 'A', 'Tersedia'),
	('KA00118', 'DO00118', 'AB', 'Tersedia'),
	('KA00119', 'DO00119', 'A', 'Tersedia'),
	('KA00120', 'DO00120', 'B', 'Tersedia');

-- Dumping structure for table bloodz.pasien
CREATE TABLE IF NOT EXISTS `pasien` (
  `id_pasien` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `nama_pasien` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tgl_lahir` date NOT NULL,
  `alamat` varchar(191) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `no_tlp` varchar(13) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id_pasien`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table bloodz.pasien: ~16 rows (approximately)
INSERT INTO `pasien` (`id_pasien`, `nama_pasien`, `tgl_lahir`, `alamat`, `no_tlp`) VALUES
	('PA00001', 'Wadiiah Nurfadillah', '2001-05-12', 'Sepakat 1', '085112654903'),
	('PA00002', 'Arif Dwi Nugroho', '2003-06-13', 'Tanjung Raya 2', '085164987532'),
	('PA00003', 'Rizky Ramadhan', '2004-07-14', 'Serdam', '089766452062'),
	('PA00004', 'Natasya Melinda', '2003-04-16', 'Suwingyo', '089623514789'),
	('PA00005', 'Yahzee Oktaura Tarigan', '2002-12-04', 'Sungai Jawi', '089632154781'),
	('PA00006', 'Falaah Bintang Harahap', '2003-08-15', 'Karet', '082365478910'),
	('PA00007', 'Iqbal Fiqri Ramadhan', '2002-10-12', 'Rasau Jaya', '085465213689'),
	('PA00008', 'Fahryan Bagus Ananda', '2001-12-09', 'Rasau Jaya', '082164349752'),
	('PA00009', 'Adi Suryadi', '2003-05-14', 'Batang Tarang', '085154632697'),
	('PA00010', 'Rudiyat', '2003-11-30', 'Paris 1', '089753169752'),
	('PA00011', 'Aldo Atmaja', '2001-11-30', 'Gajah Mada', '089564716045'),
	('PA00012', 'Ayu Alda', '2003-01-09', 'Sepakat 2', '085643209688'),
	('PA00013', 'Meri Sriwijayanti', '1999-09-21', 'Budi Utomo', '089875236142'),
	('PA00014', 'Syarif Muhammad ', '2001-10-15', 'Jeruju', '089751233034'),
	('PA00015', 'Chika Meidiana', '1998-08-18', 'Sungai Rengas', '089631450034'),
	('PA00016', 'Abdullah', '2001-12-12', 'Pematang 7', '081234567890');

-- Dumping structure for table bloodz.pendonor
CREATE TABLE IF NOT EXISTS `pendonor` (
  `id_pendonor` varchar(11) NOT NULL,
  `nama_pendonor` varchar(50) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `alamat` varchar(191) DEFAULT NULL,
  `no_tlp` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`id_pendonor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table bloodz.pendonor: ~15 rows (approximately)
INSERT INTO `pendonor` (`id_pendonor`, `nama_pendonor`, `tgl_lahir`, `alamat`, `no_tlp`) VALUES
	('PE00001', 'Gubersu RajaGuguk', '2002-07-15', 'Sepakat 2', '086132647891'),
	('PE00002', 'Nasrul Aditiya', '2003-05-13', 'Tanjung Pura', '083120364946'),
	('PE00003', 'M Dedy R', '1999-01-01', 'Karya Baru', '086969696969'),
	('PE00004', 'Novia Safitri', '2003-02-12', 'Melawi', '089696969696'),
	('PE00005', 'Jidan', '2001-09-17', 'Imam Bonjol', '089647831245'),
	('PE00006', 'Ridho Setiawan', '2002-12-29', 'Putri Daranante', '089756200000'),
	('PE00007', 'Fajri Maulana', '2001-11-16', 'Siantan', '089147562022'),
	('PE00008', 'Weldy Flaminggo', '1997-02-18', 'Sungai Raya', '085132647890'),
	('PE00009', 'Faadillah Destia Fitri', '2000-01-01', 'Tanjung Raya 2', '089745130003'),
	('PE00010', 'Sharif Hidayat', '2002-03-12', 'Sintang', '089647410130'),
	('PE00011', 'Vendy Paulus Pratama', '2002-03-30', 'Kota Baru', '085465321900'),
	('PE00012', 'Hafiz Pratama', '2002-07-16', 'Perdana', '089743312301'),
	('PE00013', 'Muhammad Freza', '2003-08-17', 'Purnama', '084436201642'),
	('PE00014', 'Surma Asbi', '2003-05-15', 'Serdam', '089746031602'),
	('PE00015', 'Zidean Safwan', '2001-06-09', 'Kelansam', '085632147891');

-- Dumping structure for table bloodz.pendonoran
CREATE TABLE IF NOT EXISTS `pendonoran` (
  `id_pendonoran` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `id_pendonor` varchar(11) NOT NULL,
  `tgl_donor` date NOT NULL,
  PRIMARY KEY (`id_pendonoran`) USING BTREE,
  KEY `FK_pendonoran_pendonor` (`id_pendonor`),
  CONSTRAINT `FK_pendonoran_pendonor` FOREIGN KEY (`id_pendonor`) REFERENCES `pendonor` (`id_pendonor`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table bloodz.pendonoran: ~120 rows (approximately)
INSERT INTO `pendonoran` (`id_pendonoran`, `id_pendonor`, `tgl_donor`) VALUES
	('DO00001', 'PE00008', '2017-07-12'),
	('DO00002', 'PE00005', '2017-04-30'),
	('DO00003', 'PE00014', '2022-06-07'),
	('DO00004', 'PE00008', '2018-09-04'),
	('DO00005', 'PE00015', '2018-01-10'),
	('DO00006', 'PE00013', '2021-02-23'),
	('DO00007', 'PE00001', '2018-01-17'),
	('DO00008', 'PE00014', '2020-06-30'),
	('DO00009', 'PE00004', '2020-06-14'),
	('DO00010', 'PE00010', '2020-09-17'),
	('DO00011', 'PE00010', '2022-03-09'),
	('DO00012', 'PE00013', '2022-01-25'),
	('DO00013', 'PE00005', '2019-04-02'),
	('DO00014', 'PE00015', '2017-03-20'),
	('DO00015', 'PE00001', '2022-09-22'),
	('DO00016', 'PE00013', '2020-08-17'),
	('DO00017', 'PE00011', '2019-04-28'),
	('DO00018', 'PE00001', '2017-02-10'),
	('DO00019', 'PE00006', '2020-05-16'),
	('DO00020', 'PE00012', '2021-11-18'),
	('DO00021', 'PE00009', '2017-08-28'),
	('DO00022', 'PE00013', '2018-06-28'),
	('DO00023', 'PE00012', '2017-08-28'),
	('DO00024', 'PE00015', '2021-11-19'),
	('DO00025', 'PE00013', '2022-01-03'),
	('DO00026', 'PE00015', '2020-07-02'),
	('DO00027', 'PE00006', '2019-03-08'),
	('DO00028', 'PE00015', '2019-05-09'),
	('DO00029', 'PE00002', '2017-03-20'),
	('DO00030', 'PE00006', '2022-08-13'),
	('DO00031', 'PE00011', '2021-11-22'),
	('DO00032', 'PE00008', '2022-07-09'),
	('DO00033', 'PE00010', '2017-10-05'),
	('DO00034', 'PE00015', '2022-05-22'),
	('DO00035', 'PE00011', '2019-09-28'),
	('DO00036', 'PE00003', '2017-05-06'),
	('DO00037', 'PE00015', '2018-03-26'),
	('DO00038', 'PE00001', '2018-06-08'),
	('DO00039', 'PE00011', '2021-01-12'),
	('DO00040', 'PE00012', '2018-11-29'),
	('DO00041', 'PE00010', '2020-08-26'),
	('DO00042', 'PE00001', '2022-11-20'),
	('DO00043', 'PE00003', '2021-10-11'),
	('DO00044', 'PE00005', '2019-08-08'),
	('DO00045', 'PE00014', '2021-05-01'),
	('DO00046', 'PE00007', '2020-01-14'),
	('DO00047', 'PE00007', '2017-06-03'),
	('DO00048', 'PE00006', '2019-01-26'),
	('DO00049', 'PE00008', '2020-04-25'),
	('DO00050', 'PE00009', '2021-02-18'),
	('DO00051', 'PE00003', '2021-01-24'),
	('DO00052', 'PE00003', '2021-03-09'),
	('DO00053', 'PE00005', '2022-05-25'),
	('DO00054', 'PE00002', '2019-10-20'),
	('DO00055', 'PE00015', '2019-07-04'),
	('DO00056', 'PE00007', '2019-03-07'),
	('DO00057', 'PE00012', '2022-01-31'),
	('DO00058', 'PE00013', '2022-05-20'),
	('DO00059', 'PE00002', '2017-02-24'),
	('DO00060', 'PE00002', '2022-07-17'),
	('DO00061', 'PE00014', '2017-06-13'),
	('DO00062', 'PE00001', '2020-10-15'),
	('DO00063', 'PE00010', '2018-11-16'),
	('DO00064', 'PE00005', '2017-06-14'),
	('DO00065', 'PE00001', '2017-01-19'),
	('DO00066', 'PE00004', '2017-09-05'),
	('DO00067', 'PE00009', '2017-06-23'),
	('DO00068', 'PE00011', '2020-09-17'),
	('DO00069', 'PE00012', '2021-03-03'),
	('DO00070', 'PE00015', '2021-09-20'),
	('DO00071', 'PE00008', '2019-01-13'),
	('DO00072', 'PE00015', '2018-01-12'),
	('DO00073', 'PE00009', '2019-10-25'),
	('DO00074', 'PE00007', '2019-02-22'),
	('DO00075', 'PE00004', '2020-11-01'),
	('DO00076', 'PE00005', '2018-11-28'),
	('DO00077', 'PE00002', '2017-10-06'),
	('DO00078', 'PE00014', '2022-04-18'),
	('DO00079', 'PE00005', '2022-10-26'),
	('DO00080', 'PE00007', '2018-01-14'),
	('DO00081', 'PE00015', '2021-08-05'),
	('DO00082', 'PE00005', '2021-01-10'),
	('DO00083', 'PE00003', '2021-01-02'),
	('DO00084', 'PE00004', '2020-07-01'),
	('DO00085', 'PE00005', '2019-01-16'),
	('DO00086', 'PE00008', '2019-11-15'),
	('DO00087', 'PE00011', '2019-02-26'),
	('DO00088', 'PE00008', '2020-01-13'),
	('DO00089', 'PE00013', '2018-06-14'),
	('DO00090', 'PE00015', '2017-09-30'),
	('DO00091', 'PE00007', '2017-08-08'),
	('DO00092', 'PE00010', '2021-02-17'),
	('DO00093', 'PE00006', '2018-10-17'),
	('DO00094', 'PE00002', '2018-01-28'),
	('DO00095', 'PE00003', '2020-03-13'),
	('DO00096', 'PE00014', '2017-11-02'),
	('DO00097', 'PE00001', '2019-05-01'),
	('DO00098', 'PE00007', '2020-02-23'),
	('DO00099', 'PE00004', '2019-02-10'),
	('DO00100', 'PE00005', '2022-04-14'),
	('DO00101', 'PE00001', '2023-01-08'),
	('DO00102', 'PE00001', '2017-08-29'),
	('DO00103', 'PE00004', '2022-11-01'),
	('DO00104', 'PE00006', '2019-11-05'),
	('DO00105', 'PE00007', '2017-06-14'),
	('DO00106', 'PE00003', '2019-09-03'),
	('DO00107', 'PE00011', '2022-07-26'),
	('DO00108', 'PE00011', '2020-10-01'),
	('DO00109', 'PE00001', '2020-11-18'),
	('DO00110', 'PE00012', '2017-08-25'),
	('DO00111', 'PE00013', '2020-05-04'),
	('DO00112', 'PE00004', '2017-01-28'),
	('DO00113', 'PE00015', '2017-03-16'),
	('DO00114', 'PE00009', '2017-05-29'),
	('DO00115', 'PE00012', '2020-06-10'),
	('DO00116', 'PE00009', '2019-05-18'),
	('DO00117', 'PE00013', '2020-08-14'),
	('DO00118', 'PE00004', '2022-04-13'),
	('DO00119', 'PE00001', '2022-07-31'),
	('DO00120', 'PE00006', '2017-08-29');

-- Dumping structure for table bloodz.pengambilan
CREATE TABLE IF NOT EXISTS `pengambilan` (
  `id_pengambilan` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `id_kantong` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `id_pasien` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tgl_ambil` date NOT NULL,
  PRIMARY KEY (`id_pengambilan`) USING BTREE,
  KEY `FK_pengambilan_darah` (`id_kantong`),
  KEY `FK_pengambilan_pasien` (`id_pasien`),
  CONSTRAINT `FK_pengambilan_darah` FOREIGN KEY (`id_kantong`) REFERENCES `darah` (`id_kantong`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_pengambilan_pasien` FOREIGN KEY (`id_pasien`) REFERENCES `pasien` (`id_pasien`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table bloodz.pengambilan: ~16 rows (approximately)
INSERT INTO `pengambilan` (`id_pengambilan`, `id_kantong`, `id_pasien`, `tgl_ambil`) VALUES
	('AM00001', 'KA00009', 'PA00009', '2023-01-15'),
	('AM00002', 'KA00012', 'PA00011', '2023-01-16'),
	('AM00003', 'KA00008', 'PA00002', '2023-01-17'),
	('AM00004', 'KA00014', 'PA00012', '2023-01-18'),
	('AM00005', 'KA00002', 'PA00015', '2023-01-19'),
	('AM00006', 'KA00003', 'PA00006', '2023-01-20'),
	('AM00007', 'KA00005', 'PA00007', '2023-01-21'),
	('AM00008', 'KA00004', 'PA00004', '2023-01-22'),
	('AM00009', 'KA00006', 'PA00013', '2023-01-23'),
	('AM00010', 'KA00008', 'PA00003', '2023-01-24'),
	('AM00011', 'KA00017', 'PA00010', '2023-01-25'),
	('AM00012', 'KA00007', 'PA00014', '2023-01-26'),
	('AM00013', 'KA00010', 'PA00001', '2023-01-27'),
	('AM00014', 'KA00024', 'PA00005', '2023-01-28'),
	('AM00015', 'KA00001', 'PA00008', '2023-01-29'),
	('AM00016', 'KA00014', 'PA00016', '2023-01-30');

-- Dumping structure for table bloodz.user
CREATE TABLE IF NOT EXISTS `user` (
  `id_user` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table bloodz.user: ~4 rows (approximately)
INSERT INTO `user` (`id_user`, `username`, `password`) VALUES
	('U00001', 'Diva3a', '1ac08b06e449b6e0bd52bd5b272f3da8'),
	('U00002', 'Sabakti3a', 'a56eee9bbcda46665a2c26ee2bf149f8'),
	('U00003', 'lita3a', 'd6022249ddb33ec5a4e89e31df57cc67'),
	('U00004', 'firman3a', 'fc7cae23c90d5cd6ceb06aa1e6e3e273');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
