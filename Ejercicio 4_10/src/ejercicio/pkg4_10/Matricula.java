/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4_10;

/**
 *
 * @author Jhojan
 */
public class Matricula {
    //Clase que dado el estrato y el patrimonio, calcula la matricula de un estudiante
    //Constructor
    public int estrato;
    public double patrimonio;
    public double matricula;

    public Matricula(int estrato, double patrimonio){
        this.estrato = estrato;
        this.patrimonio = patrimonio;
    }

    //Metodo para calcular la matricula del estudiante
    //Valor constante de 50.000 y si patrimonio es mayor a 2.000.000 y el estrato es mayor a 3, se le suma 3%
    public double calcularMatricula(){
        matricula = 50000;
        if(patrimonio > 2000000 && estrato > 3){
            matricula = matricula + (patrimonio*0.03);
        }
        return matricula;
        
    }

    
}
