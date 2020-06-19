//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    public Node(int data) {
//        this.data = data;
//    }
//}
//
//class BST {
//
////    public Node createNewNode(int data) {
////        Node a = new Node();
////        a.data = data;
////        a.left = null;
////        a.right = null;
////
////        return a;
////    }
//    public Node insert(Node node, int data) {
//        if(node==null) {
//            node = new Node(data);
//            return node;
//        }
//        if(data < node.data) {
//            node.left = insert(node.left, data);
//        } else if(data > node.data)  {
//            node.right = insert(node.right, data);
//        }
//        return node;
//    }
//
//    public void inOrder(Node node) {
//        if(node==null) {
//            return;
//        }
//        inOrder(node.left);
//        System.out.print(node.data+" ");
//        inOrder(node.right);
//    }
//
//    public void preOrder(Node node) {
//        if(node==null) {
//            return;
//        }
//        System.out.print(node.data+" ");
//        inOrder(node.left);
//        inOrder(node.right);
//    }
//
//    public void postOrder(Node node) {
//        if(node==null) {
//            return;
//        }
//        inOrder(node.left);
//        inOrder(node.right);
//        System.out.print(node.data+" ");
//    }
//}
//
//public class JavaExercise8 {
//
//    public static void main(String[] args) {
//        BST a = new BST();
//        Node root = null;
//        root = a.insert(root, 8);
//        root = a.insert(root, 3);
//        root = a.insert(root, 4);
//
//        a.inOrder(root);
//        a.postOrder(root);
//        a.preOrder(root);
//    }
//
//
//}
