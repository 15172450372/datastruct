package linkedlist;

/**
 * @Author: zhouwei
 * @Description: 工具类
 * @Date: 2019/11/9 下午5:40
 * @Version: 1.0
 **/
public class Tools {

    /**
     * 打印
     * @param head 头结点
     */
    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

}
