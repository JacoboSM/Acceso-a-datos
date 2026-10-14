package TF4_RandomeAccessFile_jacobo;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Modifica_un_entero {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


       try( RandomAccessFile archivo = new RandomAccessFile("src/ficheros/numeros.dat","rw")){


           if(!comprobarArchivoSoloInts(archivo)){

               return;

           }

           long totalEnteros = archivo.length() / 4;

           if (totalEnteros == 0){

               System.out.println("El fichero no tiene enteros");
               return;

           }

           System.out.print("Escribe la posicion del entero que quieras cambiar (1 - " + totalEnteros  + "): ");
           long posicion = read.nextLong();

            if (posicion < 1 || posicion > totalEnteros){

                System.out.println("La posicion no se encuentra entre las indicadas");
                return;

            }

            long posicionVerdadera = (posicion -1) * 4;

            archivo.seek(posicionVerdadera);

            int valorActual = archivo.readInt();

            System.out.println("Valor actual: " + valorActual);

            System.out.print("Introduce el valor que quieres poner: ");
            int valorNuevo = read.nextInt();

            archivo.seek(posicionVerdadera);

            archivo.writeInt(valorNuevo);

            System.out.println("Valor cambiado correctamente");

       }

    }

    public static boolean comprobarArchivoSoloInts(RandomAccessFile archivo) throws IOException {

        if(archivo.length() % 4 != 0){

            System.out.println("El fichero no cumple con los requisitos");

            return false;

        }

        return true;

    }

}
