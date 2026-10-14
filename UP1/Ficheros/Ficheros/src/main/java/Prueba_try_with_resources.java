import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Prueba_try_with_resources {

    // El try_with_resources sirve para abrir un recurso leer o escribir dentro de él y si ocurre un erro que se cierre correctamente
    // al contrario que .close que si ocurre un error antes de llegar a él podriamos no cerrarlo correctamente

    //Formas de lecturas de datos:
    //     -Secuencial: Recorre el fichero desde la primera línea hasta que encuentra el registro que buscamos
    //     -Aleatorio: Podemos desplazarnos hasta el registro directamente conociendo su posición

    //La información dentro de los ficheros son bytes por lo que si decimos "ir a la posción 20" estamos diciendo que coja los bytes a partir del byte 20

    //Un puntero es como una marca en un mapa siendo este mapa el fichero

    //Para abrir un fichero con RandomeAccesFile tenemos que saber que este cuando lo inicializamos le indicamos dos 3:
    // -Nombre de la variable que representa el fichero "RandomeAccesFile nombreVariable"
    // -Fichero al que accede "RandomeAccesFile nombreVariable("nombreFichero.extension")
    // -Qué acción realizaremos con ese fichero "RandomeAccesFile nombreVariable(nombreFichero.extension, rw)"

    public static void main(String[] args) throws IOException {
//
//        try (RandomAccessFile raf = new RandomAccessFile("Datos.dat", "rw")) {
//
//
//            //Posicion 0 acabamos de abrir el fichero
//            System.out.println(raf.getFilePointer());
//
//            //Después de hacer este writeInt estaremos en posicion 4, ya que Int ocupa 4 bytes
//            raf.writeInt(25);
//            System.out.println(raf.getFilePointer());
//
//            //Después de hacer este writeDouble estaremos en posicion 12, ya que double ocupa 8 bytes
//            raf.writeDouble(7.5);
//            System.out.println(raf.getFilePointer());
//
//            //Gracias a RandomeAccessFile podemos utilizar seek que nos permite mover el puntero a donde queramos
//            //En este caso al byte 0 el inicio del fichero
//            raf.seek(0);
//
//            //Al byte 20
//            raf.seek(20);
//
//            //Va al final del archivo
//            raf.seek(raf.length());
//
//            //Leemos un int desde el byte 0
//            raf.seek(0);
//            int numero = raf.readInt();
//
//            //Escribimos un int desde el byte 0
//            raf.seek(0);
//            raf.writeInt(99);
//
//        }

        //Vamos a modificar un numero entero que se encuentra entre otros dos

        try (RandomAccessFile raf = new RandomAccessFile("src/ficheros/numeros.dat","rw")){

            //Vaciamos el fichero
            raf.setLength(0);


            raf.writeInt(10); //bytes 0-3
            raf.writeInt(20); //bytes 4-7
            raf.writeInt(30); //bytes 8-11

            //raf.seek(4);
            //raf.writeInt(99);
        }






    }


}
