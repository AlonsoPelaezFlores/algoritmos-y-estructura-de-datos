package ejercicios.hackerrank.string;

public class StringAndPatternMatching {
    /**
     *
     * EJERCICIO 1
     * devuelve true o false si la cadena es palindromo
     * EJEMPLO : str = "racecar", resultado = True
     * */
    public static boolean isAlphabeticPalindrome(String code) {
        //asignamos los dos punteros
        int start = 0, end = code.length() - 1;
        // convertimos la cadena en minusculas
        code = code.toLowerCase();
        while (start < end) {
            // verificamos si el puntero start contiene  un numero avanza al siguiente caracter
            if(!Character.isLetter(code.charAt(start))){
                start++;
                continue;
            }
            // verificamos si el puntero "end" contiene un numero disminuimos en 1, ya que,
            // va del final al inicio
            if(!Character.isLetter(code.charAt(end))){
                end--;
                continue;
            }
            // si no coinciden en alguna letra no es palindromo
            if (code.charAt(start) != code.charAt(end)) return false;


            start++;
            end--;
        }
        return true;
    }

    /**
     * EJERCICIO 2
     * rotar los caracteres de la cadena s2 hasta que sea igual que la cadena s1
     * Devuelve True o false si no es una rotacion trivial.
     * */
    public static boolean isNonTrivialRotation(String s1, String s2) {

        if(s1.equals(s2)) return false;
        if (s1.length() != s2.length()) return false;

        return (s1 + s1).contains(s2);
    }
    public static void main(String[] args) {

//        ex1
//        String cadena = "abc123cba";
//        System.out.println(isAlphabeticPalindrome(cadena));

//        ex2
//        String str = "abcde";
//        String str2 = "cdeab";
//        System.out.println(isNonTrivialRotation(str, str2));
    }
}
