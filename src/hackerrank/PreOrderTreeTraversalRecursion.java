package hackerrank;

public class PreOrderTreeTraversalRecursion {

    static class Node {
        int data;
        Node left;
        Node right;
    }

    static void preOrder(Node root) {
        if(root == null) return ;

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void main(String[] args) {


    }
}
