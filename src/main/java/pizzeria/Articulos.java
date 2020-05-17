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
    
    PIZZA_BASE(1, "Pizza base", 5),
    PIZZA_LOBILLA(2, "Pizza lobilla",7),
    PIZZA_PERICOLOSA(3, "Pizza pericolosa", 7.5),
    BARBAKO(4,"Barbako",0.5),
    VERDURA(5, "Verduritas", 0.5),
    QUESO(6, "Queso", 0.5),
    PEPERONI(7, "Peperoni", 0.5),
    GAMBAS(8, "Gambas", 0.5),
    ATUN(9,"Atún", 0.5),
    PINNA(10, "Piña", 0.5),
    BACON(11, "Bacon", 0.5),
    JAMON(12, "Jamón", 0.5);
    
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

    @Override
    public String toString() {
        return this.getNombreArticulo() + " (que cuesta " + this.getPrecioArticulo() + "€)\n";
    }
    
    

}
