package ejercicios.hackerrank.binarysearch;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    /**
     * EJERCICIO 1 -
     * DIFICULTAD : FACIL
     * Busqueda binaria el ejercicio consiste en utilizar unos de los patrones
     * de busqueda mas reconocidos y usados para encontrar un elemento dentro de un
     * arreglo, se recibe por parametro una lista de numeros y el objetivo.
     * DEVUELVE: La posicion del target dentro del arreglo
     * EJEMPLO: nums = [1,2,3,4,5], target= 2, devuelve = 1
     * */
    public static int binarySearch(List<Integer> nums, int target) {
        int low=0;                                              // primera posicion del arreglo
        int high=nums.size()-1;                                 // ultima posicion del arreglo
        int result=-1;                                          // result -1 por defecto si no encuentra el target
        while (low<=high) {
            int mid=(low+high)/2;                               // mitad del arreglo
            if (nums.get(mid) < target){                        // si mid dentro de la variable es menor al target
                low=mid+1;                                      // descartamos el valor y asignamos nuevo valor a low
            }
            else if (nums.get(mid)> target) {                   // si es mayor hacemos lo contrario
                high = mid - 1;
            }
            else {                                              // en caso no sean dos de las primera opcion,
                result = mid;                                   // hemos encontrado el target
                return result;
            }
        }
        return result;                                          // De lo contrario devolvera -1
    }
    /**
     * EJERCICIO 2
     * DIFICUTALD: MEDIA
     * Se entrega un arreglo de enteros que en algun punto ha sido rotado.
     * El objetivo es hacer busqueda binaria en arreglos rotados
     * EJEMPLO : nums =[5,4,3,2,1], target= 4, result = 1
     * */
    public static int searchRotatedTimestamps(List<Integer> nums, int target) {
        int low=0;                                              // declara low y high
        int high=nums.size()-1;
        while (low <= high) {
            int mid = (low + high) / 2;                         // declara mid
            if (nums.get(mid) == target) {                      // si se ha encontrado el target devolvemos mid
                return mid;
            }
            if (nums.get(low) <= nums.get(mid)) {               // INGRESA SI: los numeros entre low - mid esta ordenado
                if (nums.get(low) <= target &&                  // SI TARGET: se encuentra entre low y mid
                        nums.get(mid) > target) {
                    high = mid - 1;                             // ajusta la posicion de high
                }
                else{                                           // EN CASO CONTRARIO, TARGET: busca entre el rango mid - high
                    low = mid + 1;                              // ajusta la posicion del low
                }
            }
            else {                                              // EN CASO CONTRARIO, INGRESA: en el rango mid - high
                if (nums.get(mid) < target &&                   // SI TARGET: se encuentra entre entre mid y high
                        nums.get(high) >= target) {
                    low = mid + 1;                              // ajusta la posicion de low
                }
                else {                                          // EN CASO CONTRARIO, TARGET: busca entre low y mid
                    high = mid - 1;                             // ajusta posicion de high
                }
            }
        }
        return -1;                                              // SI NO: se ha encontrado el target devolvemos -1
    }

    public static void main(String[] args) {

        // ejercicio 1
//        List<Integer> nums= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        System.out.println(BinarySearch.binarySearch(nums, 3));

        // ejercicio 2
//        List<Integer> nums= Arrays.asList(1609466400, 1609470000, 1609473600, 1609459200, 1609462800);
//        System.out.println(BinarySearch.searchRotatedTimestamps(nums, 1609459200));

    }
}