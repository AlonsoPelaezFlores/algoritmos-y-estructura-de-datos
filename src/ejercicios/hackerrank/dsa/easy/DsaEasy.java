package ejercicios.hackerrank.dsa.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DsaEasy {
    /**
     * EJERCICIO 1
     * ReverseArray
     * El objetivo revertir el array dado por parametro
     * EJEMPLO: a=[2,3,4,1], result=[1,4,3,2]
     * */
    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> result = new ArrayList<>();
        int i = a.size() - 1;                                   // asignamos a "i" la ultima posicion del array
        while (i >= 0) {                                        // loop mientras "i" sea mayor o igual a 0
            result.add(a.get(i));                               // agregar los numeros al nuevoa array en cada iteracion
            i--;                                                // disminuir en 1 "i"
        }
        return result;                                          // devolvemos el array creado
    }
    /**
     * EJERCICIO 2
     * HourglassSum
     * El objetivo es sumar las posiciones que formen un reloj de arena
     * de este estilo:
     * a b c
     *   d
     * e f g
     * result = a+b+c+d+e+f+g
     * se te da un array de 6 x 6 donde debes de encontrar la suma mayor de todos los relojes de arena
     * */
    public static int hourglassSum(List<List<Integer>> arr) {

        int sum=0;
        int max_sum = Integer.MIN_VALUE;                                        // inicializa al menor numero existente

        for (int row = 0; row <= arr.size() - 3; row++) {                       // Recorre matriz
            for (int col= 0; col <= arr.get(row).size() - 3; col++) {
                for (int i = 0; i < 3; i++) {                                   // Inicia bucle en forma de reloj de arena de 3 x 3
                    for (int j = 0; j < 3; j++) {
                        if (!(i == 1 && (j == 0 || j == 2))) {                  // Evita posiciones para formar la figura
                            sum+=arr.get(row + i).get(col + j);                 // Suma en cada posicion
                        }
                    }
                }
                max_sum=Math.max(max_sum,sum);                                  // Determina la suma mas grande
                sum=0;                                                          // Resetea sum para la siguiente posicion
            }
        }
        return max_sum;                                                         // devolvemos la suma mayor
    }



    public static void main(String[] args) {
        //ejercicio 1
//        List<Integer> result = Arrays.asList(1,2,3,4,5);
//        System.out.println(reverseArray(result));
        //ejercicio 2
        List<List<Integer>> a = new ArrayList<>();
        List<Integer>array1 = Arrays.asList(5,4,3,2,1,0);
        List<Integer>array2 = Arrays.asList(-5,-4,-3,-2,-1,-0);
        List<Integer>array3 = Arrays.asList(0,0,0,0,0,0);
        List<Integer>array4 = Arrays.asList(15,4,3,2,1,0);
        List<Integer>array5 = Arrays.asList(-5,-4,-3,-2,-1,-0);
        List<Integer>array6 = Arrays.asList(0,0,0,0,0,0);
        a.add(array1);
        a.add(array2);
        a.add(array3);
        a.add(array4);
        a.add(array5);
        a.add(array6);

        hourglassSum(a);
    }
}
