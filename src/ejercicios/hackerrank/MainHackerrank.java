package ejercicios.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ejercicios.hackerrank.Result.*;

public class MainHackerrank {
    public static void main(String[] args) {

//        ex 1
//        List<Integer> list = Arrays.asList(100, 200, 150,300);
//        System.out.println(Result.countResponseTimeRegressions(list));

//        ex2
//        List<List<Integer>> listMerged = mergeHighDefinitionIntervals(Arrays.asList(
//                Arrays.asList(6,8),
//                Arrays.asList(1,3),
//                Arrays.asList(2,6)
//        ));
//        expected [1,8]
//        System.out.println(Result.mergeHighDefinitionIntervals(listMerged));

//        ex3
//        String cadena = "abc123cba";
//        System.out.println(isAlphabeticPalindrome(cadena));

//        ex4
//        String str = "abcde";
//        String str2 = "cdeab";
//        System.out.println(isNonTrivialRotation(str, str2));

//        ex5
//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        System.out.println(countAffordablePairs(list,7));
        SinglyLinkedListNode l3 = new SinglyLinkedListNode();
        l3.data = 8;
        SinglyLinkedListNode l2 = new SinglyLinkedListNode();
        l2.data = 7;
        SinglyLinkedListNode l1 = new SinglyLinkedListNode();
        l1.data = 6;
        SinglyLinkedListNode head = new SinglyLinkedListNode();
        head.data = 5;

        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = null;
        removeKthNodeFromEnd(head, 3);
    }
}
