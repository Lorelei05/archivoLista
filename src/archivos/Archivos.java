package archivos;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Noena
 */
public class Archivos {
//leer archivos de texto
    
     public static void leerArchivo() {
        File archivo = null;
        FileReader fReader = null;
        BufferedReader bf = null;
        
        try {
            // apuntador al archivo físico
            archivo = new File("C:\\Users\\pamel\\OneDrive\\Documentos\\Songs.txt" );
            
            // Abrimos el archivo para lectura
            fReader = new FileReader ( archivo );
            
            // Configurar Bufer Reader para hacer la lectura
            bf = new BufferedReader ( fReader );
            
            // Lectura del contenido del archivo
            String linea;
            
            // Mientras haya información en el archivo
            while ( (linea = bf.readLine()) != null )
                System.out.println(linea);
                
        } catch (Exception e) {
            System.out.println("No se encuentra el archivo");
            e.printStackTrace();
        } finally {
            // Este bloque se ejecuta siempre
            // Se cierra el archivo
            try {
                // Si se logró abrir el archivo, debemos cerrarlo
                if ( null != fReader ) {
                    fReader.close();
                }
            } catch( Exception e2 ) {
                System.out.println("Error al cerrar el archivo");
                e2.printStackTrace();
            }
        }
            
    }
    
   
    public static void escribirArchivo(){
       FileWriter archivo = null; // Especificando que trabajaremos con un archivo
        PrintWriter pw = null; // Se especifica que se trabaja con la clase PrintWriter
        BufferedReader bf = new BufferedReader(new InputStreamReader (System.in)); // Bufer de entrada
        String entrada;
        
        try {
            archivo = new FileWriter("C:\\Users\\pamel\\OneDrive\\Documentos\\Songs.txt"); // Escribir la ubicacion del archivo de texto
            pw = new PrintWriter ( archivo ); //Decirle a PrintWriter que se trabajara con el archivo mencionado arriba
            
            System.out.println("Escribe el nombre del artista: ");
            entrada = bf.readLine();
            pw.println( entrada ); //Agregar al archivo lo que escribimos en el teclado
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cerrar el archivo si es que se pudo abrir para escritura
                if ( null != archivo ) {
                    archivo.close();
                }
            } catch ( IOException e ) {
                System.out.println("Error al cerrar el archivo" );
                e.printStackTrace();
            }
        }
    }
     
    
     
    public static void main(String[] args) throws IOException {
       
        BufferedReader buferTeclado = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        String fileName;
        int opcion;
 
        
        System.out.println("Programa que manupula archivos de texto");
        System.out.println("");
        System.out.println("..............................................");
        System.out.println("");
        System.out.println("1 -Leer un archivo de texto existente");
        System.out.println("2 -Crear un archivo de texto");
        
        escribirArchivo();
        leerArchivo();
        
        System.out.println("¿Que quieres hacer?");
        entrada = buferTeclado.readLine();
        opcion = Integer.parseInt(entrada);
          System.out.println("Escribe el nombre del archivo");
          entrada = buferTeclado.readLine();
          fileName = entrada;
        switch(opcion){
            case 1: {
                //Lectura de un archivo de texto
                System.out.println("Lectura de un archivo existente");
                System.out.println("Contenido del archivo: ");
                leerArchivo();
            }
            break;
            case 2: {
                System.out.println("Creacion de un archivo de texto");
                escribirArchivo();
            }
            break;
            default: System.out.println("Opcion no valida");
        }
        
       
        
     
        
        /*System.out.println("Programa que lee un archivo de texto");
        System.out.println("--------------------------------------");
        System.out.println("Escribe el nombre del archivo al abrir: ");
        entrada = buferTeclado.readLine();
        System.out.println("Contenido del archivo");
        leerArchivo(entrada);*/       
    }
    
}