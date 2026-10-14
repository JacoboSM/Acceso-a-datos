import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class F5_FileInputStream {
    public static void main(String[] args) {
        try {
            // Abrimos el fichero binario para leerlo.
            // Este fichero debe haberse creado previamente con FileOutputStream.
            FileInputStream fis = new FileInputStream("./src/ficheros/pruba.txt");

            // Leemos el primer byte del fichero.
            // El método read() devuelve un int entre 0 y 255.
            int byteLeido = fis.read();

            // Mostramos el valor numérico del primer byte
            // y también intentamos mostrarlo como carácter.
            System.out.println("byteLeido = " + byteLeido + ", pasado a char = " + (char) byteLeido);

            // Leemos el resto de los bytes uno a uno.
            // Cuando read() devuelve -1, significa que hemos llegado
            // al final del fichero.
            while ((byteLeido = fis.read()) != -1) {

                // Convertimos el byte leído en carácter
                // y lo mostramos sin saltar de línea.
                System.out.print((char) byteLeido);
            }

            // Cerramos el fichero después de terminar la lectura.
            fis.close();

        } catch (FileNotFoundException e) {
            // Se ejecuta si el fichero no existe
            // o la ruta indicada no es correcta.
            System.out.println(e.getMessage());

        } catch (IOException e) {
            // Se ejecuta si ocurre cualquier otro error de lectura.
            System.out.println(e.getMessage());
        }
    }
}
