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
        // Recorremos desde el segundo elemento
        for (int i = 1; i < a.length; i++) { 
            // Elemento a insertar en su posición correcta
            int clave = a[i];  
            int j = i - 1;

            // Mover elementos mayores a la derecha
            while (j >= 0 && a[j] > clave) {
                // Desplazamiento
                a[j + 1] = a[j];
                j--;
            }
            // Insertar el elemento en su lugar correcto
            a[j + 1] = clave; 
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
        // Caso Base: Si el segmento tiene al menos 2 elementos, continuamos
        if (inicio < fin) {
            // Obtener el índice del pivote después de la partición
            int pivote = particionar(a, inicio, fin);

            // Aplicar QuickSort en la parte izquierda (menores al pivote)
            quickSort(a, inicio, pivote - 1);
            // Aplicar QuickSort en la parte derecha (mayores al pivote)
            quickSort(a, pivote + 1, fin);
        }
    }

    private static int particionar(int a[], int inicio, int fin) {
        // Seleccionamos el pivote (último elemento del segmento)
        int pivote = a[fin];
        int i = inicio - 1; // Índice del menor elemento encontrado

        // Recorrer el segmento y mover elementos menores o iguales al pivote hacia la izquierda
        for (int actual = inicio; actual < fin; actual++) {
            if (a[actual] <= pivote) { // Se cambió '<' por '<=' para mayor estabilidad en algunos casos
                i++;
                // Intercambiar elementos si es necesario
                if (i != actual) { // Evita intercambios innecesarios
                    intercambiar(a, i, actual);
                }
            }
        }

        // Colocar el pivote en su posición final (después del último menor encontrado)
        intercambiar(a, i + 1, fin);

        return i + 1; // Retornar la posición final del pivote
    }

    private static void intercambiar(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
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
