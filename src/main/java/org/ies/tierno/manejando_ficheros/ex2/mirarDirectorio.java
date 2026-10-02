package org.ies.tierno.manejando_ficheros.ex2;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class mirarDirectorio {

    public boolean estarEnIO(String nombreFichero, String rutaDirectorio) {
        File archivo = new File(nombreFichero, rutaDirectorio);
        return archivo.exists();
    }

    public boolean estarEnNIO(String nombreFichero, String rutaDirectorio) {
        return Files.exists(Path.of(nombreFichero, rutaDirectorio));
    }
}
