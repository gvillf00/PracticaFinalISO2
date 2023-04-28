/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import EJB.ClientesFacadeLocal;
import Modelo.Clientes;
import java.io.Serializable;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author jmvm_
 */
@Named
@ViewScoped
public class AltaClienteControlador implements Serializable {
    private Clientes cliente;
    @EJB //para qeu se encargue de reservar memoria y desplegar el patron fachada de categoría.
    private ClientesFacadeLocal clientesEJB;
    
    @PostConstruct //lo primero que hace es ejecutarse para qeu reserve la memoria, es el constructor
     public void init(){
        cliente=new Clientes();
        cliente.setNombreCliente("Nombre del cliente");
    }
     public void insertarCliente (){
         
        try{
            if(!cliente.getMail().isEmpty()){
            clientesEJB.create(cliente);    
            System.out.println("Cliente:"+cliente.toString()+"insertado correctamente");
            }
            
            
        }catch (Exception e){
            System.out.println("error de:" + e.getMessage());
        }
        
    }
     public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public ClientesFacadeLocal getClientesEJB() {
        return clientesEJB;
    }

    public void setClientesEJB(ClientesFacadeLocal clientesEJB) {
        this.clientesEJB = clientesEJB;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.cliente);
        hash = 67 * hash + Objects.hashCode(this.clientesEJB);
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
        final AltaClienteControlador other = (AltaClienteControlador) obj;
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.clientesEJB, other.clientesEJB)) {
            return false;
        }
        return true;
    }

}
