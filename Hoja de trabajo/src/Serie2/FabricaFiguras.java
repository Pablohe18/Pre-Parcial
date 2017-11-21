/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serie2;

/**
 *
 * @author Pablo Herrera
 */
public class FabricaFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado panchito = new Cuadrado(10,10);
        panchito.Area();
        System.out.println("El Area de panchito cuadrado es de :" + panchito.getArea());
        panchito.Perimetro();
        System.out.println("El Perimetro de panchito cuadrado es de :" + panchito.getPerimetro());
    }
    
}
