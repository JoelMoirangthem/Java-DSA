package LinkedList;

public class Node {
    private int data;
    private Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    public static void main(String[]args){
        Node ll = new Node(0);
        ll.next = new Node(3);
        ll.next.next = new Node(8);
    }
}
