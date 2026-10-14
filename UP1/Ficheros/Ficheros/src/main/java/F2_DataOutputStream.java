import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F2_DataOutputStream {
    public static void main(String[] args) {
        // Texto que se va a escribir en el fichero.
        String texto = "Hola";

        try {
            // FileOutputStream abre el fichero para escribir en él.
            // DataOutputStream permite escribir datos de tipos concretos:
            // enteros, caracteres, cadenas, etc.
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("./src/ficheros/archivoDataInputStream.dat")
            );

            // Escribe el número entero 1.
            // Un int ocupa 4 bytes.
            salida.writeInt(1);

            // Escribe el carácter 'a'.
            // En este tipo de flujo, un char ocupa 2 bytes.
            salida.writeChar('a');

            // Escribe la cadena utilizando un byte por cada carácter.
            // Para textos con tildes o caracteres especiales no es la opción más adecuada.
            salida.writeBytes(texto);

            // Cerramos el flujo y guardamos correctamente la información.
            salida.close();

        } catch (FileNotFoundException e) {
            // Se ejecuta si no se puede crear o encontrar el fichero.
            System.out.println(e.getMessage());

        } catch (IOException e) {
            // Se ejecuta si ocurre otro error de entrada o salida.
            System.out.println(e.getMessage());
        }
    }
}
