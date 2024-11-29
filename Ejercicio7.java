import java.util.Scanner;

public class Ejercicio7 {
        public static void main(String[] args) {
            
            System.out.println("-------------------------");
            System.out.println("   Calculadora Básica   ");
            System.out.println("-------------------------");

            var entrada = new Scanner (System.in);

            System.out.println("Digite su primer número");

            var digite1 = entrada.nextDouble();

            System.out.println("Digite su segundo número");

            var digite2 = entrada.nextDouble();

            var suma = digite1 + digite2;
            var resta = digite1 - digite2;
            var multiplicacion = digite1 * digite2;
            var division = digite1 / digite2;

            System.out.printf("Los resultados de la suma son %.2f \n",suma);
            System.out.printf("Los resultados de la resta son %.2f \n",resta);
            System.out.printf("Los resultados de la multiplicacion son %.2f \n",multiplicacion);
            System.out.printf("Los resultados de la division son %.2f \n",division);



        }
}
