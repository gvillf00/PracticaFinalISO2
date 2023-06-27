/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Modelo.Stocks;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jmvm_
 */
@Local
public interface StocksFacadeLocal {

    void create(Stocks stocks);

    void edit(Stocks stocks);

    void remove(Stocks stocks);

    Stocks find(Object id);

    List<Stocks> findAll();

    List<Stocks> findRange(int[] range);

    int count();
    
}
