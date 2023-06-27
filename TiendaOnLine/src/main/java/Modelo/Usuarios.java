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


@Entity //importante para que en el paquete EJB cuando con el asistente nos cree las clases de código básico (insert, edit, remove...)
@Table(name="tblfamilias")
public class Usuarios implements Serializable {
    
    @Id //que indica que la columna es un identificador único
    @GeneratedValue(strategy=GenerationType.IDENTITY) //le decimos que es un autonumérico
    private int idUsuario;
      @Column(name="User")
    private String User;
        @Column(name="Clave")
    private String clave;
          @Column(name="Activo")
    private boolean activo;

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getUser() {
        return User;
    }

    public String getClave() {
        return clave;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.idUsuario;
        hash = 47 * hash + Objects.hashCode(this.User);
        hash = 47 * hash + Objects.hashCode(this.clave);
        hash = 47 * hash + (this.activo ? 1 : 0);
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
        final Usuarios other = (Usuarios) obj;
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        if (this.activo != other.activo) {
            return false;
        }
        if (!Objects.equals(this.User, other.User)) {
            return false;
        }
        if (!Objects.equals(this.clave, other.clave)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "idUsuario=" + idUsuario + ", User=" + User + ", clave=" + clave + ", activo=" + activo + '}';
    }
     
           
          
          
    
}
