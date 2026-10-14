import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class F4_DataOutputStreamConBuffer {
    // Este ejemplo hace lo mismo que el anterior, pero añade un búfer para mejorar el rendimiento.

    public static void main(String[] args) {
        // Número de enteros que se van a escribir.
        int cantidadDatos = 1_000_000;

        // Guardamos el momento de inicio de la prueba.
        long inicioConBuffer = System.currentTimeMillis();

        try {
            // FileOutputStream escribe en el fichero.
            // BufferedOutputStream acumula datos en memoria antes de enviarlos.
            // DataOutputStream permite escribir valores como enteros.
            DataOutputStream salida = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("./src/ficheros/con_buffer.bin")));

            // Escribimos un millón de enteros de forma secuencial.
            for (int i = 0; i < cantidadDatos; i++) {
                // Cada entero ocupa 4 bytes.
                // Los datos se van acumulando temporalmente en el búfer.
                salida.writeInt(i);
            }

            // Cerramos todos los flujos.
            // Al cerrar, los datos que aún quedan en el búfer se escriben en el fichero.
            salida.close();

        } catch (IOException e) {
            // Mostramos el error si ocurre algún problema.
            e.printStackTrace();
        }

        // Guardamos el momento en el que termina la prueba.
        long finConBuffer = System.currentTimeMillis();

        // Calculamos y mostramos el tiempo total empleado.
        System.out.println(
                "Tiempo con BufferedOutputStream: "
                        + (finConBuffer - inicioConBuffer)
                        + " ms"
        );
    }

}
