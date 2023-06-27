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


//siempre va con dos etiquetas qeu es una entidad y otra que le dice que es una tabla de la bbdd
//mayus + control + i para importar rápido
@Entity //importante para que en el paquete EJB cuando con el asistente nos cree las clases de código básico (insert, edit, remove...)
@Table(name="tblfamilias")

public class Familias implements Serializable {
    
    @Id //que indica que la columna es un identificador único
    @GeneratedValue(strategy=GenerationType.IDENTITY) //le decimos que es un autonumérico
    private int idFamilia; //aquí no hace falta poner la columna de la tabla a la que se refiere porque ya decimos que es la clave principal.
    
    @Column(name="CodigoFamilia")
    private String CodigoFamilia;
    
    @Column(name="Familia")
    private String Familia;
    
    @Column(name="Activo")
    private boolean activo;

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getCodigoFamilia() {
        return CodigoFamilia;
    }

    public void setCodigoFamilia(String CodigoFamilia) {
        this.CodigoFamilia = CodigoFamilia;
    }

    public String getFamilia() {
        return Familia;
    }

    public void setFamilia(String Familia) {
        this.Familia = Familia;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.idFamilia;
        hash = 13 * hash + Objects.hashCode(this.CodigoFamilia);
        hash = 13 * hash + Objects.hashCode(this.Familia);
        hash = 13 * hash + (this.activo ? 1 : 0);
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
        final Familias other = (Familias) obj;
        if (this.idFamilia != other.idFamilia) {
            return false;
        }
        if (this.activo != other.activo) {
            return false;
        }
        if (!Objects.equals(this.CodigoFamilia, other.CodigoFamilia)) {
            return false;
        }
        if (!Objects.equals(this.Familia, other.Familia)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "Familias{" + "idFamilia=" + idFamilia + ", CodigoFamilia=" + CodigoFamilia + ", Familia=" + Familia + ", activo=" + activo + '}';
    }

    

    

   
}
