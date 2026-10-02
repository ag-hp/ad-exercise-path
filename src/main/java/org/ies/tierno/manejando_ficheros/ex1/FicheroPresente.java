package org.ies.tierno.manejando_ficheros.ex1;

import java.io.File;

public class FicheroPresente {

    // 1. Creamos ruta y vemos si existe (true / false)
    public boolean exists(File nameFile) {
        return nameFile.exists();
    }
}
