/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import EJB.StocksFacadeLocal;
import Modelo.Stocks;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;



@Named
@ViewScoped
public class ListadoStocksControlador implements Serializable {
    
    private List<Stocks> listaStocks;
    
    @EJB //para qeu se encargue de reservar memoria y desplegar el patron fachada de categoría.
    private StocksFacadeLocal stocksEJB;
    
     @PostConstruct
    public void init(){
        listaStocks = stocksEJB.findAll();
    }

    public List<Stocks> getListaStocks() {
        return listaStocks;
    }

    public StocksFacadeLocal getStocksEJB() {
        return stocksEJB;
    }

    public void setListaStocks(List<Stocks> listaStocks) {
        this.listaStocks = listaStocks;
    }

    public void setStocksEJB(StocksFacadeLocal stocksEJB) {
        this.stocksEJB = stocksEJB;
    }
    
    
    
}