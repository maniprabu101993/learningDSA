package git.linkedlist;

public class LinkedListAddition {
    //Leetcode 2
    public static void main(String[] args) { //243 + 564 //ans=708
        ListNode first = new ListNode();
        ListNode second = new ListNode();
        first.val = 2;
        first.next = new ListNode(4);
        first.next.next = new ListNode(3);
        second.val = 5;
        second.next = new ListNode(6);
        second.next.next = new ListNode(4);
        ListNode output = addTwoNumbers(first, second);
        while (output != null) {
            System.out.print(output.val);
            output = output.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode temp = result;
        int resultInt;
        int carry = 0;
        while (l1 != null || l2 != null || carry>0) {
            resultInt = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;// carry forward should be done as we are adding only digits
            carry = resultInt / 10;
            resultInt = (resultInt % 10);
            temp.next = new ListNode(resultInt);
            temp = temp.next;

            l1 = (l1 != null ? l1.next : null);
            l2 = (l2 != null ? l2.next : null);
        }

        return result.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

