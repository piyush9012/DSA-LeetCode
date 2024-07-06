/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode findNthNode(ListNode temp, int k) {
        int cnt = 1;
        while(temp != null){
            if(cnt == k) return temp;
            cnt++;
            temp = temp.next;
        }
        return temp;
    }

    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail = head;
        int len = 1;
        if(head == null || k == 0) return head;
        while(tail.next != null){
            len++;
            tail = tail.next;
        }

        if(k % len == 0) return head;
        k = k % len;

        tail.next = head;

        ListNode newLast = findNthNode(head, len - k);
        head = newLast.next;
        newLast.next = null;

        return head;
    }
}