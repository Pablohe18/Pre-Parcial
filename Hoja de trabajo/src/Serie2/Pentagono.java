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
public class Pentagono implements Poligono{

    private double Lado;
    private double Aponea;
    private double AreaPentagono;
    private double Perimetro;
    private int Lados;
    
    public Pentagono(int lados, double lado, double aponea){
        this.Lado = lado;
        this.Aponea = aponea;
        this.Lados = lados;
        Perimetro = lados * lado;
    }
     public double getLados(){
        return Lados;
    }
    public void SetLados(int lados){
        this.Lados = lados;
    }
    public double getLado(){
        return Lado;
    }
    public void SetLado(double lado){
        this.Lado = lado;
    }
    public double getAponea(){
        return Aponea;
    }
    public void SetAponea(double aponea){
        this.Aponea = aponea;
    }
    
    public double GetArea(){
        return AreaPentagono;
    }
    public double GetPerimetro(){
        return Perimetro;
    }
    @Override
    public void Area() {
        AreaPentagono = (Perimetro * Aponea)/2;
    }

    @Override
    public void Perimetro() {
        Perimetro = Lados * Lado;
    }
    
}
