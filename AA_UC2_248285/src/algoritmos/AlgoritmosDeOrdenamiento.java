/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

/**
 * Esta clase contendra todos los algoritmos de ordenamiento que se usaran en la
 * unidad
 *
 * @author Roberto Verdugo Beltran - 248285
 */
public class AlgoritmosDeOrdenamiento {

    private int a[];

    /**
     * Constructor
     *
     * @param a
     */
    public AlgoritmosDeOrdenamiento(int[] a) {
        this.a = a;
    }

    /**
     * Metodo donde se aplica el algoritmo Bubble Sort
     *
     * @param a
     */
    public void burbuja(int[] a) {
        // 1 
        for (int i = 0; i < a.length - 1; i++) { // (n - 1)
            // 1 
            for (int j = 0; j < a.length - 1 - i; j++) { //(n - 1 - i)
                // 1
                if (a[j] > a[j + 1]) {
                    // 3 
                    int aux = a[j];  // 1
                    a[j] = a[j + 1]; // 1
                    a[j + 1] = aux;  // 1
                }
            }
        }
    } // n^2 + n + 4 

    /**
     * Metodo para mostrar el arreglo en las pruebas
     */
    public void mostar() {
        System.out.println("Arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("[ " + a[i] + " ]");
        }
    }
}
