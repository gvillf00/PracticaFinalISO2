/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import EJB.DireccionesFacadeLocal;
import Modelo.Direcciones;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;



@Named
@ViewScoped
public class ListadoDireccionesControlador implements Serializable {
    private List<Direcciones> listaDirecciones;
    
     @EJB //para qeu se encargue de reservar memoria y desplegar el patron fachada de categoría.
    private DireccionesFacadeLocal direccionesEJB;

    public List<Direcciones> getListaDirecciones() {
        return listaDirecciones;
    }

    public void setListaDirecciones(List<Direcciones> listaDirecciones) {
        this.listaDirecciones = listaDirecciones;
    }
     
     
    @PostConstruct //lo primero que hace es ejecutarse para qeu reserve la memoria, es el constructor
    
    public void init(){
        listaDirecciones=direccionesEJB.findAll();
        
    }
 
}
