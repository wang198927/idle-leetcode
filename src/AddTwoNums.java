public class AddTwoNums {

    public ListNode addTwoNums(ListNode l1, ListNode l2){
        ListNode newNode = new ListNode(0);
        ListNode node1 = l1, node2 = l2, curNode = newNode;
        int carry = 0;
        while (null != node1 && null !=node2){
            int value = node1.val+ node2.val+carry;
            carry = value>=10 ? 1:0;
            value = value % 10;
            curNode.next = new ListNode(value);
            curNode = curNode.next;

            node1 = node1.next;
            node2 = node2.next;
        }

        return  newNode.next;
    }

    public static void main(String[] args) {

    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

