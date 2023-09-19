import java.util.ArrayList;
import java.util.Scanner;

public class MainArrayList {

    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        numeros = Pedir();
        Suma(numeros);
    }

    public static ArrayList<Double> Pedir(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        boolean compr=false;
        double num;
        while(compr==false){
            System.out.println("Ingrese números (Inserte 0 o menor para finalizar):");
            num=scanner.nextDouble();


            if(num>0){
                numeros.add(num);
                System.out.println("Número "+ num +" añadido");
            } else {
                compr=true;
            }
        }
        return numeros;
    }

    public static void Suma(ArrayList<Double> lista){
        double suma=0;
        for(double num:lista){
          suma=suma+num;
        }
        System.out.println("La suma de todos los números es "+suma);
    }
}
