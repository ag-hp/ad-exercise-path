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
