/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author jmvm_
 */
public class cabeceraFacturas implements Serializable {
    /**
     * `IdFacturaLineaCliente` int NOT NULL AUTO_INCREMENT,
  `IdFacturaCabeceraCliente` varchar(12) NOT NULL DEFAULT '0',
  `IdProducto` int NOT NULL DEFAULT '0',
  `Cantidad` int NOT NULL DEFAULT '0',
  `Precio` decimal(20,6) NOT NULL DEFAULT '0.000000',
  `Dto` decimal(20,6) DEFAULT '0.000000',
  `ImporteTotalSinIVA` decimal(20,6) NOT NULL DEFAULT '0.000000',
  `IVA` decimal(20,6) NOT NULL DEFAULT '0.000000',
  `ImporteTotalConIVA` decimal(20,6) NOT NULL DEFAULT '0.000000',
  PRIMARY KEY (`IdFacturaLineaCliente`),
  KEY `FK_tblfacturaslineasclientes_tblfacturascabeceraclientes` (`IdFacturaCabeceraCliente`),
  KEY `FK_tblfacturaslineasclientes_tblproductos` (`IdProducto`),
  CONSTRAINT `FK_tblfacturaslineasclientes_tblfacturascabeceraclientes` FOREIGN KEY (`IdFacturaCabeceraCliente`) REFERENCES `tblfacturascabeceraclientes` (`IdFacturaCabeceraClientes`),
  CONSTRAINT `FK_tblfacturaslineasclientes_tblproductos` FOREIGN KEY (`IdProducto`) REFERENCES `tblproductos` (`IdProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

     */
    
     @Id //que indica que la columna es un identificador único
     @GeneratedValue(strategy=GenerationType.IDENTITY) //le decimos que es un autonomúerico 
    private int idFacturaLineaCliente;
    @JoinColumn(name="idCliente")
    @OneToOne 
    private int idFacturaCabeceraCliente;
     @JoinColumn(name="idProducto")
    @OneToMany
    private int idProducto;
     @Column(name="Cantidad")
    private int cantidad;
     @Column(name="Precio")
    private float precio;
     @Column(name="Dto")
    private float descuento;
     @Column(name="ImporteTotalSinIVA")
    private float importeTotalSinIva;
     @Column(name="IVA")
    private float Iva;
     @Column(name="ImporteTotalConIVA")
    private float ImporteTotalConIva;
            
}