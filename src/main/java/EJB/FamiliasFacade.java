/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Modelo.Familias;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Gemma
 */
@Stateless
public class FamiliasFacade extends AbstractFacade<Familias> implements FamiliasFacadeLocal {

    @PersistenceContext(unitName = "TiendaOnLinePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FamiliasFacade() {
        super(Familias.class);
    }
    
}
