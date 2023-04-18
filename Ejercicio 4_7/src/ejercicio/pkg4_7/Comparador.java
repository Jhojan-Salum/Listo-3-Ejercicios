/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4_7;

/**
 *
 * @author Jhojan
 */
public class Comparador {
    //Dados dos numeros A y B, compara si A es mayor, menor o igual
    public String comparar(int a, int b){
        if(a>b){
            return "A es mayor que B";
        }else if(a<b){
            return "A es menor que B";
        }else{
            return "A es igual a B";
        }
    }
    
}
