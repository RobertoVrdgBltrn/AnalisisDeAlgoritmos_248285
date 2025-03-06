/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

/**
 * Esta clase contendra todos las pruebas de los algoritmos que se usaran en la
 * unidad
 *
 * @author Roberto Verdugo Beltran - 248285
 */
public class PruebasDeAlgoritmos {
    
    public static void main(String[] args) {        
        int[] a = {9,1,5};
        AlgoritmosDeOrdenamiento ado = new AlgoritmosDeOrdenamiento(a);
        
        System.out.println("Ordenamiento de Burbuja");
        ado.mostar();
        ado.burbuja(a);
        ado.mostar();
    }
}
