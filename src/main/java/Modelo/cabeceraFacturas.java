/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author jmvm_
 */
@Entity
@Table(name="tblfacturaslineasclientes")
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
     
   
    @JoinColumn(name="IdProducto")
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

    public int getIdFacturaLineaCliente() {
        return idFacturaLineaCliente;
    }

    public int getIdFacturaCabeceraCliente() {
        return idFacturaCabeceraCliente;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public float getDescuento() {
        return descuento;
    }

    public float getImporteTotalSinIva() {
        return importeTotalSinIva;
    }

    public float getIva() {
        return Iva;
    }

    public float getImporteTotalConIva() {
        return ImporteTotalConIva;
    }

    public void setIdFacturaLineaCliente(int idFacturaLineaCliente) {
        this.idFacturaLineaCliente = idFacturaLineaCliente;
    }

    public void setIdFacturaCabeceraCliente(int idFacturaCabeceraCliente) {
        this.idFacturaCabeceraCliente = idFacturaCabeceraCliente;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public void setImporteTotalSinIva(float importeTotalSinIva) {
        this.importeTotalSinIva = importeTotalSinIva;
    }

    public void setIva(float Iva) {
        this.Iva = Iva;
    }

    public void setImporteTotalConIva(float ImporteTotalConIva) {
        this.ImporteTotalConIva = ImporteTotalConIva;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.idFacturaLineaCliente;
        hash = 53 * hash + this.idFacturaCabeceraCliente;
        hash = 53 * hash + this.idProducto;
        hash = 53 * hash + this.cantidad;
        hash = 53 * hash + Float.floatToIntBits(this.precio);
        hash = 53 * hash + Float.floatToIntBits(this.descuento);
        hash = 53 * hash + Float.floatToIntBits(this.importeTotalSinIva);
        hash = 53 * hash + Float.floatToIntBits(this.Iva);
        hash = 53 * hash + Float.floatToIntBits(this.ImporteTotalConIva);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final cabeceraFacturas other = (cabeceraFacturas) obj;
        if (this.idFacturaLineaCliente != other.idFacturaLineaCliente) {
            return false;
        }
        if (this.idFacturaCabeceraCliente != other.idFacturaCabeceraCliente) {
            return false;
        }
        if (this.idProducto != other.idProducto) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (Float.floatToIntBits(this.precio) != Float.floatToIntBits(other.precio)) {
            return false;
        }
        if (Float.floatToIntBits(this.descuento) != Float.floatToIntBits(other.descuento)) {
            return false;
        }
        if (Float.floatToIntBits(this.importeTotalSinIva) != Float.floatToIntBits(other.importeTotalSinIva)) {
            return false;
        }
        if (Float.floatToIntBits(this.Iva) != Float.floatToIntBits(other.Iva)) {
            return false;
        }
        if (Float.floatToIntBits(this.ImporteTotalConIva) != Float.floatToIntBits(other.ImporteTotalConIva)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cabeceraFacturas{" + "idFacturaLineaCliente=" + idFacturaLineaCliente + ", idFacturaCabeceraCliente=" + idFacturaCabeceraCliente + ", idProducto=" + idProducto + ", cantidad=" + cantidad + ", precio=" + precio + ", descuento=" + descuento + ", importeTotalSinIva=" + importeTotalSinIva + ", Iva=" + Iva + ", ImporteTotalConIva=" + ImporteTotalConIva + '}';
    }
            
}
