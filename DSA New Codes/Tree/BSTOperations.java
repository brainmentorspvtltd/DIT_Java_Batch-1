package Tree;

class BST {
    int data;
    BST left;
    BST right;
    BST(int data) {
        this.data = data;
    }
}

public class BSTOperations {
    BST root;
    static BST insert(BST root, int data) {
        if(root == null) {
            return new BST(data);
        }
        else if(root.data < data) {
            root.right = insert(root.right, data);
        }
        else if(root.data > data) {
            root.left = insert(root.left, data);
        }
        return root;
    }   

    static BST search(BST root, int data) {
        if(root == null || root.data == data) {
            return root;
        }
        if(root.data > data) {
            return search(root.left, data);
        }
        return search(root.right, data);
    }

    int minValue(BST root) {
        int minV = root.data;
        while(root.left != null) {
            minV = root.left.data;
            root = root.left;
        }
        return minV;
    }

    int maxValue(BST root) {
        int maxV = root.data;
        while(root.right != null) {
            maxV = root.right.data;
            root = root.right;
        }
        return maxV;
    }

    void addNewNode(BST root, int data) {

    }

    void removeNode(BST currentNode, BST parentOfCurrent, boolean isLeft, int data) {
        if(data > currentNode.data) {
            removeNode(currentNode.right, parentOfCurrent, false, data);
        }
        else if(data < currentNode.data) {
            removeNode(currentNode.left, parentOfCurrent, true, data);
        }
        else {
            if(currentNode.left == null && currentNode.right == null) {
                if(isLeft) {
                    parentOfCurrent.left = null;
                }
                else {
                    parentOfCurrent.right = null;
                }
            }

            if(currentNode.left == null && currentNode.right != null) {
                if(isLeft) {
                    parentOfCurrent.left = currentNode.right;
                }
                else {
                    parentOfCurrent.right = currentNode.right;
                }
            }

            if(currentNode.left != null && currentNode.right == null) {
                if(isLeft) {
                    parentOfCurrent.left = currentNode.left;
                }
                else {
                    parentOfCurrent.right = currentNode.left;
                }
            }

            if(currentNode.left != null && currentNode.right != null) {
                int max = maxValue(root.left);
                System.out.println("Left Max : " + max);
                currentNode.data = max;
                removeNode(currentNode.left, currentNode, true, data);
            }
        }
    }

    static void print(BST root) {
        if(root != null) {
            print(root.left);
            System.out.print(root.data + ",");
            print(root.right);
        }
    }

    public static void main(String[] args) {
        BST root = new BST(10);
        root.left = new BST(5);
        root.right = new BST(15);
        root.right.left = new BST(12);
        root.right.right = new BST(20);
        int data = 13;
        root = insert(root, data);
        print(root);
    }
}
