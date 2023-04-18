/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4_22;

/**
 *
 * @author Jhojan
 */
public class Empleado {
    //Dado el salario basico de un empleado y el numero de horas trabajadas en un mes, se halla el salario mensual
    double salarioBasico, salarioMensual, horasTrabajadas;
    public String nombre;
    public Empleado(String nombre, double salarioBasico, double horasTrabajadas){
        this.salarioBasico = salarioBasico;
        this.horasTrabajadas = horasTrabajadas;
        this.nombre = nombre;
    }

    public double CalcularSalarioMensual(){
        return salarioMensual = salarioBasico * horasTrabajadas;
}
}
