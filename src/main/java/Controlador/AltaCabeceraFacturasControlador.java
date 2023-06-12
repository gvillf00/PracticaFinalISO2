/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import EJB.cabeceraFacturasFacadeLocal;
import Modelo.cabeceraFacturas;
import java.io.Serializable;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author jmvm_
 */
public class AltaCabeceraFacturasControlador implements Serializable {
     private cabeceraFacturas cabecera;
     @EJB //para qeu se encargue de reservar memoria y desplegar el patron fachada de categoría.
     private cabeceraFacturasFacadeLocal cabecerasEJB;
     
      @PostConstruct //lo primero que hace es ejecutarse para qeu reserve la memoria, es el constructor
     public void init(){
        cabecera=new cabeceraFacturas();
        cabecera.setDescuento(0.02f);
        
     }
      public void insertarCabeceraFactura (){
         
        try{
            if(cabecera.getImporteTotalSinIva()!=0.0f){
            cabecerasEJB.create( cabecera);    
            System.out.println("cabecera:"+ cabecera.toString()+"insertado correctamente");
            }
            
            
        }catch (Exception e){
            System.out.println("error de:" + e.getMessage());
        }
        
    }

    public cabeceraFacturas getCabecera() {
        return cabecera;
    }

    public cabeceraFacturasFacadeLocal getCabecerasEJB() {
        return cabecerasEJB;
    }

    public void setCabecera(cabeceraFacturas cabecera) {
        this.cabecera = cabecera;
    }

    public void setCabecerasEJB(cabeceraFacturasFacadeLocal cabecerasEJB) {
        this.cabecerasEJB = cabecerasEJB;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.cabecera);
        hash = 37 * hash + Objects.hashCode(this.cabecerasEJB);
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
        final AltaCabeceraFacturasControlador other = (AltaCabeceraFacturasControlador) obj;
        if (!Objects.equals(this.cabecera, other.cabecera)) {
            return false;
        }
        if (!Objects.equals(this.cabecerasEJB, other.cabecerasEJB)) {
            return false;
        }
        return true;
    }
     
     
     
}
