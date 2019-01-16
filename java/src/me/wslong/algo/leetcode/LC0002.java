package me.wslong.algo.leetcode;

/*

 You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8

 */
public class LC0002 {

    public static void main(String[] args) {
        LC0002 lc = new LC0002();

        ListNode l1 = lc.new ListNode(1);
        l1.next = lc.new ListNode(8);
        // l1.next.next = lc.new ListNode(3);

        ListNode l2 = lc.new ListNode(0);
        // l2.next = lc.new ListNode(6);
        // l2.next.next = lc.new ListNode(3);

        lc.printListNode(l1);
        lc.printListNode(l2);

        long t1 = System.currentTimeMillis();
        ListNode rln = lc.addTwoNumbers(l1, l2);
        long t2 = System.currentTimeMillis();

        lc.printListNode(rln);
        System.out.println("execution duration = " + (t2 - t1));
    }

    private void printListNode(ListNode ln) {
        String result = "";
        do {
            result += ln.val + " -> ";
        } while ((ln = ln.next) != null);
        System.out.println(result.substring(0, result.length() - 4));
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r = null;
        int co = 0;
        do {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + co;
            co = sum / 10;
            int v = sum % 10;
            if (r == null) {
                r = new ListNode(v);
            } else {
                ListNode tmp = r;
                while (tmp.next != null) {
                    tmp = tmp.next;
                }
                tmp.next = new ListNode(v);
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (l1 == null && l2 == null) {
                break;
            }
        } while (true);

        if (co != 0) {
            ListNode tmp = r;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new ListNode(co);
        }

        return r;
    }
}
