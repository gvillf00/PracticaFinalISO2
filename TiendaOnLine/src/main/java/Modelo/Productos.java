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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="tblproductos")
public class Productos implements Serializable {
  
    
    @Id //que indica que la columna es un identificador único
    @GeneratedValue(strategy=GenerationType.IDENTITY) //le decimos que es un autonumérico
    private int IdProducto; //aquí no hace falta poner la columna de la tabla a la que se refiere porque ya decimos que es la clave principal.
    
    @OneToOne
    @JoinColumn(name="IdFamilia")
    private Familias familia;
     @OneToOne
    @JoinColumn(name="IdUsuariosAdmin")
    private Administradores administrador;
     @Column(name="CodigoBarras")
    private String codigoBarras;
     @Column(name="DescripcionProducto")
    private String DescripcionProducto;
     @Column(name="PrecioCompra")
    private float PrecioCompra;
     @Column(name="PrecioVenta")
    private float PrecioVenta;
     @Column(name="IVA")
    private float iva;
     @Column(name="DtoVenta")
    private float descuento;
     @Column(name="FechaAlta")
     @Temporal(TemporalType.TIMESTAMP)
    private Date FechaAlta;

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public Familias getFamilia() {
        return familia;
    }

    public void setFamilia(Familias familia) {
        this.familia = familia;
    }

    public Administradores getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administradores administrador) {
        this.administrador = administrador;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public void setDescripcionProducto(String DescripcionProducto) {
        this.DescripcionProducto = DescripcionProducto;
    }

    public float getPrecioCompra() {
        return PrecioCompra;
    }

    public void setPrecioCompra(float PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }

    public float getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(float PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public Date getFechaAlta() {
        return FechaAlta;
    }

    public void setFechaAlta(Date FechaAlta) {
        this.FechaAlta = FechaAlta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.IdProducto;
        hash = 17 * hash + Objects.hashCode(this.familia);
        hash = 17 * hash + Objects.hashCode(this.administrador);
        hash = 17 * hash + Objects.hashCode(this.codigoBarras);
        hash = 17 * hash + Objects.hashCode(this.DescripcionProducto);
        hash = 17 * hash + Float.floatToIntBits(this.PrecioCompra);
        hash = 17 * hash + Float.floatToIntBits(this.PrecioVenta);
        hash = 17 * hash + Float.floatToIntBits(this.iva);
        hash = 17 * hash + Float.floatToIntBits(this.descuento);
        hash = 17 * hash + Objects.hashCode(this.FechaAlta);
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
        final Productos other = (Productos) obj;
        if (this.IdProducto != other.IdProducto) {
            return false;
        }
        if (Float.floatToIntBits(this.PrecioCompra) != Float.floatToIntBits(other.PrecioCompra)) {
            return false;
        }
        if (Float.floatToIntBits(this.PrecioVenta) != Float.floatToIntBits(other.PrecioVenta)) {
            return false;
        }
        if (Float.floatToIntBits(this.iva) != Float.floatToIntBits(other.iva)) {
            return false;
        }
        if (Float.floatToIntBits(this.descuento) != Float.floatToIntBits(other.descuento)) {
            return false;
        }
        if (!Objects.equals(this.codigoBarras, other.codigoBarras)) {
            return false;
        }
        if (!Objects.equals(this.DescripcionProducto, other.DescripcionProducto)) {
            return false;
        }
        if (!Objects.equals(this.familia, other.familia)) {
            return false;
        }
        if (!Objects.equals(this.administrador, other.administrador)) {
            return false;
        }
        if (!Objects.equals(this.FechaAlta, other.FechaAlta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Productos{" + "IdProducto=" + IdProducto + ", familia=" + familia + ", administrador=" + administrador + ", codigoBarras=" + codigoBarras + ", DescripcionProducto=" + DescripcionProducto + ", PrecioCompra=" + PrecioCompra + ", PrecioVenta=" + PrecioVenta + ", iva=" + iva + ", descuento=" + descuento + ", FechaAlta=" + FechaAlta + '}';
    }
    
    
    
    
    
    
    
    
    
      
      
}
