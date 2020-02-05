/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedalineal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Germayn
 */
public class Busquedalineal {

    static int lineastotales;
    static int total;
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File archivo = new File("/Users/Germayn/Documents/NetBeansProjects/busquedalineal/archivoprueba.txt");
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("palabra a buscar");
        String palabra = teclado.nextLine();
        System.out.println("");
        
        buscarpalabra(archivo,palabra);
        
    }
    
    public static void buscarpalabra(File archivo, String palabra) throws IOException{
        try {
            if (archivo.exists()) {
                BufferedReader leerarchivo = new BufferedReader(new FileReader(archivo));
                
                String linealeida;
                
                while((linealeida = leerarchivo.readLine()) != null){
                    //aumentar contador de linea
                    lineastotales = lineastotales + 1;
                    //separamos la liena en un arreglo
                    String[] palabras = linealeida.split(" ");
                    //recorremos el for
                    for (int i = 0; i < palabras.length; i++) {
                        //si la palabra es igual
                        if (palabras[i].equals(palabra)) {
                           //aumenta el contador de coincidencias
                           total = total + 1;
                           System.out.println(linealeida);
                           System.out.println("en la linea : "+ lineastotales + " esta la palabra: "+ total + " veces ");
                           System.out.println(" ");
                        }
                    }
                    
                }
            } 
 System.out.println("en total se encontro la palabra "
         + "" + palabra +", "+ total + " de veces" );
        } catch (Exception e) {
        
            System.out.println(e.getMessage());
        
        }
    }
}
 