/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Modelo.DireccionesClientes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jmvm_
 */
@Local
public interface DireccionesClientesFacadeLocal {

    void create(DireccionesClientes direccionesClientes);

    void edit(DireccionesClientes direccionesClientes);

    void remove(DireccionesClientes direccionesClientes);

    DireccionesClientes find(Object id);

    List<DireccionesClientes> findAll();

    List<DireccionesClientes> findRange(int[] range);

    int count();
    
}
