package org.ies.tierno.manejando_ficheros.exercises;

class ArchivosTest {

    public static void main(String[] args) {

        // Crear el objeto de archivos:
        Archivos archivos = new Archivos();

        // 1. Creamos ruta y vemos si existe
        boolean ficheroIO = archivos.existeFicheroIO("README.md");
        System.out.println("Existe en el directorio?? " + ficheroIO);

        boolean ficheroNIO = archivos.existeFicheroNIO("name.xml"); // cambiando el nombreFichero se hace true o false
        System.out.println("Existe el directorio?? " + ficheroNIO);

        // 2.
        boolean estarEnIO = archivos.estarEnIO("introduccion.txt", "/exercises");
        System.out.println("Existe en el directorio?? " + estarEnIO);

        boolean estarEnNIO = archivos.estarEnNIO("", "");
        System.out.println("Existe el directorio?? " + estarEnNIO);

        // 3.



        // 4.


        // 5.


        // 6.


        // 7.


        // 8.


        // 9.


        // 10.


        // 11.


    }
}
