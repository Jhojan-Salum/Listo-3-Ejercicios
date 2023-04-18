/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg3_19;

/**
 *
 * @author Jhojan
 */
public class Triangulo_Equilatero {
    //Clase que dado el lado de un triangulo equilatero calcula la altura y el area
    private double lado;
    public Triangulo_Equilatero(double lado){
        this.lado=lado;
    }

    public double CalcularAltura(){
        return Math.sqrt(Math.pow(lado, 2)-Math.pow(lado/2, 2));
    }

    public double CalcularArea(){
        return (lado*CalcularAltura())/2;
    }
}
