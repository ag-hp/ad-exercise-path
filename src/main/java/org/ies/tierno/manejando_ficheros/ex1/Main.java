package org.ies.tierno.manejando_ficheros.ex1;

public class Main {
    public static void main(String[] args) {

        FicheroPresente buscadorIO = new FicheroPresente();
        String nombreFichero1 = "README.md";
        boolean ficheroIO = buscadorIO.existeFicheroIO(nombreFichero1);
        System.out.println("Existe " + nombreFichero1 + " en el directorio?? " + ficheroIO);

        FicheroPresente buscadorNIO = new FicheroPresente();
        boolean ficheroNIO = buscadorNIO.existeFicheroIO("name.xml"); // cambiando el nombreFichero se hace true o false
        System.out.println("Existe el directorio?? " + ficheroNIO);
    }
}
