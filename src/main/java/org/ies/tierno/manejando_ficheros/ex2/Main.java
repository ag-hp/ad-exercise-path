package org.ies.tierno.manejando_ficheros.ex2;

import java.io.File;

public class Main {
    public static void main() {
        File carpeta = new File("/tmp/mirarDirectorio");
        mirarDirectorio buscarDirectory = new mirarDirectorio();
        boolean existe = buscarDirectory.estaEn(carpeta, "introduccion.txt");
        System.out.println("¿Está en la carpeta?: " + existe);
    }
}
