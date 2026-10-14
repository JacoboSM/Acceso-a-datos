import java.io.FileOutputStream;
import java.io.IOException;

public class F1_FileOutputStream {

    public static void main(String[] args) {
        // Texto que vamos a guardar en el fichero.
        String texto = "Hola";

        try {
            // Abrimos el fichero para escribir.
            // Si no existe, se crea.
            // Si ya existe, se sobrescribe.
            FileOutputStream fos = new FileOutputStream("./src/ficheros/pruba.txt");

            // Convertimos el texto en bytes y los escribimos.
            fos.write(texto.getBytes());

            // Escribimos un byte con valor numérico 1.
            // Se añade después de los bytes correspondientes a "Hola".
            fos.write(1);

            // Cerramos el flujo y liberamos los recursos.
            fos.close();

            // Mensaje que aparece en la consola si todo ha ido bien.
            System.out.println("Datos escritos en el archivo binario.");

        } catch (IOException e) {
            // Se ejecuta si ocurre algún error al crear o escribir el fichero.
            e.printStackTrace();
        }
    }
}