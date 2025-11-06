package ejercicios.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Result {
    // ex 1
    // Dada una lista de numeros devolver las veces que el numero actual ha sido
    // estrictamente mayor a la media de los anteriores
    public static int countResponseTimeRegressions(List<Integer> responseTimes) {

        // devolvemos 0 si la lista esta vacia o cuenta con un numero
        if (responseTimes.isEmpty() || responseTimes.size() == 1) return 0;

        int count = 0;
        // asignamos a la suma la primera posicion de la lista
        // ya que, el primer numero no cuenta con un numero anterior
        int sum= responseTimes.get(0);
        // empezamos el bucle con la posicion 1
        for (int i = 1; i < responseTimes.size(); i++) {
            // declaramos y asignamos el valor de la media
            double avg = (double) sum / i;
            // si el numero es mayor que la media, se le suma 1 al contador
            if (responseTimes.get(i) > avg) {
                count++;
            }
            // agregamos el numero actual a la suma
            sum += responseTimes.get(i);
        }
        // devolvemos el contador
        return count;
    }
    // ex 2
    // dada una matriz de numeros, ordenar y devolver la matriz con numeros que no se
    // superpongan
    // ejemplo: tenemos una matriz = [[1,2],[1,5],[7,8]]
    // esta matriz daria como resultado = [[1,5],[7,8]]
    // ya que, el primer digito
    public static List<List<Integer>> mergeHighDefinitionIntervals(List<List<Integer>> intervals) {


        // verificamos que no este vacia
        if (intervals.isEmpty()) return new ArrayList<>();

        // ordenamos la matriz
        intervals.sort(Comparator.comparingInt(a -> a.get(0)));

        List<List<Integer>> result = new ArrayList<>();
        // agregamos la primera lista a la matriz
        result.add(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {

            // declaramos y asignamos el valor de la lista actual
            List<Integer> currentInterval = intervals.get(i);
            // declaramos y asignamos el valor de la ultima lista agregada
            List<Integer> lastMergedList = result.get(result.size() - 1);

            // hay superposicion
            if (currentInterval.get(0) <= lastMergedList.get(1)) {
                // comparamos ambos numero de la lista actual y la ultima lista agregada
                int startTime = Math.min(currentInterval.get(0), lastMergedList.get(0));
                int endTime = Math.max(currentInterval.get(1), lastMergedList.get(1));

                // eliminamos la ultima lista de la matriz
                result.remove(result.size() - 1);
                // agregamos la lista fusionada a la matriz
                result.add(Arrays.asList(startTime, endTime));
            }
            // No hay superposicion
            else {
                // agregamos la lista a la matriz
                result.add(currentInterval);
            }
        }
        // devolvemos la matriz
        return result;
    }
}
