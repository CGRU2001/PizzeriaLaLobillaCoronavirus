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
public class Cliente {
    private String nombreCliente;
    private String numTel;
    private String direccion;
    private Pedido pedido;

    public Cliente(String nombreCliente, String direccion, Pedido pedido) { //Creamos un constructor sin el número de teléfono puesto que podría no ser necesario almacenarlo en determinados casos
        this.nombreCliente = nombreCliente;
        this.direccion = direccion;
        this.pedido = pedido;
    }

    public Cliente(String nombreCliente, String numTel, String direccion, Pedido pedido) {
        this.nombreCliente = nombreCliente;
        this.numTel = numTel;
        this.direccion = direccion;
        this.pedido = pedido;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "El cliente '" + this.nombreCliente + "' con dirección '" + this.direccion + "' tiene el pedido " + pedido.getReferencia() + "\n" + pedido.toString();
    }
    
    
    
}
