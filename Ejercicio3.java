public class Ejercicio3 {
    public static void main(String[] args) {
        
        //El agua de las granjas de Minnesota, Iowa, Illinois, Wisconsin, Missouri, Tennesse, Arkansas, 
        //Misssissipi y Louisiana desemboca en el Océano Atlántico produciendo un fenómeno llamado 
        //zona muerta. Debido a los altos niveles de nitrógeno y fósforo que traen estas aguas los 
        //peces mueren en grandes cantidades.
        
        //Para evitar que mueran cientos y cientos de peces, la ONG Salvemos los peces de colores 
        //ha decidido poner en cuarentena a 284 peces rojos y 163 peces azules en un gigantesco 
        //acuario, para devolverlos al mar cuando estén curados. 
        //¿Cuántos peces hay en total dentro del acuario?

        System.out.println("Peces en el acuario");

        var fishR = 284;
        var fishB = 163;
        var all = fishB + fishR;

        System.out.printf("Los peces que hay actualmenete en el acuerio es %s%n" ,all);
    }
}
