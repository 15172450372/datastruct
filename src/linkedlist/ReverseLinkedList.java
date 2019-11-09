package linkedlist;

/**
 * @Author: zhouwei
 * @Description: 链表反转
 * @Date: 2019/11/9 下午5:38
 * @Version: 1.0
 **/
public class ReverseLinkedList {

    public static void main(String[] args) {
        //1.初始化链表
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;

        //2.输出链表
        System.out.print("逆序前:");
        Tools.print(node1);

        //3.逆序
        Node head = reverse(node1);

        //4.输出链表
        System.out.println();
        System.out.print("逆序后:");
        Tools.print(head);
    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node p1 = head;
        Node p2 = head.next;
        Node p3 = null;
        while (p2 != null) {
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        head.next = null;
        return p1;
    }

}
