/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
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
@Table(name="tblclientesdirecciones")
public class DireccionesClientes implements Serializable{
    /**
     * `IdClienteDireccion` int NOT NULL AUTO_INCREMENT,
  `IdCliente` int NOT NULL,
  `TituloDireccion` varchar(100) NOT NULL DEFAULT '',
  `Direccion` varchar(200) NOT NULL DEFAULT '',
  `CP` varchar(10) NOT NULL DEFAULT '',
  `Municipio` varchar(100) NOT NULL DEFAULT '',
  `Provincia` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`IdClienteDireccion`),
  KEY `FK_tblclientesdirecciones_tblclientes` (`IdCliente`),
  CONSTRAINT `FK_tblclientesdirecciones_tblclientes` FOREIGN KEY (`IdCliente`) REFERENCES `tblclientes` (`IdCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
     */
  @Id //que indica que la columna es un identificador único
  @GeneratedValue(strategy=GenerationType.IDENTITY) //le decimos que es un autonomúerico   
 private int idDireccion;
  @JoinColumn(name="idClienteDireccion")
  @OneToMany
 private int idCliente;
   @Column(name="tituloDireccion")
 private String tituloDireccion;
    @Column(name="direccion")
     
 private String direccion;
     @Column(name="CP")
 private String codigo_postal;
      @Column(name="Municipio")
 private String municipio;
       @Column(name="Provincia")
 private String provincia;

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTituloDireccion() {
        return tituloDireccion;
    }

    public void setTituloDireccion(String tituloDireccion) {
        this.tituloDireccion = tituloDireccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.idDireccion;
        hash = 59 * hash + this.idCliente;
        hash = 59 * hash + Objects.hashCode(this.tituloDireccion);
        hash = 59 * hash + Objects.hashCode(this.direccion);
        hash = 59 * hash + Objects.hashCode(this.codigo_postal);
        hash = 59 * hash + Objects.hashCode(this.municipio);
        hash = 59 * hash + Objects.hashCode(this.provincia);
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
        final DireccionesClientes other = (DireccionesClientes) obj;
        if (this.idDireccion != other.idDireccion) {
            return false;
        }
        if (this.idCliente != other.idCliente) {
            return false;
        }
        if (!Objects.equals(this.tituloDireccion, other.tituloDireccion)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.codigo_postal, other.codigo_postal)) {
            return false;
        }
        if (!Objects.equals(this.municipio, other.municipio)) {
            return false;
        }
        if (!Objects.equals(this.provincia, other.provincia)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DireccionesClientes{" + "idDireccion=" + idDireccion + ", idCliente=" + idCliente + ", tituloDireccion=" + tituloDireccion + ", direccion=" + direccion + ", codigo_postal=" + codigo_postal + ", municipio=" + municipio + ", provincia=" + provincia + '}';
    }
 
 
}