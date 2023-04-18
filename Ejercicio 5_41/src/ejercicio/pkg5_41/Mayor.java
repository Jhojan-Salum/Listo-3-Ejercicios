/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg5_41;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Jhojan
 */
public class Mayor{
    //Clase que recibe una lista de numeros tipo string separados por coma
    String lista;
    List<Double> numeros = new ArrayList<Double>();
    String[] listaNumeros;
    public Mayor(String lista){
        this.lista = lista;
        //Convertir la string en un arreglo de numeros
        listaNumeros = lista.split(",");
        List<String> list = Arrays.asList(listaNumeros); 
        for (int i = 0; i < list.size(); i++) {
            numeros.add(i,Double.parseDouble(list.get(i)));
        }
}

    public String mayor(){
        return String.valueOf(Collections.max(numeros));
    }


}
