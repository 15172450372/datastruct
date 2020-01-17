package tree;

import java.util.HashMap;

/**
 * @Author: zhouwei
 * @Description: 构造二叉树
 * @Date: 2020/1/17 下午9:20
 * @Version: 1.0
 **/
public class BuildBinaryTree {

    static HashMap<Integer,Integer> map = new HashMap<>();
    static int[] post;  //存储根节点的值

    /**
     * 从中序与后序遍历序列构造二叉树
     * @param inorder
     * @param postorder
     * @return
     */
    public static TreeNode buildTreeByInAndPost(int[] inorder, int[] postorder) {
        for(int i=0; i<inorder.length; i++) {
            map.put(inorder[i],i);
        }
        post = postorder;
        return buildTreeByInAndPost(0, inorder.length-1, 0, postorder.length-1);
    }

    private static TreeNode buildTreeByInAndPost(int is, int ie, int ps, int pe) {
        if(ie < is || pe < ps) {
            return null;
        }
        int rootVal = post[pe];
        int rootIndex = map.get(rootVal);

        TreeNode root = new TreeNode(rootVal);
        root.left = buildTreeByInAndPost(is,rootIndex-1,ps,ps+rootIndex-is-1);
        root.right = buildTreeByInAndPost(rootIndex+1,ie,ps-is+rootIndex,pe-1);
        return root;
    }



    static HashMap<Integer,Integer> map2 = new HashMap<>();
    static int[] pre;

    /**
     * 从前序与中序遍历序列构造二叉树
     * @param preorder
     * @param inorder
     * @return
     */
    public static TreeNode buildTreeByPreAndIn(int[] preorder,int[] inorder) {
        for(int i=0; i<inorder.length; i++) {
            map.put(inorder[i],i);
        }
        pre = preorder;
        return buildTreeByPreAndIn(0,preorder.length-1,0,inorder.length-1);
    }

    private static TreeNode buildTreeByPreAndIn(int ps, int pe, int is, int ie) {
        if(pe < ps || ie < is) {
            return null;
        }
        int rootVal = pre[ps];
        int rootIndex = map2.get(rootVal);

        TreeNode root = new TreeNode(rootVal);
        root.left = buildTreeByPreAndIn(ps+1,ps+rootIndex-is,is,rootIndex-1);
        root.right = buildTreeByPreAndIn(ps+rootIndex-is+1,pe,rootIndex+1,ie);
        return root;
    }



    static int preIndex = 0;
    static int postIndex = 0;

    /**
     * 从前序与后序遍历序列构造二叉树
     * @param pre
     * @param post
     * @return
     */
    public static TreeNode buildTreeByPreAndPost(int[] pre,int[] post) {
        TreeNode node = new TreeNode(pre[preIndex++]);
        if (node.val != post[postIndex]) {
            node.left = buildTreeByPreAndPost(pre,post);
        }
        if (node.val != post[postIndex]) {
            node.right = buildTreeByPreAndPost(pre,post);
        }
        postIndex++;
        return node;
    }

    public static void main(String[] args) {

    }

}