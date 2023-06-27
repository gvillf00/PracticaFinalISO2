/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import EJB.AdministradoresFacadeLocal;
import Modelo.Administradores;
 
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named
@ViewScoped
public class AdministradorControlador implements Serializable {
    
    
    @EJB
    private AdministradoresFacadeLocal administradorEJB;
       
    private Administradores administrador;
    
    
    @PostConstruct
    public void init(){
        administrador = new Administradores();
        //administrador.setUsuario("nombre de usuario");
        
    }

    public Administradores getAdministrador() {
        return administrador;
    }

  

    public void setAdministrador(Administradores administrador) {
        this.administrador = administrador;
    }

  
    
    public boolean existeAdmin(){
        
        List<Administradores> listEJB =  administradorEJB.findAll();
        boolean existe = false;
        for (int i = 0; i < listEJB.size();i++){
              if (listEJB.get(i).getUsuario()== administrador.getUsuario()) {
               
                    existe = true;
                    break;
                }
            }
        return existe;
    }
    
    
    public void registrar(){
       
       try{
           administrador.setActivo(true);
           administradorEJB.create(administrador);
       } catch(Exception e){
           System.out.println(e.getMessage());
       }
       
}
}
