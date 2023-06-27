/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import EJB.ProductosFacadeLocal;
import Modelo.Productos;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named
@ViewScoped
public class ListadoProductosControlador implements Serializable {
    private Productos producto;
     //@Inject
    private List<Productos> listaproductos;
    private String accion;
    @EJB //para qeu se encargue de reservar memoria y desplegar el patron fachada de categoría.
    private ProductosFacadeLocal productosEJB;
    
    @PostConstruct //lo primero que hace es ejecutarse para qeu reserve la memoria, es el constructor
    
    public void init(){
        listaproductos=productosEJB.findAll();
        
    }

    public List<Productos> getListaproductos() {
        return listaproductos;
    }

    public void setListaproductos(List<Productos> listaproductos) {
        this.listaproductos = listaproductos;
    }
}
