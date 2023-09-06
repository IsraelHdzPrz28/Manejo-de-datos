
import java.util.Scanner;
public class Arreglo
{
    
    int[] vector;
    int maximo = vector[0];
    int minimo = vector[0];
    int suma = vector[0];
    Scanner in=new Scanner(System.in);
    int longitud = in.nextInt();
    public Arreglo(){
        Scanner in=new Scanner(System.in);
        System.out.println("Ingresa la dimensión del arreglo");
        int longitud = in.nextInt();
        vector = new int[longitud];
        for(int i=0;i<longitud;i++){
            System.out.println("Ingresa el número de la posición "+(i+1));
            int numero = in.nextInt();
            vector[i]=numero;
        }
    
    }
    
    public int maximo(){
        for (int i = 1; i< longitud; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i]; 
            }
        }
        return maximo;
    }
    
    public int minimo(){
        for (int i = 1; i< longitud; i++) {
            if (vector[i] < minimo) {
                minimo = vector[i]; 
            }
        }
        return minimo;
    }
    
    public double media(){
        for (int i = 1; i< longitud; i++) {
            suma += vector[i];
            double media = (double) suma / longitud;
            }
        double media = (double) suma / longitud;
        return media;
        }
    }


