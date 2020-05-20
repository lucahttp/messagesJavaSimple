package domain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner opcion = new Scanner(System.in);
        System.out.println("Elige una de las siguientes opciones:");
        System.out.println("1.Hostear un Servidor de mensajes.");
        System.out.println("2.Conectarse a un servidor de mensajes.");


        Integer opcionElegida = Integer.valueOf(opcion.nextLine());

        if (opcionElegida == 1) {
            System.out.println("elegiste la opcion 1");
                try {
                    Server.setUpServer();
                } catch (NullPointerException e) {
                    System.out.print("Caught the NullPointerException");
                }
        }
        else if (opcionElegida == 2){
            System.out.println("elegiste la opcion 2");
            try {
                Client.setUpClient();
            } catch (NullPointerException e) {
                System.out.print("Caught the NullPointerException");
            }
        } else {
            System.out.println("elegiste una opcion invalida");
        }

    }
}
