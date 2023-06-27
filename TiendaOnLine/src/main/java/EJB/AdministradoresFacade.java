/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Modelo.Administradores;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jmvm_
 */
@Stateless
public class AdministradoresFacade extends AbstractFacade<Administradores> implements AdministradoresFacadeLocal {

    @PersistenceContext(unitName = "TiendaOnLinePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdministradoresFacade() {
        super(Administradores.class);
    }
    
    @Override
    public Administradores iniciarSesion(Administradores admin){
            Administradores administrador = null;
            String consulta;
        try{
            consulta = "FROM Administradores a WHERE a.usuario = ?1 and  a.contrasena = ?2";
            Query query = em.createQuery(consulta);
            query.setParameter(1, admin.getUsuario());
            query.setParameter(2, admin.getContrasena());
            List<Administradores> lista = query.getResultList();
            if(!lista.isEmpty()){
                System.out.println(lista.size());
                administrador = lista.get(0);
                
            }
            
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return administrador;
    }
}
