import java.io.FileReader;
import java.io.IOException;

public class F8_FileReader {

    // Este ejemplo lee el contenido de un fichero de texto utilizando FileReader

    public static void main(String[] args) {

        try {
            // Abrimos el fichero que queremos leer.
            FileReader fr = new FileReader("./src/ficheros/output.txt");

            // Variable donde se guardará cada carácter leído.
            // Se utiliza int porque read() devuelve -1 al llegar al final.
            int ch = fr.read();

            // Continuamos mientras no se haya alcanzado el final del fichero.
            while (ch != -1) {

                // Convertimos el valor leído en un carácter
                // y lo mostramos en la consola.
                System.out.print((char) ch);

                // Leemos el siguiente carácter.
                ch = fr.read();
            }

            // Cerramos el fichero y liberamos los recursos.
            fr.close();

        } catch (IOException e) {
            // Se ejecuta si ocurre algún problema al abrir o leer el fichero.
            System.out.println("Error de E/S");
        }
    }
}
