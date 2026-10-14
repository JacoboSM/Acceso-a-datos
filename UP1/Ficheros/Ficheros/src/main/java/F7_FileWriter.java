import java.io.FileWriter;
import java.io.IOException;

public class F7_FileWriter {

    // Este ejemplo escribe una cadena de texto en un fichero utilizando FileWriter.
    public static void main(String[] args) {

        // Texto que queremos guardar en el fichero.
        String str = "Este es un ejemplo de escritura usando FileWriter.";

        try {
            // Abrimos o creamos el fichero output.txt.
            // La ruta es relativa a la carpeta principal del proyecto.
            FileWriter fw = new FileWriter("./src/ficheros/output.txt");

            // Escribimos la cadena en el fichero.
            fw.write(str);

            // Cerramos el flujo.
            // Al cerrarlo, los datos pendientes se envían al fichero
            // y se liberan los recursos utilizados.
            fw.close();

        } catch (IOException e) {
            // Se ejecuta si ocurre algún problema al crear,
            // escribir o cerrar el fichero.
            System.out.println("Error de E/S: " + e);
        }
    }
}
