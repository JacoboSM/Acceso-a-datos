import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class F3_DataOutputStreamSinBuffer {
    public static void main(String[] args) {
        // Número de enteros que se van a escribir.
        int cantidadDatos = 1000000;

        // Guardamos el momento en el que comienza la prueba.
        long inicioSinBuffer = System.currentTimeMillis();

        try {
            // Abrimos el fichero para escribir datos binarios.
            // DataOutputStream permite escribir valores como int.
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("./src/ficheros/sin_buffer.bin"));

            // Repetimos la escritura un millón de veces.
            for (int i = 0; i < cantidadDatos; i++) {
                // Cada entero ocupa 4 bytes.
                dos.writeInt(i);
            }

            // Cerramos el flujo y terminamos la escritura.
            dos.close();

        } catch (IOException e) {
            // Mostramos el error si ocurre algún problema.
            e.printStackTrace();
        }

        // Guardamos el momento en el que termina la prueba.
        long finSinBuffer = System.currentTimeMillis();

        // Calculamos y mostramos el tiempo utilizado.
        System.out.println(
                "Tiempo con DataOutputStream: "
                        + (finSinBuffer - inicioSinBuffer)
                        + " ms"
        );
    }
}
