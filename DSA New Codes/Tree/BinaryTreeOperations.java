package Tree;

import java.util.Scanner;

class BinaryTree<T> {
    T data;
    BinaryTree<T> left;
    BinaryTree<T> right;
    public BinaryTree(T data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTreeOperations {
    String msg = "root";
    Scanner scanner = new Scanner(System.in);
    BinaryTree<Integer> insert() {
        System.out.println("Enter the " + msg + " data or enter -1 to exit");
        int data = scanner.nextInt();
        if(data == -1) {
            return null;
        }
        BinaryTree<Integer> node = new BinaryTree<>(data);
        msg = "left";
        node.left = insert();
        msg = "right";
        node.right = insert();
        msg = "root";
        return node;
    }

    void print(BinaryTree<Integer> root) {
        if(root == null) {
            return;
        }
        String output = "";
        if(root.left != null) {
            output += "L : " + root.left.data + ", ";
        }
        if(root.right != null) {
            output += "R : " + root.right.data + ", ";
        }
        System.out.println(output);
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeOperations tree = new BinaryTreeOperations();
        BinaryTree<Integer> root = tree.insert();
        tree.print(root);
    }
}
