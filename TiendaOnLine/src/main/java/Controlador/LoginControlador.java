/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import EJB.AdministradoresFacade;
import EJB.AdministradoresFacadeLocal;
import Modelo.Administradores;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named
@ViewScoped
public class LoginControlador implements Serializable {

    @EJB
    private AdministradoresFacadeLocal administradorEJB;
    private Administradores administrador;
    private List<Administradores> listaAdmin;

    @PostConstruct
    public void init() {

        administrador = new Administradores();
        listaAdmin = administradorEJB.findAll();
        

    }

    public Administradores getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administradores administrador) {
        this.administrador = administrador;
    }
    
   
    public String iniciarSesion() {
        Administradores admin;
        System.out.println(administrador.getContrasena());
        System.out.println(administrador.getUsuario());
        boolean encontrado=false;
        String redireccion = "";
        for (int i = 0; i < listaAdmin.size();i++){
             if (listaAdmin.get(i).getUsuario().equals(administrador.getUsuario())) {
                 
                 if (listaAdmin.get(i).getContrasena().equals(administrador.getContrasena())){
                     if(listaAdmin.get(i).isActivo()==true){
                         encontrado=true;
                     }else{
                        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"El usuario existe pero no está activo","Credenciales incorrectas")); 
                     }
                     
                 }else{
                     //la contraseña es incorrecta
                     encontrado=false;
                     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Aviso contraseña incorrecta","Credenciales incorrectas"));
                 }
             }
        }
        if (encontrado ){
            //redirecciono a la página principal y si no no hago nada
            try{
                admin = administradorEJB.iniciarSesion(administrador);
                if (admin !=null){
                    if(admin.isEsadmin() == true){
                        redireccion = "principal";
                    } else {
                         redireccion = "principalNormal";
                    }
                    
                } else {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Aviso credenciales incorrectas","Credenciales incorrectas"));

                } 
            } catch(Exception e){
               FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Aviso error","Error")); 
            }
            
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Usuario no encontrado en la base de datos","Usuario no encontrado"));
        }
        
       return redireccion;
    }
}


