package org.ies.tierno.manejando_ficheros.exercises;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class Archivos {


    // 1. Creamos ruta y vemos si existe
    public boolean existeFicheroIO(String nombreFichero) {
        File archivo = new File(nombreFichero);
        return archivo.exists();
    }

        /* Forma 2:
            Path ruta = Path.of(nombreFichero);
            return Files.exists(ruta);
        */


    // 2.
    public boolean estarEnIO(String nombreFichero, String rutaDirectorio) {
        File archivo = new File(nombreFichero, rutaDirectorio);
        return archivo.exists();
    }

    public boolean estarEnNIO(String nombreFichero, String rutaDirectorio) {
        return Files.exists(Path.of(nombreFichero, rutaDirectorio));
    }
}




// 3.


// 4.
// 5.
// 6.
// 7.
// 8.
// 9.
// 10.
// 11.
