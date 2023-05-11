/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Modelo.FacturasLineasClientes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jmvm_
 */
@Local
public interface FacturasLineasClientesFacadeLocal {

    void create(FacturasLineasClientes facturasLineasClientes);

    void edit(FacturasLineasClientes facturasLineasClientes);

    void remove(FacturasLineasClientes facturasLineasClientes);

    FacturasLineasClientes find(Object id);

    List<FacturasLineasClientes> findAll();

    List<FacturasLineasClientes> findRange(int[] range);

    int count();
    
}
