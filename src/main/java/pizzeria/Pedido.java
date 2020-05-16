/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author carlos
 */
public class Pedido {
    private String referencia;
    private ArrayList<Articulos> articulosComanda;
    private double subtotal;
    private String repartidor;

    public Pedido() {
        Random r = new Random();
        this.referencia = Integer.toString(r.nextInt(10000000));
        this.articulosComanda = new ArrayList<>();
        this.subtotal = 0.5; //Se añaden 50 céntimos de gastos de envío
        this.repartidor = Envio.getInstance().getRepartidor(); //Por el coronavirus, sólo un repartidor puede repartir 
    }
    
    public void nuevoArticulo(Articulos a){
        this.articulosComanda.add(a);
    }

    

    @Override
    public String toString() {
        return "Pedido{" + "referencia=" + referencia + ", articulosComanda=" + articulosComanda + ", subtotal=" + subtotal + ", repartidor=" + repartidor + '}';
    }
    
    
}
