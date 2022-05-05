/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.introducion;

/**
 *
 * @author jramos
 */
public class Introducion {

    public static void main(String[] args) {
        
        String nombre = "Gualbert";
        int a = 12;
              
        System.out.println("Hello World!");
        System.out.println(nombre);
        System.out.println(a+2+nombre); //si los dos primeros son numeros realizara una suma caso contrario concatenara
        
        //las variables se identifican con la notacion CAMELLO
        String apellido = "Ramos";
        System.out.println(apellido);
        System.out.println("mi nombre es:\n"+nombre);
        
        //CARACTERES ESPECIALES
        System.out.println("mi nombre es: \n"+nombre); // (\n) se usa para agregar un salto de linea
        System.out.println("mi nombre es: \t"+nombre); // (\t) se usa para agregar un tabulador
        System.out.println("ni nombre es: \b"+nombre); // (\b) se usa para volver un espacio
        System.out.println("mi nombre es: \r"+nombre); // (\r) retorno de carro agrega una nueva linea
        System.out.println("mi nombre es: \'"+nombre); // (\') agrega una comilla simple como caracter
    }
}
