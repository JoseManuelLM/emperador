/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.emperador.operacion;

/**
 *
 * @author Josem
 */
public class Operacion {
    
     /**
    * El siguiente método llamado "separarTexto" separa una cadena de texto que contiene IDs, apellidos y nombres 
      de alumnos a partir de una expresión brindada.
    * @param texto Cadena de texto que será separada a partir de la expresión dada.
    * @return Array de String llamado "informacionAlumno" con las separaciones.
    */
    
    public String[] separarTexto(String texto){
        
        String[] informacionAlumno = texto.split(",");  
        return informacionAlumno;
        
    }
    
    /**
    * El siguiente método llamado "separarDatos" separa los IDs, apellidos y nombres de cada separacion de alumnos 
      a partir de una expresión brindada.
    * @param datos Cadena de texto que será separada a partir de la expresión dada.
    * @return Array de String llamado "conjuntoDatos" con los datos segmentados de cada separación.
    */
    
    public String[] separarDatos(String datos){
        
        String[] conjuntoDatos = datos.split(" ");  
        return conjuntoDatos;
        
    }
    
}

