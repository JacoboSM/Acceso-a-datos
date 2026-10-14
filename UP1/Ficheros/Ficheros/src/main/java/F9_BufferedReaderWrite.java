import java.io.*;

public class F9_BufferedReaderWrite {

    public static void main(String[] args) {

        // Escritura del fichero
        try (
                // FileWriter accede al fichero y BufferedWriter
                // utiliza un búfer para mejorar el rendimiento.
                BufferedWriter writer = new BufferedWriter(
                        new FileWriter("./src/ficheros/caracteres_Buff.txt")
                )
        ) {
            // Escribimos el texto en el fichero.
            writer.write("Hola, mundo!");

            // No es necesario llamar a close().
            // try-with-resources cierra automáticamente el escritor.
        } catch (IOException e) {
            // Mostramos el error si no se puede escribir.
            e.printStackTrace();
        }

        // Lectura del fichero
        try (
                // FileReader accede al contenido y BufferedReader
                // permite leerlo de forma más cómoda y eficiente.
                BufferedReader reader = new BufferedReader(
                        new FileReader("./src/ficheros/caracteres_Buff.txt")
                )
        ) {
            String line;

            // Leemos una línea cada vez.
            // readLine() devuelve null al llegar al final.
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // El lector se cierra automáticamente.
        } catch (IOException e) {
            // Mostramos el error si no se puede leer.
            e.printStackTrace();
        }
    }
}