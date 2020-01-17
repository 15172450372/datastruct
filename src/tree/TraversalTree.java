package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhouwei
 * @Description: 遍历树
 * @Date: 2020/1/17 下午9:38
 * @Version: 1.0
 **/
public class TraversalTree {

    /**
     * 先序遍历
     * @param root 树的根节点
     * @return
     */
    public static List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root != null) {
            list.add(root.val);
            list.addAll(preorderTraversal(root.left));
            list.addAll(preorderTraversal(root.right));
        }
        return list;
    }

    /**
     * 中序遍历
     * @param root 树的根节点
     * @return
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root != null) {
            list.addAll(inorderTraversal(root.left));
            list.add(root.val);
            list.addAll(inorderTraversal(root.right));
        }
        return list;
    }

    /**
     * 后序遍历
     * @param root 树的根节点
     * @return
     */
    public static List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root != null) {
            list.addAll(postorderTraversal(root.left));
            list.addAll(postorderTraversal(root.right));
            list.add(root.val);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        List<Integer> preList = TraversalTree.preorderTraversal(treeNode1);
        List<Integer> inList = TraversalTree.inorderTraversal(treeNode1);
        List<Integer> postList = TraversalTree.postorderTraversal(treeNode1);

        System.out.println("...");
    }

}
