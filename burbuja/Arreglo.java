
import java.util.Scanner;

public class Arreglo {
    private int[] arreglo;

    // Constructor que solicita al usuario la longitud y los enteros del arreglo
    public Arreglo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del arreglo: ");
        int longitud = scanner.nextInt();
        arreglo = new int[longitud];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
    }

    // Método para ordenar el arreglo de mayor a menor usando el algoritmo de burbuja
    public void ordenarDeMayorAMenor() {
        int n = arreglo.length;
        boolean intercambiado;

        do {
            intercambiado = false;
            for (int i = 0; i < n - 1; i++) {
                if (arreglo[i] < arreglo[i + 1]) {
                    // Intercambiar elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                    intercambiado = true;
                }
            }
        } while (intercambiado);
    }

    // Método para ordenar el arreglo de menor a mayor usando el algoritmo de burbuja
    public void ordenarDeMenorAMayor() {
        int n = arreglo.length;
        boolean intercambiado;

        do {
            intercambiado = false;
            for (int i = 0; i < n - 1; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    // Intercambiar elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                    intercambiado = true;
                }
            }
        } while (intercambiado);
    }

    // Método para imprimir el arreglo
    public void imprimirArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Arreglo miArreglo = new Arreglo();

        System.out.println("Arreglo original:");
        miArreglo.imprimirArreglo();

        // Ordenar de mayor a menor
        miArreglo.ordenarDeMayorAMenor();
        System.out.println("Arreglo ordenado de mayor a menor:");
        miArreglo.imprimirArreglo();

        // Ordenar de menor a mayor
        miArreglo.ordenarDeMenorAMayor();
        System.out.println("Arreglo ordenado de menor a mayor:");
        miArreglo.imprimirArreglo();
    }
}
