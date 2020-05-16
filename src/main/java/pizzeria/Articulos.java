/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author carlos
 */
public enum Articulos {
    
    PIZZA_BASE(1, "Pizza base", 5);
    
    private int referenciaArticulo;
    private String nombreArticulo;
    private double precioArticulo;

    private Articulos(int referenciaArticulo, String nombreArticulo, double precioArticulo) {
        this.referenciaArticulo = referenciaArticulo;
        this.nombreArticulo = nombreArticulo;
        this.precioArticulo = precioArticulo;
    }

    public int getReferenciaArticulo() {
        return referenciaArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }
    
    

}
