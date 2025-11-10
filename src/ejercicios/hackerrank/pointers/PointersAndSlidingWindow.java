package ejercicios.hackerrank.pointers;

import java.util.List;

public class PointersAndSlidingWindow {
    /**
     * EJERCICIO 1
     * Se debe encontrar pares de numeros no repetidos que la suma sean menores
     * o iguales que el entero "budget"
     * Devuelve la cantidad de pares de numeros encontrados
     * EJEMPLO: tienes= [1,2,3,4], y budget =5. resultado =[1,2][1,3][1,4][2,3] = 4
     */
    public static int countAffordablePairs(List<Integer> prices, int budget) {
        // inicializamos dos punteros i y j, Ademas del contador
        // "i" avanzara cada vez que "j" llegue asta el numero item del array
        int i=0, j=1, count = 0;
        // loop mientras i sea menor a la longitud del array
        while (i < prices.size() - 1){
            // si j es igual o mayor a la longitud
            if (j >= prices.size()) {
                // avanzamos a la siguiente posicion del array
                i++;
                // movemos a "j" a su nueva posicion, es decir, una posicion delante de "i"
                // para seguir con el recorrido
                j=i+1;
                // volvemos al inicio para evitar la siguiente condicional
                continue;
            }
            // verificamos si la suma de estos numeros son menores a budget, de ser asi, se van contabilizando
            if (prices.get(i) + prices.get(j) <= budget) {
                count++;
            }
            // aumentamos en 1 el puntero
            j++;
        }
        return count;
    }
    public static void main(String[] args) {

//        ex1
//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        System.out.println(countAffordablePairs(list,7));
    }
}
