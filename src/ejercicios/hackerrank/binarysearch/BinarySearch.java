package ejercicios.hackerrank.binarysearch;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    /**
     * EJERCICIO 1 - FACIL
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

    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(BinarySearch.binarySearch(nums, 2));

    }
}
