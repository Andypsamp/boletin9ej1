package boletin.pkg5.pkg4;

import java.util.Scanner;

public class Boletin54 {

    public static void main(String[] args) {
        // Codigo del programa
        MenuClientes objetoMenu = new MenuClientes();
        Scanner dato = new Scanner(System.in);
        System.out.println("patatas: ");
        objetoMenu.setPatatas(dato.nextInt());
        System.out.println("pulpo: ");
        objetoMenu.setPulpo(dato.nextInt());
        // objetoMenu.getNumClientes();
        System.out.println("Numero de Clientes: " + objetoMenu.getNumClientes());

    }

}
