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
import javax.persistence.Table;

@Entity
@Table(name="tblUsuariosAdmin")
public class Administradores implements Serializable {
     @Id //que indica que la columna es un identificador único
    @GeneratedValue(strategy=GenerationType.IDENTITY) //le decimos que es un autonomúerico
     private int IdUsuariosAdmin;
      @Column(name="User")
     private String usuario;
       @Column(name="Clave")
     private String contrasena;
        @Column(name="Activo")
     private boolean activo;
        @Column(name="EsAdmin")
     private boolean esadmin;

    public boolean isEsadmin() {
        return esadmin;
    }

    public void setEsadmin(boolean esadmin) {
        this.esadmin = esadmin;
    }

    public int getIdUsuariosAdmin() {
        return IdUsuariosAdmin;
    }

    public void setIdUsuariosAdmin(int IdUsuariosAdmin) {
        this.IdUsuariosAdmin = IdUsuariosAdmin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.IdUsuariosAdmin;
        hash = 59 * hash + Objects.hashCode(this.usuario);
        hash = 59 * hash + Objects.hashCode(this.contrasena);
        hash = 59 * hash + (this.activo ? 1 : 0);
        hash = 59 * hash + (this.esadmin ? 1 : 0);
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
        final Administradores other = (Administradores) obj;
        if (this.IdUsuariosAdmin != other.IdUsuariosAdmin) {
            return false;
        }
        if (this.activo != other.activo) {
            return false;
        }
        if (this.esadmin != other.esadmin) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.contrasena, other.contrasena)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Administradores{" + "IdUsuariosAdmin=" + IdUsuariosAdmin + ", usuario=" + usuario + ", contrasena=" + contrasena + ", activo=" + activo + ", esadmin=" + esadmin + '}';
    }

   
  

   
}
