package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class DiagonalView {

    String msg = "root";
    int maxLevel = 0;
    Scanner scanner = new Scanner(System.in);
    Node insert() {
        System.out.println("Enter the " + msg + " data or enter -1 to exit");
        int data = scanner.nextInt();
        if(data == -1) {
            return null;
        }
        Node node = new Node(data);
        msg = "left";
        node.left = insert();
        msg = "right";
        node.right = insert();
        msg = "root";
        return node;
    }

    static void diaognalView(Node root) {
        if(root == null) {
            return;
        }

        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(root);

        while(queue.size() != 0) {
            int size = queue.size();
            ArrayList<Integer> smallAns = new ArrayList<>();
            while(size-- > 0) {
                Node rn = queue.removeFirst();
                while(rn != null){
                    smallAns.add(rn.data);
                    if(rn.left != null) {
                        queue.addLast(rn.left);
                    }
                    rn = rn.right;
                }
            }
            System.out.println(smallAns);
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
        diaognalView(root);
    }
}
