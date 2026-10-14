import java.io.File;
import java.io.IOException;

public class Prueba_File {

    static String[] archivos;

    public static void main (String[] args) throws IOException {

        File f = new File("C:\\Users\\jacob\\Desktop\\Clase\\2_DAM\\Acceso_a_Datos\\UP1\\Ficheros\\Ficheros\\src\\ficheros\\prueba_carpeta\\prueba_archivo");
        File listar = new File("C:\\Users\\jacob\\Desktop\\Clase\\2_DAM\\Acceso_a_Datos\\UP1\\Ficheros\\Ficheros\\src\\ficheros\\prueba_carpeta");

        File borrar = new File("C:\\Users\\jacob\\Desktop\\Clase\\2_DAM\\Acceso_a_Datos\\UP1\\Ficheros\\Ficheros\\src\\ficheros\\prueba_carpeta\\prueba_borrar");
        File rename = new File("C:\\Users\\jacob\\Desktop\\Clase\\2_DAM\\Acceso_a_Datos\\UP1\\Ficheros\\Ficheros\\src\\ficheros\\prueba_carpeta\\prueba_cambiarNombre");

        f.createNewFile();
        borrar.createNewFile();

        archivos = listar.list();

        listar();

        borrar.delete();

        archivos = listar.list();

        listar();

        borrar.createNewFile();

        borrar.renameTo(rename);

        archivos = listar.list();

        listar();

        if(f.exists() && rename.exists()){

            System.out.println("Los archivos han sido creados correctamente");

        }else{

            System.out.println("Los archivos no se han creado correctamente");

        }

        f.delete();
        rename.delete();

    }

    public static void listar (){

        for(String archivo : archivos){

            System.out.println(archivo);

        }

        System.out.println("");

    }

}
