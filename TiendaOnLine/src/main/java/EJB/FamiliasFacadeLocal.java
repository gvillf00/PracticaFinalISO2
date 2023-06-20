/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Modelo.Familias;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Gemma
 */
@Local
public interface FamiliasFacadeLocal {

    void create(Familias familias);

    void edit(Familias familias);

    void remove(Familias familias);

    Familias find(Object id);

    List<Familias> findAll();

    List<Familias> findRange(int[] range);

    int count();
    
}
