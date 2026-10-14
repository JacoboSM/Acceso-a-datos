import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Prueba_Path {

    public static void main(String[] args) throws IOException {
        Path directorio = Paths.get("C:\\Users\\jacob\\Desktop\\Clase\\2_DAM\\Acceso_a_Datos\\UP1\\Ficheros\\Ficheros\\src\\ficheros\\carpeta_path");
        Path p1 = Paths.get("C:\\Users\\jacob\\Desktop\\Clase\\2_DAM\\Acceso_a_Datos\\UP1\\Ficheros\\Ficheros\\src\\ficheros\\carpeta_path\\prueba_path");
        Path p2 = p1.getParent().resolve("prueba2.path");

        Files.createDirectory(directorio);
        Files.createFile(p1);

        Files.list(directorio)
                .forEach(p -> System.out.println(p.getFileName()));

        System.out.println(" ");

        Files.move(p1,p2);

        Files.list(directorio)
                .forEach(p -> System.out.println(p.getFileName()));

        System.out.println(" ");

        if(Files.exists(p2)){

            System.out.println("Los archivos son correctos");

        }else{

            System.out.println("Los archivos no son correctos");

        }

        Files.delete(p2);
        Files.delete(directorio);


    }

}
