/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg5_40;

/**
 *
 * @author Jhojan
 */
public class Clasexd {
    //Clase que recibe una lista de numeros tipo string separados por coma
    String lista;
    double[] numeros;
    String[] listaNumeros;
    public Clasexd(String lista){
        this.lista = lista;
    //Convertir la string en un arreglo de numeros
    listaNumeros = lista.split(",");
    numeros = new double[listaNumeros.length];
    for (int i = 0; i < listaNumeros.length; i++) {
        numeros[i] = Double.parseDouble(listaNumeros[i]);
    }
    }

    //retornar raiz cuadrada
    public String raizCuadrada(){
        String[] raices = new String[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            raices[i] = String.valueOf(Math.sqrt(numeros[i]));
        }
        return String.join(",", raices);
    }
    //retornar cuadrado
    public String cuadrado(){
        String[] cuadrados = new String[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            cuadrados[i] = String.valueOf(Math.pow(numeros[i], 2));
        }
        return String.join(",", cuadrados);
    }
    //retornar cubo
    public String cubo(){
        String[] cubos = new String[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            cubos[i] = String.valueOf(Math.pow(numeros[i], 3));
        }
        return String.join(",", cubos);
        
    }

        
    
}
