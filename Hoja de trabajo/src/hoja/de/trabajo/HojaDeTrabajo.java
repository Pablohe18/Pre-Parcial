/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo;

import java.util.Scanner;

/**
 *
 * @author Pablo Herrera
 */
public class HojaDeTrabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner SC = new Scanner(System.in);
        CifrarCesar CC = new CifrarCesar();
        String Frase = null;
        int distancia = 0;
        System.out.println("Ingrese su frase");
        Frase = SC.nextLine();
        System.out.println("Ingrese el codigo de distancia");
        distancia = SC.nextInt();
        System.out.println("Su frase Cifrada es: " + CC.cifrarcesar(Frase, distancia));
    }
    
}
