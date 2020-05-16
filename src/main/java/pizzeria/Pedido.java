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
        this.calcularPrecio(a);
    }

    private void calcularPrecio(Articulos a){
        this.subtotal += a.getPrecioArticulo();
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public ArrayList<Articulos> getArticulosComanda() {
        return articulosComanda;
    }

    public void setArticulosComanda(ArrayList<Articulos> articulosComanda) {
        this.articulosComanda = articulosComanda;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(String repartidor) {
        this.repartidor = repartidor;
    }
    

    @Override
    public String toString() {
        String contenido = "";
        for (int i = 0; i < articulosComanda.size(); i++) {
            contenido += articulosComanda.get(i) + ", ";
        }
        return ("El pedido contiene: "  + contenido);
    }
}
