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
public class Cuadrilatero implements Poligono{

    private double Lado;
    private double Altura;
    private double areaCuadrado;
    private double PerimetroCuadrado;
    
    public Cuadrilatero(double lado, double altura){
        this.Lado = lado;
        this.Altura = altura;
    }

    
    public double getLado(){
        return Lado;
    }
    public void SetLado(double lado){
        this.Lado = lado;
    }
    public double getAltura(){
        return Altura;
    }
    public void SetAltura(double altura){
        this.Altura = altura;
    }
    public double getArea(){
        return areaCuadrado;
    }
    @Override
    public void Area() {
        areaCuadrado = Lado * Altura;
    }
    
    public double getPerimetro(){
        return PerimetroCuadrado;
    }
    
    @Override
    public void Perimetro() {
       PerimetroCuadrado = (Lado + Altura)*2;
    }
    
}
