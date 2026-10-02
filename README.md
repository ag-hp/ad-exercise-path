<h1 align="center">ACCESO A DATOS - RUTAS</h1>

<div align="center">
  <a href="https://www.java.com/"><img src="https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white" alt="Java"></a>
  &nbsp;
  <a href="https://www.jetbrains.com/idea/"><img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=flat&logo=intellij-idea&logoColor=white" alt="IntelliJ IDEA"></a>
  &nbsp;
  <a href="LICENSE"><img src="https://img.shields.io/badge/License-Educational-blue?style=flat" alt="Educational License"></a>
  &nbsp;
  <a href="#"><img src="https://img.shields.io/badge/Ejercicios-Rutas-orange?style=flat" alt="Ejercicios Rutas"></a>
  &nbsp;
  <img src="https://img.shields.io/badge/Estado-Completado-brightgreen?style=flat" alt="Completado">
</div>

<br>

<h2>APIs manejo de ficheros Archivo</h2>

| Operación / Categoría | API clásica: File (java.io) | API moderna: Path y Files (java.nio.file) |
| :--- | :--- | :--- |
| **Creación de la ruta** | `new File(String path)` | `Path.of(...)` ó `Paths.get(...)` |
| **Obtención del nombre** | `getName()` | `getFileName()` |
| **Obtención de ruta absoluta** | `getAbsolutePath()` | `toAbsolutePath()` |
| **Normalización de ruta** | `getCanonicalPath()` | `normalize()` / `toRealPath()` |
| **Creación de directorios** | `mkdir()` / `mkdirs()` | `Files.createDirectory()` / `createDirectories()` |
| **Comprobación de tipo y estado** | `isFile()` / `isDirectory()` / `exists()` | `Files.isRegularFile()` / `isDirectory()` / `exists()` |
| **Creación de fichero vacío** | `createNewFile()` | `Files.createFile(path)` |

---

<h3>Utiliza las Apis de NIO e IO para resolver cada uno de los ejercicios y compara los resultados.</h3>

<h4>1. Codifica un método que cree los siguientes archivos:</h4>

  - `/tmp/acceso/introduccion.txt`
  - `/tmp/otro/ejemplo.txt`
  - `acceso/introduccion.txt`
  - `otro/ejemplo.txt`

<h4>2. Codifica un método que muestre las rutas absolutas de los siguientes archivos:</h4>

  - `/tmp/acceso/introduccion.txt`
  - `/tmp/otro/ejemplo.txt`
  - `acceso/introduccion.txt`
  - `otro/ejemplo.txt`

---

<h3>Manejando Ficheros</h3>

<p>Aquí os dejo una lista de los métodos más usados de de la clase File…</p>

<!-- Poner imagen aquí -->
<p align="center">
  
</p>
  <img width="1483" height="853" alt="chuleta_mtodos_clase_file" src="https://github.com/user-attachments/assets/0e93f530-d4fd-4f3b-8007-cf4983be155d" />
<br>

<h4>1. Consulta la API de la clase File, localiza el método exists y codifica un método que devuelva un valor booleano que indique si un determinado fichero está presente en la carpeta actual.</h4>

<p>El nombre del fichero que queremos localizar se le pasa como parámetro al método que tú tienes que localizar.</p>

<p>Codifica también lo necesario para probar este método (sólo el <code>main</code> puede ser estático).</p>

<h4>2. Ahora, en lugar de mirar en el directorio actual, tienes que codificar un método que te diga si un determinado fichero pasado como parámetro está presente dentro de un directorio también pasado como parámetro. Llama a este método "estaEn".</h4>

<p>Escribe también el código necesario para poder probar el citado método.</p>

<h4>3. Repite los ejercicios 1 y 2 utilizando las clases del paquete java.nio.files (necesitarás las interfaces Path y Files).</h4>

<p><em>Sugerencia: para empezar, apóyate en el ejemplo de manejo de NIO que estudiamos en clas
