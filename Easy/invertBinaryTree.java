public class invertBinaryTree {
    /*
    Given a binary tree, invert the tree

    example:
        Input: root = [4,2,7,1,3,6,9]
        Output: [4,7,2,9,6,3,1]
    */
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int val) {
            value = val;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(7);
        root.right.left = new Node(6);
        root.right.right = new Node(9);
    }

    public static Node invertTree(Node root) {
        Node curr = root;
        Node left = curr.left;
        Node right = curr.right;

        curr.left = right;
        curr.right = left;
        invertTree((curr.left));
        invertTree(curr.right);
        return root;
    }
}
