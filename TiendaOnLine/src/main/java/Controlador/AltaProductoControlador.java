/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import EJB.AdministradoresFacadeLocal;
import EJB.FamiliasFacadeLocal;
import EJB.ProductosFacadeLocal;
import Modelo.Administradores;
import Modelo.Familias;
import Modelo.Productos;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.PrimeFaces;


@Named
@ViewScoped
public class AltaProductoControlador implements Serializable {
     @EJB 
     private ProductosFacadeLocal productoEJB;
     @EJB
      private AdministradoresFacadeLocal administradoresEJB;
     @EJB
      private FamiliasFacadeLocal familiasEJB;
     @Inject 
     private Productos producto;
      @Inject 
     private Administradores administrador;
       @Inject 
     private Familias familia;
       
     private List<Productos> listaProductos;
     private List<Familias>listaFamilias;
     private List<Administradores>listaAdministradores;
     
    @PostConstruct
    public void init(){
        listaFamilias = familiasEJB.findAll();
        listaAdministradores = administradoresEJB.findAll();
        producto=new Productos();
        producto.setIva(21);
        Date fecha=new Date();
        producto.setFechaAlta(fecha);
        
    }

  
    public void registrarProducto(){
        producto.setAdministrador(administrador);
        producto.setFamilia(familia);
        productoEJB.create(producto);
       
    }     
       
    public ProductosFacadeLocal getProductoEJB() {
        return productoEJB;
    }

    public void setProductoEJB(ProductosFacadeLocal productoEJB) {
        this.productoEJB = productoEJB;
    }

    public AdministradoresFacadeLocal getAdministradoresEJB() {
        return administradoresEJB;
    }

    public void setAdministradoresEJB(AdministradoresFacadeLocal administradoresEJB) {
        this.administradoresEJB = administradoresEJB;
    }

    public FamiliasFacadeLocal getFamiliasEJB() {
        return familiasEJB;
    }

    public void setFamiliasEJB(FamiliasFacadeLocal familiasEJB) {
        this.familiasEJB = familiasEJB;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public Administradores getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administradores administrador) {
        this.administrador = administrador;
    }

    public Familias getFamilia() {
        return familia;
    }

    public void setFamilia(Familias familia) {
        this.familia = familia;
    }

    public List<Productos> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Productos> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Familias> getListaFamilias() {
        return listaFamilias;
    }

    public void setListaFamilias(List<Familias> listaFamilias) {
        this.listaFamilias = listaFamilias;
    }

    public List<Administradores> getListaAdministradores() {
        return listaAdministradores;
    }

    public void setListaAdministradores(List<Administradores> listaAdministradores) {
        this.listaAdministradores = listaAdministradores;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.productoEJB);
        hash = 97 * hash + Objects.hashCode(this.administradoresEJB);
        hash = 97 * hash + Objects.hashCode(this.familiasEJB);
        hash = 97 * hash + Objects.hashCode(this.producto);
        hash = 97 * hash + Objects.hashCode(this.administrador);
        hash = 97 * hash + Objects.hashCode(this.familia);
        hash = 97 * hash + Objects.hashCode(this.listaProductos);
        hash = 97 * hash + Objects.hashCode(this.listaFamilias);
        hash = 97 * hash + Objects.hashCode(this.listaAdministradores);
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
        final AltaProductoControlador other = (AltaProductoControlador) obj;
        if (!Objects.equals(this.productoEJB, other.productoEJB)) {
            return false;
        }
        if (!Objects.equals(this.administradoresEJB, other.administradoresEJB)) {
            return false;
        }
        if (!Objects.equals(this.familiasEJB, other.familiasEJB)) {
            return false;
        }
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        if (!Objects.equals(this.administrador, other.administrador)) {
            return false;
        }
        if (!Objects.equals(this.familia, other.familia)) {
            return false;
        }
        if (!Objects.equals(this.listaProductos, other.listaProductos)) {
            return false;
        }
        if (!Objects.equals(this.listaFamilias, other.listaFamilias)) {
            return false;
        }
        if (!Objects.equals(this.listaAdministradores, other.listaAdministradores)) {
            return false;
        }
        return true;
    }

     
}