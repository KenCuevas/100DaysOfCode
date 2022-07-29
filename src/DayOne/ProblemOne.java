package DayOne;

public class ProblemOne {
    /*
    * If we list all the natural numbers below 10 that are multiples of 3 or 5,
    * we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.*/

    public static void main(String[] args) {
        int total = 0;
        //Utilizamos el bucle for para almacenar la cantidad de numeros.
        for (int i = 0; i < 1000; i++){
            //Evaluamos que cada numero que vaya iterando sea multiple de 3 o de 5.
            if (i % 3 == 0 || i % 5 == 0){
                //Le reasignamo el valor de cada recorrido al total (lo sumamos).
                total += i;
            }
        }
        //Presentamos por pantalla el total
        System.out.println("Total: " + total);
    }
}
