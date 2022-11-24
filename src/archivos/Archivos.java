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
   
    public static void leerArchivo(String name){
        File archivo = null; //apunta a un archivo fisico de dd
        FileReader fr = null; //para leer el archivo 
        BufferedReader bufer = null;
        try{
            //creamos un apuntador al archivo físico
            archivo = new File("C:\\Users\\pamel\\OneDrive\\Documentos\\" + name);
            //abrimos el archivo para lectura
            fr = new FileReader(archivo);
            //configurar bufer para hacer la lectura
            bufer = new BufferedReader(fr);
            
            //Lectura del contenido del archivo 
            String linea;
            //mientras haya informacion en el archivo
            while ((linea = bufer.readLine())!= null)
                System.out.println("Linea de archivo " + linea);
                
        }catch(Exception e){
            System.out.println("No se encuentra el archivo");
            e.printStackTrace();
        }finally{
            //esta cláusula se ejecuta siempre
            //Se cierra el archivo
            try{
                //si se logro abrir el archivo,debemos cerrarlo
                if(null != fr){
                    fr.close();
                }
            }catch (Exception e2){
                System.out.println("Error al cerrar el archivo");
                e2.printStackTrace();
            }
        }
        
    }
    public static void escribirArchivo(String name){
    FileWriter archivo = null;
    PrintWriter pw = null;
    BufferedReader bufer2 = new BufferedReader(new InputStreamReader(System.in));
    String entrada;
    char respuesta;
    try{
        archivo = new FileWriter("C:\\Users\\pamel\\OneDrive\\Documentos\\" + name + ".txt");
        pw = new PrintWriter(archivo);
        do{
            System.out.println("Escribe informacion a guardar en el archivo: ");
            entrada = bufer2.readLine();
            //Agrega lo leido en teclado al archivo en disco
            pw.println(entrada);
            
            System.out.println("Escribe s para continuar, n para parar");
            entrada = bufer2.readLine();
            respuesta = entrada.charAt(0);
        }while(respuesta != 'n');
        
    }catch(Exception e){
      System.out.println("Error al escribir el archivo: " + name);
      e.printStackTrace();
      }finally{
        try{
            //Cerrar el archivo i es que se pudo abrir para escritura
            if(null != archivo){
                archivo.close();
            }
        }catch (Exception e2){
            System.out.println("Error al cerrar archivo" + name);
            e2.printStackTrace();
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
                leerArchivo(entrada);
            }
            break;
            case 2: {
                System.out.println("Creacion de un archivo de texto");
                escribirArchivo(fileName);
            }
            break;
            default: System.out.println("Opcion no valida");
        }
        
        
        //*//
        while (!salir){
            System.out.println("");
            System.out.println("M E N U");
            System.out.println("...............................");
            System.out.println("");
            System.out.println("1. Ver artistas");
            System.out.println("2. Insertar");
            System.out.println("3. Eliminar");
            System.out.println("4. Agregar album");
            System.out.println("5. Ver album");
            System.out.println("7. Agregar cancion");
            System.out.println("Ver cancion");
            try{
                System.out.println("Ingrese el numero de la opcion a seleccionar: ");
                opcion=teclado.nextInt(); 
                switch(opcion){
                    case 1;
                    int t=0;
                    for (int j=0; j<=tam-1; j++){
                        System.out.println("");
                        System.out.println("");
                    }
                }
                    
            }
        }
            
        
        
        /*System.out.println("Programa que lee un archivo de texto");
        System.out.println("--------------------------------------");
        System.out.println("Escribe el nombre del archivo al abrir: ");
        entrada = buferTeclado.readLine();
        System.out.println("Contenido del archivo");
        leerArchivo(entrada);*/       
    }
    
}