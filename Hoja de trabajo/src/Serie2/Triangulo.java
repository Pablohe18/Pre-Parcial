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
public class Triangulo implements Poligono {

    private double Base = 0;
    private double Altura = 0;
    private double AreaTriangulo = 0;
    private double Lados = 0;
    private double PerimetroTriangulo = 0;
    public Triangulo(double base, double altura, double lados){
        this.Base = base;
        this.Altura = altura;
        this.Lados = lados;
    }
    public double getLados(){
        return Lados;
    }
    public void setLados(double lados){
        this.Lados = lados;
    }
    public double getPerimetro(){
        return PerimetroTriangulo;
    }
    public double getBase() 
    {
        return Base;
    }
    
    public void setBase(double base){
        this.Base = base;
    }
        public double getAltura() 
    {
        return Altura;
    }
    
    public void setAltura(double altura){
        this.Altura = altura;
    }
    
    public double GetAreaTriangulo(){
        return AreaTriangulo;
    }
    @Override
    public void Area() {
        AreaTriangulo = ((Base * Altura)/2);
    }

    
    @Override
    public void Perimetro() {
        for (int i = 0; i < 3; i++) {
         PerimetroTriangulo = Lados + PerimetroTriangulo;
        }
    }
    
}
