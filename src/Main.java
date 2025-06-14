import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1: Suma de dos números
        System.out.println("\n--- Ejercicio 1: Suma de dos números ---");
        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);

        // Ejercicio 2: Área de un rectángulo
        System.out.println("\n--- Ejercicio 2: Área de un rectángulo ---");
        System.out.print("Introduce la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Introduce la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);

        // Ejercicio 3: Conversión de grados Celsius a Fahrenheit
        System.out.println("\n--- Ejercicio 3: Conversión de grados Celsius a Fahrenheit ---");
        System.out.print("Introduce la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);

        // Ejercicio 4: Cálculo del perímetro de un círculo
        System.out.println("\n--- Ejercicio 4: Cálculo del perímetro de un círculo ---");
        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El perímetro del círculo es: " + perimetro);

        scanner.close();
    }
}

