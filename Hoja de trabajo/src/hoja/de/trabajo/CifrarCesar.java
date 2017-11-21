/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo;

/**
 *
 * @author Pablo Herrera
 */
public class CifrarCesar {
    String cifrarcesar(String frase, int distancia){
       StringBuilder cifrado = new StringBuilder();
        distancia = distancia % 26;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z') {
                if ((frase.charAt(i) + distancia) > 'z') {
                    cifrado.append((char) (frase.charAt(i) + distancia - 26));
                } else {
                    cifrado.append((char) (frase.charAt(i) + distancia));
                }
            } else if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
                if ((frase.charAt(i) + distancia) > 'Z') {
                    cifrado.append((char) (frase.charAt(i) + distancia - 26));
                } else {
                    cifrado.append((char) (frase.charAt(i) + distancia));
                }
            }
        }
        return cifrado.toString();
    }
}
