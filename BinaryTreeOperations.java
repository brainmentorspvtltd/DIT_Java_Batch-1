package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

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
    int maxLevel = 0;
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

    // PLR - Parent Left Right
    void preOrder(BinaryTree<Integer> root) {
        if(root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    // LRP
    void postOrder(BinaryTree<Integer> root) {

        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    // LPR
    void inOrder(BinaryTree<Integer> root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    // PLR - Parent Left Right
    void preOrderIterative(BinaryTree<Integer> root) {
        // 1. Create Empty Stack & push root node into stack
        // 2. while stack is not empty
        //    - Pop an item from stack & print it
        //    - push right child of popped item into stack
        //    - push left child of popped item into stack
        if(root == null) {
            return;
        }
        Stack<BinaryTree<Integer>> st = new Stack<>();
        // st.push(root);
        BinaryTree<Integer> current = root;
        while(current != null || st.isEmpty() == false) {
            if(st.isEmpty() == false && current == null) {
                current = st.pop();
            }
            System.out.println(current.data);
            if(current.right != null) {
                st.push(current.right);
            }
            current = current.left;
        }
    }

    // LPR
    void inorderIterative() {
        /*
         * 1. Create Empty Stack S = Null
         * 2. set current as address of root : current -> 1
         * 3. push the current node and set current = current -> left
         *      current -> 1
         *      push 1 : Stack : 1
         *      current -> 2
         *      push 2 : Stack : 2,1
         *      current -> 4
         *      push 4 : Stack : 4,2,1
         *      current = Null
         * 4. Pop from Stack
         *      pop 4 : Stack : 2,1
         *      print -> 4
         *      current = Null  now goto step 3
         *      but current is Null in step 3 so it won't do anything
         * 5. Pop again
         *      pop 2 : Stack : 1
         *      print -> 2
         *      current -> 5    // right of 2, now goto step 3
         * 6. Push 5 to stack and make current = Null
         *      push 5 : Stack : 5,1
         *      current = Null
         * 7. Pop from Stack
         *      pop 5 : Stack : 1
         *      print -> 5
         *      current = Null
         * 8. Pop from Stack
         *      pop 1 : Stack : Null
         *      print -> 1
         *      current = 3
         * 9. Push 3 into Stack
         *      push 3 : Stack : 3
         *      current = Null
         * 10. Pop from Stack
         *      pop 3 : Stack : Null
         *      print -> 3
         */
    }


    // LRP
    ArrayList<Integer> postOrderIterative(BinaryTree<Integer> root) {
        /*
         * 1. Right Child of 1 exists
         *      Push 3 to stack, push 1 to stack, Move to the left child
         *      Stack : 3,1
         * 2. Right Child of 2 exists
         *      Push 5 to stack, push 2 to stack, Move to the left child
         *      Stack : 3,1,5,2
         * 3. Right child of 4 doesn't exists
         *      Push 4 to stack, Move to the left child
         *      Stack : 3,1,5,2,4
         * 4. Current Node is Null
         *      pop 4 from the stack, Right child of 4 doesn't exists
         *      print -> 4, set current node = null
         *      Stack : 3,1,5,2
         * 5. Current Node is Null
         *      pop 2 from the stack, Right child of 2 equals peek of stack
         *      pop 5 from stack, and push 2 into stack
         *      Move current node to right child of 2 i.e., 5 
         *      Stack : 3,1,2
         * 6. Right child of 5 doesn't exists. Push 5 to the stack, move to the left chid
         *      Stack : 3,1,2,5
         * 7. Current Node is Null
         *      Pop 5 from stack, and print 5
         *      Stack : 3,1,2
         * 8. Current Node is Null
         *      Pop 2 from stack, and print 2
         *      Stack : 3,1
         * 9. Pop 1 from stack
         *      right child of 1 is equal to peek of stack, pop 3 from stack
         *      Now push 1 to stack and move current node to right child
         *      Stack : 1
         * 10. Repeat whole process for remaining nodes...
         */     

        Stack<BinaryTree<Integer>> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }

        st.push(root);
        BinaryTree<Integer> prev = null;
        while(!st.isEmpty()) {
            BinaryTree<Integer> current = st.peek();
            if(prev == null || prev.left == current || prev.right == current){
                if(current.left != null) {
                    st.push(current.left);
                }
                else if(current.right != null) {
                    st.push(current.right);
                }
                else {
                    st.pop();
                    list.add(current.data);
                }
            }
            else if(current.left == prev) {
                if(current.right != null) {
                    st.push(current.right);
                }
                else {
                    st.pop();
                    list.add(current.data);
                }
            }
            else if(current.right == prev) {
                st.pop();
                list.add(current.data);
            } 
            prev = current;
        }
        return list;
         
    }


    void levelOrder(BinaryTree<Integer> root) {
        LinkedList<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryTree<Integer> node = queue.removeFirst();
            System.out.println(node.data + ",");
            if(node.left != null) {
                queue.addLast(node.left);
            }
            if(node.right != null) {
                queue.addLast(node.right);
            }
        }
    }

    void leftViewRec(BinaryTree<Integer> root, int level) {
        if(root == null) {
            return;
        }
        if(maxLevel < level) {
            System.out.println(root.data);
            maxLevel = level;
        }
        leftViewRec(root.left, level + 1);
        leftViewRec(root.right, level + 1);
    }

    void leftViewIter(BinaryTree<Integer> root) {
        if(root == null) {
            return;
        }
        LinkedList<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                BinaryTree<Integer> currentNode = queue.removeFirst();
                if(i == 0) {
                    System.out.println(currentNode.data);
                }
                if(currentNode.left != null) {
                    queue.addLast(currentNode.left);
                }
                if(currentNode.right != null) {
                    queue.addLast(currentNode.right);
                }
            }
            System.out.println();
        }
    }

    void printVerticalOrder(BinaryTree<Integer> root) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        int distance = 0;
        getVerticalOrder(root, distance, map);
        for(Map.Entry<Integer, ArrayList<Integer>> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    void getVerticalOrder(BinaryTree<Integer> node, int dist, TreeMap<Integer, ArrayList<Integer>> map) {
        if(node == null) {
            return;
        }
        if(map.get(dist) == null) {
            ArrayList<Integer> i = new ArrayList<>();
            i.add(node.data);
            map.put(dist, i);
        }
        else {
            ArrayList<Integer> i = map.get(dist);
            i.add(node.data);
            map.put(dist, i);
        }
        getVerticalOrder(node.left, dist - 1, map);
        getVerticalOrder(node.right, dist + 1, map);
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
        System.out.println("Pre Order Traversal...");
        tree.preOrder(root);
        System.out.println("Pre Order Traversal Iterative Approach...");
        tree.preOrderIterative(root);
        System.out.println("Level Order Traversal...");
        tree.levelOrder(root);
        System.out.println("Left View of Tree");
        tree.leftViewRec(root, 1);
    }
}
