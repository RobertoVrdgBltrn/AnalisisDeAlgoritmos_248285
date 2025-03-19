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
    public static void burbuja(int[] a) {
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

    public void insercion(int[] a) {
        for (int i = 1; i < a.length; i++) { // Recorremos desde el segundo elemento
            int clave = a[i];  // Elemento a insertar en su posición correcta
            int j = i - 1;

            // Mover elementos mayores a la derecha
            while (j >= 0 && a[j] > clave) {
                a[j + 1] = a[j]; // Desplazamiento
                j--;
            }
            a[j + 1] = clave; // Insertar el elemento en su lugar correcto
        }
    }

    public static void seleccion(int[] a) {
        int n = a.length; // 1
        for (int i = 0; i < n - 1; i++) { // Nos va a dar la posicion del elemento mas pequeno de la lista
            int minIndex = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambio
            int aux = a[minIndex];
            a[minIndex] = a[i];
            a[i] = aux;
        }
    }

    public static void quickSort(int a[], int inicio, int fin) {
        int pivote = particionar(a, inicio, fin); // Pivote con valor del ultimo indice del arreglo

        // Recursion a la izquierda
        quickSort(a, inicio, pivote - 1);

        quickSort(a, pivote + 1, fin);
    }

    // Metodo necesario para quickSort
    private static int particionar(int a[], int inicio, int fin) {
        // Seleccionar el pivote
        int pivote = a[fin];

        // Seleccionar el indice mas pequeno con respecto al pivote
        int i = inicio - 1;

        // Recorrer todo el arreglo buscando elemento menores al pivote para intercambiarlos
        for (int actual = inicio; actual < fin; actual++) {
            if (a[actual] < pivote) {
                i++;
                int aux = a[i];
                a[i] = a[actual];
                a[actual] = aux;
            }
        }
        int temp = a[i];
        a[i] = a[fin];
        a[fin] = temp;
        
        return i;
    }

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
