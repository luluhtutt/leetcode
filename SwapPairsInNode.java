/*
    24. Swap Nodes in Pairs
    Given a linked list, swap every two adjacent nodes and return its head.
    You must solve the problem without modifying the values in the list's nodes
    (i.e., only nodes themselves may be changed.)
 */

import java.util.*;
public class SwapPairsInNode {
    public static void main(String[] args) {

    }

    public static ListNode swapPairs(ListNode head) {
        ListNode cur = head;
        if(head == null) return head;
        ListNode h = head;
        if(cur.next != null)    {
            h = cur.next;
        }
        while(cur.next.next != null)  {
            ListNode nextPair = cur.next.next;
            ListNode n = cur.next;
            cur.next = n;
            n.next = cur;
            cur = nextPair;
        }
        return h;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}