/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeo;

/**
 *
 * @author Jhojan
 */
public class Triangulo_rectangulo extends FiguraGeometrica {
    double base;
    double altura;
    
public Triangulo_rectangulo(double base, double altura){
   
    this.base = base;
    this.altura = altura;
}
    @Override
    public double area(){
      return (base * altura/2);
     
}
    @Override
    public double perimeter(){
      return (base + altura + calcularHipotenusa());
     
}
    double calcularHipotenusa(){
      return Math.pow(base*altura + altura*altura, 0.5);
 }

    public String determinarTipoTriangulo(){
        if((base==altura)&&(base==calcularHipotenusa())&&(altura == calcularHipotenusa())){
            return "Es un triangulo equilatero";
          }
        else if((base != altura)&&(base != calcularHipotenusa())&&(altura != calcularHipotenusa())){
            return "Es un triangulo escaleno";
          }
        else {
            return "Es un triangulo isosceles ";
        }
    }
}
