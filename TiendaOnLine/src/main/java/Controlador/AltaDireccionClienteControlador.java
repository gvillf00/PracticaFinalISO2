/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import EJB.ClientesFacadeLocal;
import EJB.DireccionesFacadeLocal;
import Modelo.Administradores;
import Modelo.Clientes;
import Modelo.Direcciones;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named
@ViewScoped
public class AltaDireccionClienteControlador implements Serializable {
      @EJB 
     private DireccionesFacadeLocal direccionesEJB;
      @EJB
      private ClientesFacadeLocal clientesEJB;
     @Inject 
     private Direcciones direccion;
     @Inject
     private Clientes cliente ;
     private List<Direcciones> direcciones;
     private List<Clientes>listaClientes;

   public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public DireccionesFacadeLocal getDireccionesEJB() {
        return direccionesEJB;
    }

    public Direcciones getDireccion() {
        return direccion;
    }

    public List<Direcciones> getDirecciones() {
        return direcciones;
    }

    public void setDireccionesEJB(DireccionesFacadeLocal direccionesEJB) {
        this.direccionesEJB = direccionesEJB;
    }

    public void setDireccion(Direcciones direccion) {
        this.direccion = direccion;
    }

    public void setDirecciones(List<Direcciones> direcciones) {
        this.direcciones = direcciones;
    }

    public List<Clientes> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Clientes> listaClientes) {
        this.listaClientes = listaClientes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.direccion);
        hash = 59 * hash + Objects.hashCode(this.direcciones);
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
        final AltaDireccionClienteControlador other = (AltaDireccionClienteControlador) obj;
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.direcciones, other.direcciones)) {
            return false;
        }
        return true;
    }
             
    
     @PostConstruct
     public void init(){
       listaClientes =  clientesEJB.findAll();
    }
     public void registrarDireccion(){
         direccion.setIdcliente(cliente);
         direccionesEJB.create(direccion);
     }
    
}
