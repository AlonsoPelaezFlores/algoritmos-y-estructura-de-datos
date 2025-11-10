package ejercicios.hackerrank.linkedlist;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LinkedList {



    /**
     * EJERCICIO 1
     * falla en los tests - no encuentro el problema
     * Pide remover el elemento "K" de la lista desde el final EN UNA SOLA ITERACION
     * */

    public static SinglyLinkedListNode removeKthNodeFromEnd(SinglyLinkedListNode head, int k) {

        if (head == null || k <= 0) return head;

        // declaracion y asignacion de dos punteros para recorrer una vez la lista
        // puntero slow
        SinglyLinkedListNode currentNode = head;
        // puntero fast
        SinglyLinkedListNode searchNode = head;

        // avanzando las hacia adelante en la lista enlazada segun el valor de k
        for (int i = 0;i < k && searchNode !=null; i++) {
            searchNode = searchNode.next;
            System.out.println("search " + searchNode.data);
        }
        if (searchNode == null) {
            return head.next;
        }
        // loop mientras searchNode no sea nulo esto permite que el loop se mantenga activo hasta el final
        // de la lista enlazada
        while (searchNode != null) {
            // si el siguiente nodo de searchNode es null podemos eliminar el siguiente nodo.
            if (searchNode.next==null) {
                currentNode.next = currentNode.next.next;
                return head;
            }
            // seguimos avanzando en la lista
            searchNode = searchNode.next;
            currentNode = currentNode.next;
        }
        return head;
    }
    /**
     * EJERCICIO 2
     * Elimina los numeros consecutivos duplicados de una lista enlazada EN UNA SOLA ITERACION
     * */
    public static SinglyLinkedListNode deleteDuplicates(SinglyLinkedListNode head) {
        // verificamos que el head y el siguiente nodo no sean null
        if (head == null || head.next == null) return head;

        // asignamos dos punteros para comprobar si hay numeros duplicados
        SinglyLinkedListNode previousNode = head;
        SinglyLinkedListNode currentNode = head.next;

        while(currentNode != null) {
            // si los numeros no son iguales seguimos avanzando normalmente la lista enlazada
            if (previousNode.data != currentNode.data) {
                currentNode = currentNode.next;
                previousNode = previousNode.next;
            }
            // de lo contrario cuando esten repetidos asiganmos el nuevo valor de previous node
            // a current Node y avanzamos en una posicion al curren ya que se encuentran en la
            // misma posicion despues de la eliminacion
            else {
                previousNode.next = currentNode.next;
                currentNode = currentNode.next ;
            }
        }
        return head;
    }

    /**
     * EJERCICIO 3
     * Extrae los nodos pares es decir 0,2,4... y los agrega al final de manera descendiente
     * EN UNA SOLA ITERACION
     * EJEMPLO: tienes: [10,20,30,40,50] resultado=[28,40,50,30,10]
     * */
    public static void extractAndAppendSponsoredNodes(SinglyLinkedListNode head) {
        if (head == null || head.next == null) {}

    }
    public static void main(String[] args) {


//        ex1
//        SinglyLinkedListNode head = createLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6));
//        SinglyLinkedListNode result = removeKthNodeFromEnd(head, 0);
//        showLinkedList(result);

//        ex2
//        SinglyLinkedListNode head = createLinkedList(Arrays.asList(1, 2, 2, 2, 3, 4));
//        SinglyLinkedListNode result = deleteDuplicates(head);
//        System.out.println(result);

//        ex3
        SinglyLinkedListNode head = createLinkedList(Arrays.asList(10,20,30,40,50,60,70,80));
        extractAndAppendSponsoredNodes(head);
//        showLinkedList(head);
    }
    /**
     * Metodo encargado de crear los linked list mediante arrays de enteros
     * */
    public static SinglyLinkedListNode createLinkedList(List<Integer> list){
        SinglyLinkedListNode head = new SinglyLinkedListNode();
        head.data = list.get(0);
        SinglyLinkedListNode currentNode = head;
        SinglyLinkedListNode node;
        for (int i = 1; i < list.size(); i++) {
            node = new SinglyLinkedListNode();
            node.data = list.get(i);
            currentNode.next =  node;
            currentNode = currentNode.next;
        }
        return head;
    }
    /**
     * Metodo encargado de mostrar los elementos de una list mediante el head
     * */
    public static void showLinkedList(SinglyLinkedListNode head){
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
