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
        int[] a = {5, 3, 6}; // Array desordenado
        AlgoritmosDeOrdenamiento ado = new AlgoritmosDeOrdenamiento(a);
        ado.insercion(a);
        ado.mostar();
        
    }
}
