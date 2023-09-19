import java.util.Scanner;

public class MainFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int limite = sc.nextInt();

        int num1 = 0, num2 = 1, suma = 0;

        System.out.println("Números de la serie de Fibonacci menores que " + limite + ":");

        while (suma < limite) {
            System.out.print(suma + " ");
            num1 = num2;
            num2 = suma;
            suma = num1 + num2;
        }
    }
}
