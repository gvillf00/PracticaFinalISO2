/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import EJB.ClientesFacadeLocal;
import Modelo.Clientes;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named
@ViewScoped
public class ListadoClientesControlador implements Serializable {
     private Clientes cliente;
     //@Inject
    private List<Clientes> listaclientes;
    private String accion;
    
    @EJB //para qeu se encargue de reservar memoria y desplegar el patron fachada de categoría.
    private ClientesFacadeLocal clientesEJB;

    public List<Clientes> getListaclientes() {
        return listaclientes;
    }

    
     @PostConstruct //lo primero que hace es ejecutarse para qeu reserve la memoria, es el constructor
    
    public void init(){
        listaclientes=clientesEJB.findAll();
        
    }

    public void setListaclientes(List<Clientes> listaclientes) {
        this.listaclientes = listaclientes;
    }
    
    
}
