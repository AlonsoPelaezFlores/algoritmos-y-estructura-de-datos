package ejercicios.leetcode.ex2;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

//        int[] nums1 = {2,4,3};
//        int[] nums2 = {5,6,4};

        int[] nums1 = {9,9,9,9,9,9,9};
        int[] nums2 = {9,9,9,9};

        ListNode l1 = createLinkedList(nums1);
        ListNode l2 = createLinkedList(nums2);

//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);

//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);

        ListNode result = solution.addTwoNumbers(l1, l2);
        ListNode current = result;
        while (current != null) {
            System.out.print(current.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
    }
    public static ListNode createLinkedList(int[] nums) {
        ListNode head = new ListNode(nums[0]);
        ListNode current = head;
        for (int i = 1; i < nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
        }
        return head;
    }
}
