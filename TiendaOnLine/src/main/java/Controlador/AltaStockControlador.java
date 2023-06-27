/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import EJB.ProductosFacadeLocal;
import EJB.StocksFacadeLocal;
import Modelo.Productos;
import Modelo.Stocks;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jmvm_
 */
@Named
@ViewScoped
public class AltaStockControlador implements Serializable {
     @EJB 
     private ProductosFacadeLocal productoEJB;
     
     @EJB 
     private StocksFacadeLocal stocksEJB;
     
     @Inject 
     private Productos producto;
    
     @Inject 
     private Stocks stock;
     
     private List<Productos> listaProductos;
     private List<Stocks> listaStocks;
     
         @PostConstruct
     public void init(){
         listaProductos = productoEJB.findAll();
     }
     
     public void registrarStock(){
         stock.setProducto(producto);
         
         stocksEJB.create(stock);
     }  

    public ProductosFacadeLocal getProductoEJB() {
        return productoEJB;
    }

    public void setProductoEJB(ProductosFacadeLocal productoEJB) {
        this.productoEJB = productoEJB;
    }

    public StocksFacadeLocal getStocksEJB() {
        return stocksEJB;
    }

    public void setStocksEJB(StocksFacadeLocal stocksEJB) {
        this.stocksEJB = stocksEJB;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public Stocks getStock() {
        return stock;
    }

    public void setStock(Stocks stock) {
        this.stock = stock;
    }

    public List<Productos> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Productos> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Stocks> getListaStocks() {
        return listaStocks;
    }

    public void setListaStocks(List<Stocks> listaStocks) {
        this.listaStocks = listaStocks;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.productoEJB);
        hash = 31 * hash + Objects.hashCode(this.stocksEJB);
        hash = 31 * hash + Objects.hashCode(this.producto);
        hash = 31 * hash + Objects.hashCode(this.stock);
        hash = 31 * hash + Objects.hashCode(this.listaProductos);
        hash = 31 * hash + Objects.hashCode(this.listaStocks);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AltaStockControlador other = (AltaStockControlador) obj;
        if (!Objects.equals(this.productoEJB, other.productoEJB)) {
            return false;
        }
        if (!Objects.equals(this.stocksEJB, other.stocksEJB)) {
            return false;
        }
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        if (!Objects.equals(this.stock, other.stock)) {
            return false;
        }
        if (!Objects.equals(this.listaProductos, other.listaProductos)) {
            return false;
        }
        if (!Objects.equals(this.listaStocks, other.listaStocks)) {
            return false;
        }
        return true;
    }
     






}

