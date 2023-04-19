/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jmvm_
 */
@Entity
@Table(name="tblclientes")
public class Clientes implements Serializable {
    
    @Id //que indica que la columna es un identificador único
    @GeneratedValue(strategy=GenerationType.IDENTITY) //le decimos que es un autonomúerico
    private int idCliente; //aquí no hace falta poner la columna de la tabla a la que se
    
    /*
    //Datos de las columnas de las tablas
      `IdCliente` int NOT NULL AUTO_INCREMENT,
  `CIF` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `NombreCliente` varchar(300) NOT NULL,
  `Pais` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT 'ESPAÑA',
  `Mail` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Teléfono` varchar(300) DEFAULT NULL,
  `FechaAlta` datetime DEFAULT CURRENT_TIMESTAMP,
  `Activo` tinyint(1) DEFAULT '1',
  `User` varchar(50) NOT NULL,
  `Clave` varchar(20) NOT NULL,
    */
}
