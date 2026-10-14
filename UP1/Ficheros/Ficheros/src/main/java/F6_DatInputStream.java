import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class F6_DatInputStream {
    public static void main(String[] args) {
        try {
            // Abrimos el fichero para leer datos binarios.
            // FileInputStream accede al fichero y DataInputStream
            // permite recuperar valores como int y char.
            DataInputStream dis = new DataInputStream(
                    new FileInputStream("./src/ficheros/archivoDataInputStream.dat")
            );

            // Leemos un entero.
            // Este método recupera los 4 bytes que ocupaba el int.
            int intLeido = dis.readInt();

            // Mostramos el entero recuperado.
            System.out.println("intLeido = " + intLeido);

            // Leemos un carácter.
            // readChar() recupera los 2 bytes que ocupaba el char.
            char charLeido = dis.readChar();

            // Mostramos el carácter recuperado.
            System.out.println("charLeido = " + charLeido);

            // Variable para leer los bytes restantes.
            int byteLeido;

            // Leemos el resto del fichero byte a byte.
            // read() devuelve -1 cuando llega al final.
            while ((byteLeido = dis.read()) != -1) {

                // Convertimos cada byte en carácter y lo mostramos.
                // En este caso se supone que el resto era texto sencillo.
                System.out.print((char) byteLeido);
            }

            // Cerramos el flujo.
            dis.close();

        } catch (FileNotFoundException e) {
            // Se ejecuta si el fichero no existe o la ruta indicada no es correcta.
            System.out.println(
                    "FileNotFoundException: " + e.getMessage()
            );

        } catch (IOException e) {
            // Se ejecuta si ocurre otro error durante la lectura.
            System.out.println(
                    "IOException: " + e.getMessage()
            );
        }
    }
}
