import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        boolean menuActivo = true;
        Scanner sc;
        int valor1, valor2, resultado;
        while (menuActivo){
            System.out.println("Opción que quiere realizar:");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Salir");

            sc = new Scanner(System.in);
            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion){
                case 1:
                    System.out.println("Introduzca el primer numero:");
                    valor1 = sc.nextInt();
                    System.out.println("Introduzca el segundo numero:");
                    valor2 = sc.nextInt();
                    resultado = valor1 + valor2;
                    System.out.println("El resultado de la suma es " + resultado);
                    break;
                case 2:
                    System.out.println("Introduzca el primer numero:");
                    valor1 = sc.nextInt();
                    System.out.println("Introduzca el segundo numero:");
                    valor2 = sc.nextInt();
                    resultado = valor1 - valor2;
                    System.out.println("El resultado de la resta es " + resultado);
                    break;
                case 3:
                    System.out.println("Introduzca el primer numero:");
                    valor1 = sc.nextInt();
                    System.out.println("Introduzca el segundo numero:");
                    valor2 = sc.nextInt();
                    resultado = valor1 * valor2;
                    System.out.println("El resultado de la multiplicacion es " + resultado);
                    break;
                case 4:
                    System.out.println("Introduzca el primer numero:");
                    valor1 = sc.nextInt();
                    System.out.println("Introduzca el segundo numero:");
                    valor2 = sc.nextInt();
                    if (valor2 != 0 ) {
                        resultado = valor1 / valor2;
                        System.out.println("El resultado de la division es " + (double)resultado);
                    } else {
                        System.out.println("Lo siento, no es posible dividir entre 0");
                    }
                    break;
                case 5:
                    menuActivo = false;
                    break;
                default:
                    System.out.println("No se encuentra la opcion que has marcado. Intentalo de nuevo.");
                    break;
            }
        }
    }
}
