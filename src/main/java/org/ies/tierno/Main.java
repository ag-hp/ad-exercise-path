package org.ies.tierno;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception { // 'throws Exception' evita tener que capturar errores manualmente aquí

        // Array (lista) con las 4 rutas de los archivos que queremos procesar
        String[] paths = {
                "/tmp/acceso/introduccion.txt", // Ruta absoluta
                "/tmp/otro/ejemplo.txt", // Ruta absoluta
                "acceso/introduccion.txt", // Ruta relativa (se crea dentro de la carpeta del proyecto / donde tenga la clase)
                "otro/ejemplo.txt" // Ruta relativa
        };

        // Creamos el objeto 'teclado' para poder recibir lo que el usuario escriba en la consola
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1. IO ");
        System.out.println("2. NIO");
        System.out.println("Escribe la opción que desee: ");

        int option = keyboard.nextInt();

        switch (option) {
            case 1 -> {
                Ex1 io = new Ex1(); // Instanciamos (creamos) un objeto de la clase GestorIO
                io.createIO(paths); // Llamamos a su metodo pasandole la lista de rutas
            }
            case 2 -> {
                Ex2 nio = new Ex2(); // Instanciamos (creamos) un objeto de la clase GestorNIO
                nio.createNIO(paths); // Llamamos a su metodo pasándole la lista de rutas
            }
        }
    }
}