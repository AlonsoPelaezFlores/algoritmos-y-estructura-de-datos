package ejercicios.leetcode.ex3;

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> map = new HashMap<>();
        //puntero
        int start = 0;
        int maxLength=0;
        // el bucle empieza con dos punteros start y end
        for (int end = 0; end < s.length();) {
            // si dentro del hashmap se encuentra un caracter repetido en la posicion
            // que se encuentra el puntero end - Ingresa
            if (map.containsKey(s.charAt(end))) {
                //movemos el puntero star a la siguiente posicion del caracter repetido
                start = map.get(s.charAt(end)) + 1;
                int limit = start;
                //modificamos el hashmap para borrar los caracteres antes de la posicion
                // del puntero star
                map.entrySet().removeIf(entry -> entry.getValue() < limit);
            }
            // agregamos los caracteres uno por uno
            map.put(s.charAt(end), end);
            // aumentamos en 1 para que continue el bucle
            end++;
            // en cada iteracion se verifica la longitud maxima del substring
            // que se encuentra dentro del hashmap
            maxLength = Math.max(maxLength, end - start);
        }
        //devolvemos la longitud de la subcadena mas grande
        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abc"));
        System.out.println(solution.lengthOfLongestSubstring("au"));
        System.out.println(solution.lengthOfLongestSubstring("dvdf"));
    }
}
