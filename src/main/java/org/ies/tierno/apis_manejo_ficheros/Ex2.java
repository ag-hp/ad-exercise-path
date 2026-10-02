package org.ies.tierno.apis_manejo_ficheros;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex2 {

    public void createNIO(String[] paths) throws Exception {

        for (String path : paths) {

            Path pa = Paths.get(path);

            if (pa.getParent() != null) {
                Files.createDirectories(pa.getParent());
            }

            if (!Files.exists(pa)) {
                Files.createFile(pa);
            }

            Files.writeString(pa, "Creado con NIO");
            System.out.printf("Archivo NIO creado: " + pa.getFileName());

        }
    }
}
