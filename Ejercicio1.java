public class Ejercicio1 {

    public static void main(String[] args) {
        
        System.out.println("--------calculadora------");
        System.out.println("Primer Caso");

        var number1 = 6;
        var number2 = 2*(1+2);
        var number3 = number1 / number2;

        System.out.printf("El resulado de la operacion es %s%n", number3);
        System.out.println("Segundo caso");

        var num1 = (6/2)*(1+2);
        System.out.println(num1);
    }
}