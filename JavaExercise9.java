//class Node {
//    int data;
//    Node left;
//    Node right;
//
//}
//
//class BST {
//
//    public Node createNewNode(int data) {
//        Node a = new Node();
//        a.data = data;
//        a.left = null;
//        a.right = null;
//        return a;
//    }
//    public Node insert(Node node, int data) {
//        if(node==null) {
//           return createNewNode(data);
//        }
//
//        if(data < node.data) {
//            node.left = insert(node.left, data);
//        } else if(data > node.data) {
//            node.right = insert(node.right, data);
//        }
//
//        return node;
//    }
//
//    public void inorder(Node node) {
//        if(node==null) {
//            return;
//        }
//        inorder(node.left);
//        System.out.print(node.data+" ");
//        inorder(node.right);
//    }
//
//    public void preorder(Node node) {
//        if(node==null) {
//            return;
//        }
//        System.out.print(node.data+" ");
//        preorder(node.left);
//        preorder(node.right);
//    }
//
//    public void postorder(Node node) {
//        if(node==null) {
//            return;
//        }
//        preorder(node.left);
//        preorder(node.right);
//        System.out.print(node.data+" ");
//    }
//}
//public class JavaExercise9 {
//    public static void main(String[] args) {
//       BST a = new BST();
//       Node root = null;
//       root = a.insert(root, 8);
//       root = a.insert(root, 3);
//       root = a.insert(root, 6);
//       root = a.insert(root, 10);
//       root = a.insert(root, 4);
//       root = a.insert(root, 7);
//       root = a.insert(root, 1);
//       root = a.insert(root, 14);
//       root = a.insert(root, 13);
//
//       System.out.print("Inorder: ");
//       a.inorder(root);
//       System.out.println();
//       System.out.print("Preorder: ");
//       a.preorder(root);
//       System.out.println();
//       System.out.print("Postorder: ");
//       a.postorder(root);
//    }
//}
