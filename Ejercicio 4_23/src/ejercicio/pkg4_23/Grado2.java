/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4_23;

/**
 *
 * @author Jhojan
 */
public class Grado2 extends Polinomio{

    /*Esta clase es por "temporal"
    Se espera encontrar una generalizacion para sus metodos
    cuando se tienen polinomios de grado n
    probablemente hasta para variable compleja*/
        
    public Grado2(int grado, double[] coeficientes) {
        super(grado, coeficientes);

    }
    
    /* Metodo tradicional por condicionales
    notar que los valores se guardan en los atributos del objeto*/
    public double[] calcular_raices(){
        double a = this.coeficientes[0];
        double b = this.coeficientes[1];
        double c = this.coeficientes[2];
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        if(discriminante > 0){
            this.raices[0] = (-b + Math.sqrt(discriminante)) / (2 * a);
            this.raices[1] = (-b - Math.sqrt(discriminante)) / (2 * a);
        }else if(discriminante == 0){
            this.raices[0] = -b / (2 * a);
            this.raices[1] = -b / (2 * a);
        }else{
           for (int i = 0; i < this.raices.length; i++) {
                this.raices[i] = Double.NaN;
            }
        }
        return this.raices;
    }
    

    
}
