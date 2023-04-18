/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg3_18;

/**
 *
 * @author Jhojan
 */
public class Salario {
    //Constructor
    double SalarioHora = 0; 
    double HorasTrabajadas = 0;
    double SalarioBruto = 0;
    double SalarioNeto = 0;
    double Retencion = 0;
    public Salario(double SalarioHora, double HorasTrabajadas, double Retencion){
        this.SalarioHora = SalarioHora;
        this.HorasTrabajadas = HorasTrabajadas;
        this.Retencion = Retencion;
    }
    //Metodos
    public double CalcularSalarioBruto(){
        SalarioBruto = SalarioHora * HorasTrabajadas;
        return SalarioBruto;
    }
    public double CalcularSalarioNeto(){
        SalarioNeto = SalarioBruto - (SalarioBruto *(Retencion/100));
        return SalarioNeto;
    }
}
