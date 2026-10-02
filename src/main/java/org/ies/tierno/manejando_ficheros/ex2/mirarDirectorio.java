package org.ies.tierno.manejando_ficheros.ex2;

import java.io.File;

public class mirarDirectorio {

    public boolean estaEn(File directory, String nameFile) {
       if (directory != null){
           if (nameFile != null){
               File file = new File(directory, nameFile);
               return file.exists();
           }
       }
       return false;
    }
}
