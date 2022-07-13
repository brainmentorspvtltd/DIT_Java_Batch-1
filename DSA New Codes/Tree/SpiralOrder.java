package Tree;

import java.util.Stack;

public class SpiralOrder {
    static public void printSpiral(Node root) {
        if(root == null){
            return;
        }
        Stack<Node> oddStack = new Stack<>();
        Stack<Node> evenStack = new Stack<>();
        oddStack.push(root);

        while(!oddStack.isEmpty() || !evenStack.isEmpty()) {
            while(!oddStack.isEmpty()) {
                Node temp = oddStack.peek();
                oddStack.pop();
                System.out.print(temp.data + ",");

                // right node is pushed before left
                if(temp.right != null) {
                    evenStack.push(temp.right);
                }
                if(temp.left != null){
                    evenStack.push(temp.left);
                }
            }

            while(!evenStack.isEmpty()) {
                Node temp = evenStack.peek();
                evenStack.pop();
                System.out.print(temp.data + ",");

                // left node is pushed before right
                if(temp.left != null) {
                    oddStack.push(temp.left);
                }
                if(temp.right != null){
                    oddStack.push(temp.right);
                }
            }
        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(6);
        root.right.right.left = new Node(8);
        root.right.right.right = new Node(7);

        printSpiral(root);

    }
}