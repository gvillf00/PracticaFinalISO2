/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Modelo.cabeceraFacturas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jmvm_
 */
@Stateless
public class cabeceraFacturasFacade extends AbstractFacade<cabeceraFacturas> implements cabeceraFacturasFacadeLocal {

    @PersistenceContext(unitName = "TiendaOnLinePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public cabeceraFacturasFacade() {
        super(cabeceraFacturas.class);
    }
    
}
