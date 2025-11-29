/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  NBBS
 */

CREATE DATABASE IF NOT EXISTS teleton2025;
USE teleton2025;

CREATE TABLE donacion (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT, 
    empresa VARCHAR(45) NOT NULL,
    monto INTEGER NOT NULL,
    PRIMARY KEY (id)
);

/*
Agrega algunos registros
*/
INSERT INTO donacion(empresa, monto) VALUES ('Telcosud', 1000000000);
INSERT INTO donacion(empresa, monto) VALUES ('Chantel', 150000000);
INSERT INTO donacion(empresa, monto) VALUES ('Moristar', 80000000);
INSERT INTO donacion(empresa, monto) VALUES ('Caiossi', 340000000);



