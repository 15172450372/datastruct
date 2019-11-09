package linkedlist;

/**
 * @Author: zhouwei
 * @Description: 链表节点
 * @Date: 2019/11/9 下午5:37
 * @Version: 1.0
 **/
public class Node {

    public int data;
    public Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
