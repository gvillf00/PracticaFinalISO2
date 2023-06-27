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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="tblclientesdirecciones")
public class Direcciones implements Serializable {
  
    
   @Id //que indica que la columna es un identificador único
    @GeneratedValue(strategy=GenerationType.IDENTITY) //le decimos que es un autonumérico
    private int IdClienteDireccion; //aquí no hace falta poner la columna de la tabla a la que se refiere porque ya decimos que es la clave principal. 
    
    @ManyToOne
    @JoinColumn(name="IdCliente")
  
    private Clientes idcliente;
    @Column(name="TituloDireccion")
    private String TituloDireccion;
    @Column(name="Direccion")
    private String Direccion;
    @Column(name="CP")
    private String cp;
    @Column(name="Municipio")
    private String municipio;
    @Column(name="Provincia")    
    private String provincia;

    public int getIdDireccion() {
        return IdClienteDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.IdClienteDireccion = idDireccion;
    }

    public Clientes getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Clientes idcliente) {
        this.idcliente = idcliente;
    }

    public String getTituloDireccion() {
        return TituloDireccion;
    }

    public void setTituloDireccion(String TituloDireccion) {
        this.TituloDireccion = TituloDireccion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
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
        int hash = 7;
        hash = 97 * hash + this.IdClienteDireccion;
        hash = 97 * hash + Objects.hashCode(this.idcliente);
        hash = 97 * hash + Objects.hashCode(this.TituloDireccion);
        hash = 97 * hash + Objects.hashCode(this.Direccion);
        hash = 97 * hash + Objects.hashCode(this.cp);
        hash = 97 * hash + Objects.hashCode(this.municipio);
        hash = 97 * hash + Objects.hashCode(this.provincia);
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
        final Direcciones other = (Direcciones) obj;
        if (this.IdClienteDireccion != other.IdClienteDireccion) {
            return false;
        }
        if (!Objects.equals(this.TituloDireccion, other.TituloDireccion)) {
            return false;
        }
        if (!Objects.equals(this.Direccion, other.Direccion)) {
            return false;
        }
        if (!Objects.equals(this.cp, other.cp)) {
            return false;
        }
        if (!Objects.equals(this.municipio, other.municipio)) {
            return false;
        }
        if (!Objects.equals(this.provincia, other.provincia)) {
            return false;
        }
        if (!Objects.equals(this.idcliente, other.idcliente)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Direcciones{" + "idDireccion=" + IdClienteDireccion + ", idcliente=" + idcliente + ", TituloDireccion=" + TituloDireccion + ", Direccion=" + Direccion + ", cp=" + cp + ", municipio=" + municipio + ", provincia=" + provincia + '}';
    }

   
    
}
