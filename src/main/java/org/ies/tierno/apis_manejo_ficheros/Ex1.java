package org.ies.tierno.apis_manejo_ficheros;

import java.io.File;
import java.io.FileWriter;

public class Ex1 {

    public void createIO(String[] paths) throws Exception { // path = ruta

        for (String path : paths) {
            // 1. CREAR RUTA
            File file = new File(path);

            // 2. CREAR DIRECTORIOS
            if (file.getParentFile() != null) {
                file.getParentFile().mkdirs();
            }

            // 3. CREAR EL FICHERO (VACIO)
            file.createNewFile();

            // 4. ESCRIBIR TEXTO EN EL FICHERO
            try (FileWriter fileW = new FileWriter(file)) {
                fileW.write("Creado con IO");
            }

            System.out.printf("Archivo IO: " + file.getName());

        }
    }
}
