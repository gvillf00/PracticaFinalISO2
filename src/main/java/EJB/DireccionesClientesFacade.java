/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Modelo.DireccionesClientes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jmvm_
 */
@Stateless
public class DireccionesClientesFacade extends AbstractFacade<DireccionesClientes> implements DireccionesClientesFacadeLocal {

    @PersistenceContext(unitName = "TiendaOnLinePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DireccionesClientesFacade() {
        super(DireccionesClientes.class);
    }
    
}
