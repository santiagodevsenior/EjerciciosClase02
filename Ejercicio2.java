import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        System.out.println("Vendedor de Pernil Iberic D'Engreix Llen");
        
        var entrada = new Scanner (System.in);

        System.out.println("Ingrese cuantos gramos desea ");

       

        float grams = entrada.nextFloat();
        double price = 5.95;

        double total = (grams/100) * price;

        

        System.out.printf("El precio de el producto es %.1f $\n" ,total);

        entrada.close();


         
        
    }
}
