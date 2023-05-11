/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Modelo.cabeceraFacturas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jmvm_
 */
@Local
public interface cabeceraFacturasFacadeLocal {

    void create(cabeceraFacturas cabeceraFacturas);

    void edit(cabeceraFacturas cabeceraFacturas);

    void remove(cabeceraFacturas cabeceraFacturas);

    cabeceraFacturas find(Object id);

    List<cabeceraFacturas> findAll();

    List<cabeceraFacturas> findRange(int[] range);

    int count();
    
}
