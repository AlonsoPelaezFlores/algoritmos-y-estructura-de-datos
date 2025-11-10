package ejercicios.leetcode.ex2;

// declaramos la clase ListNode
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersHelper(l1, l2, 0);
    }
    // metodo helper para la suma de dos numeros con la estructura de LinkedList
    private ListNode addTwoNumbersHelper(ListNode l1, ListNode l2, int carry) {

        // si los campos son nulos - Salimos
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }
        ListNode result = new ListNode();

        // verificacion del valor del nodo actual
        int val1 = checkListNodeValid(l1);
        int val2 = checkListNodeValid(l2);
        //sumamos los valores
        int sum = val1 + val2 + carry;
        // declaramos el primer digito
        int digit = sum % 10;
        // lleva el resto para sumarse al siguiente nodo
        int newCarry = sum / 10;
        // asignamos el digito al valor del nodo
        result.val = digit;

        // verificamos y le damos valor al siguiente nodo
        ListNode next1 = (l1 != null) ? l1.next : null;
        ListNode next2 = (l2 != null) ? l2.next : null;

        // avanzamos en la recursividad
        result.next = addTwoNumbersHelper(next1, next2, newCarry);


        return result;
    }
    // el metodo actual modifica los valores nulos por '0', de lo contrario
    // devolvera el valor del nodo actual
    private int checkListNodeValid(ListNode list) {
        return (list != null) ? list.val : 0;
    }


}
