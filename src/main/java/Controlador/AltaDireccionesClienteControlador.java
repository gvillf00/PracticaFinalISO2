/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import EJB.DireccionesClientesFacadeLocal;
import Modelo.DireccionesClientes;
import java.io.Serializable;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author jmvm_
 */
public class AltaDireccionesClienteControlador  implements Serializable{
     private DireccionesClientes direccion_cliente;
     @EJB //para qeu se encargue de reservar memoria y desplegar el patron fachada de categoría.
     private DireccionesClientesFacadeLocal direccionesEJB;
     @PostConstruct //lo primero que hace es ejecutarse para qeu reserve la memoria, es el constructor
     public void init(){
        direccion_cliente=new DireccionesClientes();
        direccion_cliente.setDireccion("calle ejemplo");
        
    }
     
      public void insertarDireccion (){
         
        try{
            if(!direccion_cliente.getDireccion().isEmpty()){
            direccionesEJB.create(direccion_cliente);    
            System.out.println("Cliente:"+direccion_cliente.toString()+"insertado correctamente");
            }
            
            
        }catch (Exception e){
            System.out.println("error de:" + e.getMessage());
        }
}

    public DireccionesClientes getDireccion_cliente() {
        return direccion_cliente;
    }

    public DireccionesClientesFacadeLocal getDireccionesEJB() {
        return direccionesEJB;
    }

    public void setDireccion_cliente(DireccionesClientes direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public void setDireccionesEJB(DireccionesClientesFacadeLocal direccionesEJB) {
        this.direccionesEJB = direccionesEJB;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.direccion_cliente);
        hash = 79 * hash + Objects.hashCode(this.direccionesEJB);
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
        final AltaDireccionesClienteControlador other = (AltaDireccionesClienteControlador) obj;
        if (!Objects.equals(this.direccion_cliente, other.direccion_cliente)) {
            return false;
        }
        if (!Objects.equals(this.direccionesEJB, other.direccionesEJB)) {
            return false;
        }
        return true;
    }
      
      
}
