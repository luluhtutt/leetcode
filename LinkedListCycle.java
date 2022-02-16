import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, ListNode> hm = new HashMap<>();
        while(head != null && !hm.containsKey(head))   {
            head = head.next;
        }
        if(head == null) return true;
        else return false;
    }
}
