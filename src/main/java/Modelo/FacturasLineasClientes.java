/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jmvm_
 */

@Entity
@Table(name="tblfacturascabeceraclientes")
public class FacturasLineasClientes implements Serializable {
    /**
     *  `IdFacturaCabeceraClientes` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '',
  `IdCliente` int NOT NULL DEFAULT '0',
  `IdClienteDireccion` int NOT NULL DEFAULT '0',
  `Fecha` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Comentarios` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`IdFacturaCabeceraClientes`) USING BTREE,
  KEY `FK_tblfacturascabeceraclientes` (`IdCliente`) USING BTREE,
  KEY `FK_tblfacturascabeceraclientes_tblalmacenes` (`IdClienteDireccion`) USING BTREE,
  CONSTRAINT `FK_tblfacturascabeceraclientes_tblck¡lientes` FOREIGN KEY (`IdCliente`) REFERENCES `tblclientes` (`IdCliente`),
  CONSTRAINT `FK_tblfacturascabeceraclientes_tblclientesdirecciones` FOREIGN KEY (`IdClienteDireccion`) REFERENCES `tblclientesdirecciones` (`IdClienteDireccion`)
     */
    
    @Id //que indica que la columna es un identificador único
     @GeneratedValue(strategy=GenerationType.IDENTITY) //le decimos que es un autonomúerico 
     private int idfacturacabecera;
    @JoinColumn(name="idCliente")
    @OneToMany
    private int idCliente;
    @JoinColumn(name="idClienteDireccion")
    @OneToMany
    private int idClienteDireccion;
    @Column(name="Fecha")
    Date fecha;
     @Column(name="Comentarios")
    private String comentarios;

    public int getIdfacturacabecera() {
        return idfacturacabecera;
    }

    public void setIdfacturacabecera(int idfacturacabecera) {
        this.idfacturacabecera = idfacturacabecera;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdClienteDireccion() {
        return idClienteDireccion;
    }

    public void setIdClienteDireccion(int idClienteDireccion) {
        this.idClienteDireccion = idClienteDireccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.idfacturacabecera;
        hash = 29 * hash + this.idCliente;
        hash = 29 * hash + this.idClienteDireccion;
        hash = 29 * hash + Objects.hashCode(this.fecha);
        hash = 29 * hash + Objects.hashCode(this.comentarios);
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
        final FacturasLineasClientes other = (FacturasLineasClientes) obj;
        if (this.idfacturacabecera != other.idfacturacabecera) {
            return false;
        }
        if (this.idCliente != other.idCliente) {
            return false;
        }
        if (this.idClienteDireccion != other.idClienteDireccion) {
            return false;
        }
        if (!Objects.equals(this.comentarios, other.comentarios)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FacturasLineasClientes{" + "idfacturacabecera=" + idfacturacabecera + ", idCliente=" + idCliente + ", idClienteDireccion=" + idClienteDireccion + ", fecha=" + fecha + ", comentarios=" + comentarios + '}';
    }
     
     
     
     
}
