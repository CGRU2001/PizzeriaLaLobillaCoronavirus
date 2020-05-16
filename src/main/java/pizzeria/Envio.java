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
public class Envio {
    //La clase envío será un sigleton
    private static Envio envio = null; 
    private String[] pizzeros = {"Pepe", "Jose" , "Juan", "Juanillo", "Alberto"};
    private String repartidor;

    private Envio() {
        Random r = new Random();
        repartidor = pizzeros[r.nextInt(pizzeros.length)];
    }
    private static void nuevoEnvio(){
        envio = new Envio();
    }
    public static Envio getInstance(){
        if (envio == null) nuevoEnvio();
        return envio;
    }

    public String[] getPizzeros() {
        return pizzeros;
    }

    public void setPizzeros(String[] pizzeros) {
        this.pizzeros = pizzeros;
    }

    public String getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(String repartidor) {
        this.repartidor = repartidor;
    }
    
}
