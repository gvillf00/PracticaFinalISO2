/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import EJB.FacturasLineasClientesFacadeLocal;
import Modelo.FacturasLineasClientes;
import java.util.Date;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author jmvm_
 */
public class AltaFacturasLineasClienteControlador {
     private FacturasLineasClientes factura;
    @EJB //para qeu se encargue de reservar memoria y desplegar el patron fachada de categoría.
    private FacturasLineasClientesFacadeLocal facturasEJB;
    
    @PostConstruct //lo primero que hace es ejecutarse para qeu reserve la memoria, es el constructor
     public void init(){
        factura=new FacturasLineasClientes();
        Date fecha = new Date();
        factura.setFecha(fecha);
    }
     public void insertarCliente (){
         
        try{
            if(!factura.getFecha().toString().isEmpty()){
            facturasEJB.create(factura);    
            System.out.println("factura:"+factura.toString()+"insertado correctamente");
            }
            
            
        }catch (Exception e){
            System.out.println("error de:" + e.getMessage());
        }
        
    }

    public FacturasLineasClientes getFactura() {
        return factura;
    }

    public FacturasLineasClientesFacadeLocal getFacturasEJB() {
        return facturasEJB;
    }

    public void setFactura(FacturasLineasClientes factura) {
        this.factura = factura;
    }

    public void setFacturasEJB(FacturasLineasClientesFacadeLocal facturasEJB) {
        this.facturasEJB = facturasEJB;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.factura);
        hash = 83 * hash + Objects.hashCode(this.facturasEJB);
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
        final AltaFacturasLineasClienteControlador other = (AltaFacturasLineasClienteControlador) obj;
        if (!Objects.equals(this.factura, other.factura)) {
            return false;
        }
        if (!Objects.equals(this.facturasEJB, other.facturasEJB)) {
            return false;
        }
        return true;
    }
     
     
    
    
}
