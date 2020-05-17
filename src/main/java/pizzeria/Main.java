/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nombreUsuario;
        String direccion;
        boolean addElement = true;
        String cont;
        int sel;
        System.out.print("Introduce tu nombre de usuario: ");
        nombreUsuario = s.nextLine();
        System.out.print("Introduce tu dirección: ");
        direccion = s.nextLine();
        Cliente c = new Cliente(nombreUsuario, direccion, new Pedido());
        System.out.println("--- SELECCIONE SU PEDIDO ---");
        System.out.println("IMPORTANTE: Todos los pedidos contienen 50 céntimos de gastos de envío");
        System.out.println("----------------------------------------------------------------------");
        do {
            System.out.println("Tenemos disponible: \n"
                    + "1. Pizza base (" + Articulos.PIZZA_BASE.getPrecioArticulo() + "€)\n"
                    + "2. Pizza lobilla (" + Articulos.PIZZA_LOBILLA.getPrecioArticulo() + "€)\n"
                    + "3. Pizza pericolosa (" + Articulos.PIZZA_PERICOLOSA.getPrecioArticulo() + "€)\n"
                    + "4. Barbako (" + Articulos.BARBAKO.getPrecioArticulo() + "€)\n"
                    + "5. Verduritas (" + Articulos.VERDURA.getPrecioArticulo() + "€)\n"
                    + "6. Queso (" + Articulos.QUESO.getPrecioArticulo() + "€)\n"
                    + "7. Peperoni (" + Articulos.PEPERONI.getPrecioArticulo() + "€)\n"
                    + "8. Gambas (" + Articulos.GAMBAS.getPrecioArticulo() + "€)\n"
                    + "9. Atún (" + Articulos.ATUN.getPrecioArticulo() + "€)\n"
                    + "10. Piña (" + Articulos.PINNA.getPrecioArticulo() + "€)\n"
                    + "11. Bacon (" + Articulos.BACON.getPrecioArticulo() + "€)\n"
                    + "12. Jamón (" + Articulos.JAMON.getPrecioArticulo() + "€)");
            System.out.print("Selecciona un elemento: ");
            try{
            sel = s.nextInt();
            }catch(InputMismatchException ime){
                System.out.println("Introduce un valor correcto. Código de error: " + ime.hashCode());
                s.next();//Limpiamos el buffer
                System.out.print("Selecciona un elemento: ");
                sel = s.nextInt();
            }

            switch (sel) {
                case 1:
                    c.getPedido().nuevoArticulo(Articulos.PIZZA_BASE);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.PIZZA_BASE.getNombreArticulo() + " La cuenta asciende a " + c.getPedido().getSubtotal() + "€");
                    break;
                case 2:
                    c.getPedido().nuevoArticulo(Articulos.PIZZA_LOBILLA);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.PIZZA_LOBILLA.getNombreArticulo() + ". La cuenta asciende a " + c.getPedido().getSubtotal() + "€");
                    break;
                case 3:
                    c.getPedido().nuevoArticulo(Articulos.PIZZA_PERICOLOSA);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.PIZZA_PERICOLOSA.getNombreArticulo() + ". La cuenta asciende a " + c.getPedido().getSubtotal() + "€");
                    break;
                case 4:
                    c.getPedido().nuevoArticulo(Articulos.BARBAKO);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.BARBAKO.getNombreArticulo() + ". La cuenta asciende a " + c.getPedido().getSubtotal() + "€");
                    break;
                case 5:
                    c.getPedido().nuevoArticulo(Articulos.VERDURA);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.VERDURA.getNombreArticulo() + ". La cuenta asciende a " + c.getPedido().getSubtotal() + "€");
                    break;
                case 6:
                    c.getPedido().nuevoArticulo(Articulos.QUESO);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.QUESO.getNombreArticulo() + ". La cuenta asciende a " + c.getPedido().getSubtotal() + "€");
                    break;
                case 7:
                    c.getPedido().nuevoArticulo(Articulos.PEPERONI);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.PEPERONI.getNombreArticulo() + ". La cuenta asciende a " + c.getPedido().getSubtotal() + "€");
                    break;
                case 8:
                    c.getPedido().nuevoArticulo(Articulos.GAMBAS);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.GAMBAS.getNombreArticulo() + ". La cuenta asciende a " + c.getPedido().getSubtotal() + "€");
                    break;
                case 9:
                    c.getPedido().nuevoArticulo(Articulos.ATUN);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.ATUN.getNombreArticulo() + ". La cuenta asciende a " + c.getPedido().getSubtotal() + "€");
                    break;
                case 10:
                    c.getPedido().nuevoArticulo(Articulos.PINNA);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.PINNA.getNombreArticulo() + ". La cuenta asciende a " + c.getPedido().getSubtotal() + "€");
                    break;
                case 11:
                    c.getPedido().nuevoArticulo(Articulos.BACON);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.BACON.getNombreArticulo() + ". La cuenta asciende a " + c.getPedido().getSubtotal() + "€");
                    break;
                case 12:
                    c.getPedido().nuevoArticulo(Articulos.JAMON);
                    System.out.println("Has añadido a tu cesta el artículo " + Articulos.JAMON.getNombreArticulo() + ". La cuenta asciende a " + c.getPedido().getSubtotal() + "€");
                    break;
                default:
                    System.out.println("Selecciona un artículo correcto");
                    continue;
            }

            System.out.print("¿Quieres añadir algún elemento más a la cesta? (Si/No): ");
            cont = s.next();
            if(cont.equalsIgnoreCase("No")){
                addElement = !addElement; //Cambiamos el valor de la variable
            }
        } while (addElement);
        System.out.println(c.getPedido().toString());
        System.out.println("El repartidor asignado es " + c.getPedido().getRepartidor());
        System.out.println("Le recordamos que el subtotal el " + c.getPedido().getSubtotal() +"€";
        System.out.println("¡Buen provecho! disfrute de su comida, y recuerde, #YoMeQuedoEnCasa");
    }
}
