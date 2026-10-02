package org.ies.tierno.manejando_ficheros.ex1;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class FicheroPresente {

    // 1. Creamos ruta y vemos si existe
    public boolean existeFicheroIO(String nombreFichero) {
        File archivo = new File(nombreFichero);
        return archivo.exists();
    }

    public boolean existeFicheronNIO(String nombreFichero) {
        return Files.exists(Path.of(nombreFichero));
    }
}
