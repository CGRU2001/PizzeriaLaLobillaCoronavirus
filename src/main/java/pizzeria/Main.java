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
public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente("Carlos", "Avd los reales", new Pedido());
        c.getPedido().nuevoArticulo(Articulos.PIZZA_PERICOLOSA);
        System.out.println(c);
    }
}
