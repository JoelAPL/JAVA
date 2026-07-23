-- ============================================================
-- Sistema de Gestion Hospital
-- Est: Joel Alvarez  |  Cedula: 8-10-141396  |  Grupo: 1GS222
-- Prof: Ricardo Chan  |  Desarrollo de Software III
-- Universidad Tecnologica de Panama
-- Fecha: 26/07/2026
-- ============================================================

CREATE DATABASE IF NOT EXISTS `20261_1gs222`;
USE `20261_1gs222`;

DROP TABLE IF EXISTS `medico`;
DROP TABLE IF EXISTS `paciente`;

CREATE TABLE `paciente` (
  `id`        INT         NOT NULL AUTO_INCREMENT,
  `cedula`    VARCHAR(15) NOT NULL,
  `nombre`    VARCHAR(30),
  `apellido`  VARCHAR(30),
  `direccion` VARCHAR(50),
  `telefono`  VARCHAR(7),
  `provincia` VARCHAR(20),
  `edad`      INT,
  `sexo`      CHAR(1),
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_cedula` (`cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `medico` (
  `id`              INT         NOT NULL AUTO_INCREMENT,
  `codigo`          VARCHAR(4)  NOT NULL,
  `cedula`          VARCHAR(15),
  `nombre`          VARCHAR(20),
  `apellido`        VARCHAR(20),
  `direccion`       VARCHAR(50),
  `telefono`        VARCHAR(7),
  `especialidad`    VARCHAR(20),
  `pacientes_mes`   INT,
  `pacientes_anual` INT,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_codigo` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------
-- Datos de prueba: Pacientes (10 registros)
-- ----------------------
INSERT INTO `paciente` (cedula,nombre,apellido,direccion,telefono,provincia,edad,sexo) VALUES
('8-100-1234','Ana',    'Rodriguez','Calle Primera, Panama','2220001','Panama',   35,'F'),
('4-220-5678','Carlos', 'Mendez',   'Av Central, Colon',   '4410002','Colon',    42,'M'),
('6-300-9012','Maria',  'Gomez',    'Calle Sur, Chiriqui',  '7730003','Chiriqui', 28,'F'),
('3-150-3456','Luis',   'Perez',    'Av Norte, Veraguas',   '9980004','Veraguas', 55,'M'),
('2-200-7890','Sofia',  'Torres',   'Calle Este, Cocle',    '9910005','Cocle',    19,'F'),
('7-250-2345','Juan',   'Vargas',   'Av Sur, Los Santos',   '9950006','Los Santos',63,'M'),
('5-180-6789','Rosa',   'Herrera',  'Calle Oeste, Herrera', '9960007','Herrera',  47,'F'),
('9-160-1122','Pedro',  'Castro',   'Av Rio Hato, Cocle',   '9970008','Cocle',    31,'M'),
('1-140-3344','Marta',  'Fuentes',  'Calle Penonome, Cocle','9920009','Cocle',    38,'F'),
('8-120-5566','Diego',  'Solis',    'Av Balboa, Panama',    '2020010','Panama',   25,'M');

-- ----------------------
-- Datos de prueba: Medicos (10 registros)
-- ----------------------
INSERT INTO `medico` (codigo,cedula,nombre,apellido,direccion,telefono,especialidad,pacientes_mes,pacientes_anual) VALUES
('M001','8-200-0001','Roberto','Arias',    'Policlinica Central', '2660001','Cardiologia',   120,1440),
('M002','4-300-0002','Lucia',  'Mora',     'Hospital Regional',   '4470002','Pediatria',      90,1080),
('M003','6-400-0003','Andres', 'Ruiz',     'Clinica Colon',       '4490003','Neurologia',     80, 960),
('M004','3-500-0004','Carmen', 'Diaz',     'MINSA Chiriqui',      '7740004','Ginecologia',   100,1200),
('M005','2-600-0005','Mario',  'Leon',     'Policlinica Cocle',   '9910005','Cirugia',       110,1320),
('M006','7-700-0006','Diana',  'Vega',     'Hospital Herrera',    '9960006','Traumatologia',  75, 900),
('M007','5-800-0007','Hector', 'Pena',     'Clinica Veraguas',    '9980007','Dermatologia',   85,1020),
('M008','9-900-0008','Gloria', 'Rios',     'Hospital Los Santos', '9950008','Medicina Interna',95,1140),
('M009','1-101-0009','Pablo',  'Soto',     'MINSA Panama',        '2030009','Oncologia',      70, 840),
('M010','8-102-0010','Elena',  'Cruz',     'Clinica Central',     '2040010','Radiologia',     88,1056);
