import java.util.Scanner;

public class Calculadora {
    Scanner scanner = new Scanner(System.in);
    private int num1 = 0;
    private int num2 = 0;
    private int suma;

    public void setNum1() {
        boolean prim1 = true;
        boolean compr = false;
        while (compr == false) {
            System.out.println("Introduzca un numero primo:");
            prim1 = true;
            num1 = scanner.nextInt();
            if (num1 == 0 || num1 == 1) {
                prim1 = true;
            } else {
                for (int i = 2; i < num1; i++) {
                    if (num1 % i == 0) {
                        prim1 = false;
                        break;
                    }
                }
            }

            if (prim1) {
                compr = true;
                System.out.println("El numero introducido es primo");
            } else {
                System.out.println("El numero introducido no es primo,vuelve a intentarlo");
            }
        }
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2() {
        boolean prim2 = true;
        boolean compr2 = false;
        while (compr2 == false) {
            System.out.println("Introduzca un segundo numero primo:");
            prim2 = true;
            num2 = scanner.nextInt();
            if (num2 == 0 && num2 == 1) {
                prim2 = true;
            } else {
                for (int i = 2; i < num2; i++) {
                    if (num2 % i == 0) {
                        prim2 = false;
                        break;
                    }
                }
            }
            if (prim2) {
                compr2 = true;
                System.out.println("El numero introducido es primo");
            } else {
                System.out.println("El numero introducido no es primo,vuelve a intentarlo");
            }
        }
    }

    public int getNum2() {
        return num2;
    }

    public int Suma() {
        suma = num1 + num2;
        System.out.println("La suma de los numeros primos " + num1 + " y " + num2 + " es " + suma);
        return suma;
    }
}
