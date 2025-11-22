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

        int i=0, j=1, count = 0;
        while (i < prices.size() - 1){
            if (j >= prices.size()) {                                       // si j mayor a igual a la longitud de la cadena reiniciamos valores
                i++;                                                        // ajusta posicion de"i"
                j=i+1;                                                      // ajusta posicion de "j" para ir una posicion por delante de "i"
                continue;                                                   // con el continue volvemos al inicio asi j no se adelante otra posicion
            }
            if (prices.get(i) + prices.get(j) <= budget) {                  // verifica si la suma de estos dos numeros son menores a budget
                count++;                                                    // suma en 1 al contador
            }
            j++;                                                            // suma en 1 a "j" para seguir recorriendo el arreglo
        }
        return count;                                                       // devolvemos el contador
    }
    public static void main(String[] args) {

//        ex1
//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        System.out.println(countAffordablePairs(list,7));
    }
}
