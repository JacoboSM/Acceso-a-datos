package TF4_RandomeAccessFile_jacobo;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Busqueda_y_modificacion_de_texto {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        try( RandomAccessFile archivo = new RandomAccessFile("src/ficheros/pruba.txt","rw")){

            System.out.print("Introduce la palabra que deseas buscar: ");
            String palabra = read.nextLine();

            if(!comprobarPalabra(palabra)){

                return;
            }

            int lineasModificadas = 0;

            while(true){

                long inicioLinea = archivo.getFilePointer();

                String linea = archivo.readLine();

                if (linea == null){

                    break;

                }

                long finalLinea = archivo.getFilePointer();



                if (linea.contains(palabra)){

                    String modificaLinea = linea.replace(palabra,palabra.toUpperCase());
                    lineasModificadas++;

                    archivo.seek(inicioLinea);

                    archivo.writeBytes(modificaLinea);

                    archivo.seek(finalLinea);

                    System.out.println(modificaLinea);

                }else{

                    System.out.println(linea);

                }



            }

            System.out.println("Lineas modificadas: " + lineasModificadas);


        }

    }

    public static boolean comprobarPalabra(String palabra){

        if(palabra.isEmpty()){

            System.out.println("No puedes dejar la palabra vacia");
            return false;

        }

        return true;

    }

}
