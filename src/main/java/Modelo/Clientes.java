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
    @Column(name="CIF")
    private String CIF;
    @Column(name="NombreCliente")
    private String nombreCliente;
    @Column(name="Pais")
    private String pais;
    @Column(name="Mail")
    private String mail;
    @Column(name="Telefono")
    private String telefono;
     @Column(name="FechaAlta")
    private Date FechaAlta;
     @Column(name="Activo")
    private boolean activo;
      @Column(name="User")
    private String user;
       @Column(name="Clave")
    private String clave;

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.idCliente;
        hash = 59 * hash + Objects.hashCode(this.CIF);
        hash = 59 * hash + Objects.hashCode(this.nombreCliente);
        hash = 59 * hash + Objects.hashCode(this.pais);
        hash = 59 * hash + Objects.hashCode(this.mail);
        hash = 59 * hash + Objects.hashCode(this.telefono);
        hash = 59 * hash + Objects.hashCode(this.FechaAlta);
        hash = 59 * hash + Objects.hashCode(this.activo);
        hash = 59 * hash + Objects.hashCode(this.user);
        hash = 59 * hash + Objects.hashCode(this.clave);
        return hash;
    }

    @Override
    public String toString() {
        return "Clientes{" + "idCliente=" + idCliente + ", CIF=" + CIF + ", nombreCliente=" + nombreCliente + ", pais=" + pais + ", mail=" + mail + ", telefono=" + telefono + ", FechaAlta=" + FechaAlta + ", activo=" + activo + ", user=" + user + ", clave=" + clave + '}';
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
        final Clientes other = (Clientes) obj;
        if (this.idCliente != other.idCliente) {
            return false;
        }
        if (!Objects.equals(this.CIF, other.CIF)) {
            return false;
        }
        if (!Objects.equals(this.nombreCliente, other.nombreCliente)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        if (!Objects.equals(this.mail, other.mail)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.clave, other.clave)) {
            return false;
        }
        if (!Objects.equals(this.FechaAlta, other.FechaAlta)) {
            return false;
        }
        if (!Objects.equals(this.activo, other.activo)) {
            return false;
        }
        return true;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaAlta(Date FechaAlta) {
        this.FechaAlta = FechaAlta;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
       


    public int getIdCliente() {
        return idCliente;
    }

    public String getCIF() {
        return CIF;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getPais() {
        return pais;
    }

    public String getMail() {
        return mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public Date getFechaAlta() {
        return FechaAlta;
    }

    public boolean getActivo() {
        return activo;
    }

    public String getUser() {
        return user;
    }

    public String getClave() {
        return clave;
    }
}
