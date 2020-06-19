//class Node {
//    public int data;
//    public Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = next;
//    }
//}
//
//class LinkedList {
//    public Node head;
//
//    public LinkedList() {
//        this.head = null;
//    }
//
//    public void add(int data) {
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//
//    public void display() {
//        if(head==null) {
//            return;
//        }
//        Node current = head;
//        while(current!=null) {
//            System.out.print(current.data+" ");
//            current = current.next;
//        }
//    }
//}
//
//public class JavaExercise7 {
//    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//         ll.add(10);
//         ll.add(5);
//         ll.display();
//    }
//}
