/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import EJB.FamiliasFacadeLocal;
import Modelo.Familias;
import java.io.Serializable;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Gemma
 */

@Named
@ViewScoped

public class AltaFamiliaController implements Serializable {
    
    //@Inject
    private Familias fam;
    @EJB //para qeu se encargue de reservar memoria y desplegar el patron fachada de categoría.
    private FamiliasFacadeLocal familiasEJB;
    
    @PostConstruct //lo primero que hace es ejecutarse para qeu reserve la memoria, es el constructor
    public void init(){
        fam=new Familias();
        fam.setCodigoFamilia("codigo familia");
        fam.setFamilia("nombre familia");
    }
    
    public void insertarFamilia (){
        try{
            familiasEJB.create(fam);
        }catch (Exception e){
            System.out.println("error de:" + e.getMessage());
        }  
    }

    public Familias getFam() {
        return fam;
    }

    public void setFam(Familias fam) {
        this.fam = fam;
    }

    public FamiliasFacadeLocal getFamiliasEJB() {
        return familiasEJB;
    }

    public void setFamiliasEJB(FamiliasFacadeLocal familiasEJB) {
        this.familiasEJB = familiasEJB;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.fam);
        hash = 43 * hash + Objects.hashCode(this.familiasEJB);
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
        final AltaFamiliaController other = (AltaFamiliaController) obj;
        if (!Objects.equals(this.fam, other.fam)) {
            return false;
        }
        if (!Objects.equals(this.familiasEJB, other.familiasEJB)) {
            return false;
        }
        return true;
    }

    
    
}
