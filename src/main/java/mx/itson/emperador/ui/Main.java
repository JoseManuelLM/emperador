
package mx.itson.emperador.ui;

import java.util.Scanner;
import mx.itson.emperador.operacion.Operacion;

/**
 * @author Jose Manuel Leyva Munguia
 */

/*
* Propósito del programa: 
        Separa una cadena de texto con IDs, apellidos y nombres de alumnos a partir de una expresión dada y brinda cada dato en
        un renglón.
    */

public class Main {

    public static void main(String[] args) {
        
        System.out.println("             --------------------             ");
        System.out.println("            |    ASIGNACION #1   |           ");
        System.out.println("             --------------------             ");
        
        //Se crea un objeto de la clase Scanner llamada "sc".
        Scanner sc = new Scanner (System.in);
        
        //Se le solicita al usuario ingresar una cadena de texto con los IDs, apellidos y nombres de los alumnos en una línea.
        System.out.println("Escriba el texto a separar: ");
        
        /*
        * Se abre un espacio para ingresar la cadena de texto con la información, esta despúes es escaneada por el objeto "sc" 
          y se guarda dentro de una variable del tipo String llamada "textoOriginal".
        */
        String textoOriginal = sc.nextLine();
        
        /*
        * Se crea un arreglo o array llamado "textoSeparado" del tipo String donde, mediante el método "separarTexto" de la clase "Operacion",
          separaremos el texto original guardado en la variable String "textoOriginal" y el resultado de dicha separacion será guardado en el
          arreglo mencionado.
        */
        
        String[] textoSeparado = new Operacion().separarTexto(textoOriginal);
        
        /*
        * Se crea un bucle for, donde cada separación almacenada en la variable "textoSeparado" sera guardada también en una variable del
          tipo String llamada "linea". El bucle se termina una vez que ya no haya más separaciones dentro de la variable "textoSeparado".
        */
        
        for (String linea : textoSeparado){
            
            /*
            * Se crea un arreglo o array denominado "datosSeparados" donde, mediante el metodo "separarDatos" de la clase "Operacion",
              separaremos los datos guardados en la variable "linea" y el resultado de dicha separación será guardado en el arreglo mencionado.
            */
            String [] datosSeparados = new Operacion().separarDatos(linea);
            /*
            * Finalmente, se imprime en pantalla cada dato separado en base a cada espacio en blanco dentro de cada linea con información 
              del alumno.
            
              Ejemplo -> 218241 López Duarte Luis Daniel
                               0     1      2    3
              Si se desea obtener el ID de la linea de un determinado alumno, se especificara el espacio en blanco "0", pues en el momento
              en el que dicho espacio aparece, el ID del alumno ya se ha escrito.
            */
            System.out.println("ID: " + datosSeparados[0] + " Nombre: " + datosSeparados[3] + " Apellidos: " + datosSeparados[1]);
        }
        
    }
    
}

