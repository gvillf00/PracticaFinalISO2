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
import javax.persistence.Table;

/**
 *
 * @author jmvm_
 */

@Entity
@Table(name="tblstockproductos")
public class Stocks implements Serializable {
      
    @Id //que indica que la columna es un identificador único
    @GeneratedValue(strategy=GenerationType.IDENTITY) //le decimos que es un autonumérico
    private int IdStock; //aquí no hace falta poner la columna de la tabla a la que se refiere porque ya decimos que es la clave principal.
    
    @ManyToOne
    @JoinColumn(name="IdProducto")
    private Productos producto;
    
    @Column(name="CantidadReal")
    private int cantidadreal;
    
    @Column(name="CantidadPteRecibir")
    private int cantidadpendienterecibir;
    
    @Column(name="CantidadTotal")
    private int cantidadtotal;

    public int getIdStock() {
        return IdStock;
    }

    public void setIdStock(int IdStock) {
        this.IdStock = IdStock;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public int getCantidadreal() {
        return cantidadreal;
    }

    public void setCantidadreal(int cantidadreal) {
        this.cantidadreal = cantidadreal;
    }

    public int getCantidadpendienterecibir() {
        return cantidadpendienterecibir;
    }

    public void setCantidadpendienterecibir(int cantidadpendienterecibir) {
        this.cantidadpendienterecibir = cantidadpendienterecibir;
    }

    public int getCantidadtotal() {
        return cantidadtotal;
    }

    public void setCantidadtotal(int cantidadtotal) {
        this.cantidadtotal = cantidadtotal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.IdStock;
        hash = 83 * hash + Objects.hashCode(this.producto);
        hash = 83 * hash + this.cantidadreal;
        hash = 83 * hash + this.cantidadpendienterecibir;
        hash = 83 * hash + this.cantidadtotal;
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
        final Stocks other = (Stocks) obj;
        if (this.IdStock != other.IdStock) {
            return false;
        }
        if (this.cantidadreal != other.cantidadreal) {
            return false;
        }
        if (this.cantidadpendienterecibir != other.cantidadpendienterecibir) {
            return false;
        }
        if (this.cantidadtotal != other.cantidadtotal) {
            return false;
        }
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        return true;
    }
    
    

}
