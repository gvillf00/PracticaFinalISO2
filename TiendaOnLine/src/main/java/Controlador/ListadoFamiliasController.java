/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import EJB.FamiliasFacadeLocal;
import Modelo.Familias;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
/**
 *
 * @author Gemma
 */

@Named("dtlistaFamilias")
@ViewScoped

public class ListadoFamiliasController implements Serializable {
    
    private Familias familia;
     //@Inject
    private List<Familias> listafamilias;
    private String accion;
    @EJB //para qeu se encargue de reservar memoria y desplegar el patron fachada de categoría.
    private FamiliasFacadeLocal familiasEJB;
    
    @PostConstruct //lo primero que hace es ejecutarse para qeu reserve la memoria, es el constructor
    public void init(){
        listafamilias=familiasEJB.findAll();
        
    }
    public void accion(){
        
    }
    
    public void insertarFamilia(){
        
    }
    
    public void establecerFamiliaModificar(Familias fam){
        this.familia = fam;
        this.accion = "M";
    }
    public void modificarfamilia(){
        try{
            familiasEJB.edit(familia);
            System.out.println("familia modificada");
            listafamilias=familiasEJB.findAll();
        
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
     
    public List<Familias> getListafamilias() {
        return listafamilias;
    }

    public void setListafamilias(List<Familias> listafamilias) {
        this.listafamilias = listafamilias;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public FamiliasFacadeLocal getFamiliasEJB() {
        return familiasEJB;
    }

    public void setFamiliasEJB(FamiliasFacadeLocal familiasEJB) {
        this.familiasEJB = familiasEJB;
    }
    
    
}
