/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Modelo.FacturasLineasClientes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jmvm_
 */
@Stateless
public class FacturasLineasClientesFacade extends AbstractFacade<FacturasLineasClientes> implements FacturasLineasClientesFacadeLocal {

    @PersistenceContext(unitName = "TiendaOnLinePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FacturasLineasClientesFacade() {
        super(FacturasLineasClientes.class);
    }
    
}
