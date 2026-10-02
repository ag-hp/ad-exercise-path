package org.ies.tierno.manejando_ficheros.ex1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("/tmp/FicheroPresente/introduccion.txt");
        File file2 = new File("/tmp/FicheroPresente/conclusion.txt");

        FicheroPresente ficheroPresente = new FicheroPresente();
        System.out.println(ficheroPresente.exists(file1));
        System.out.println(ficheroPresente.exists(file2));
    }
}
