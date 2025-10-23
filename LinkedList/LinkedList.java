// package LinkedList;

public class LinkedList {
    public static Node head;
    public static Node tail;
    public static int size;
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        size++;
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void printLL(){
        Node temp= head;
        while(temp!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
    public void addMiddle(int index, int data){

        Node newNode = new Node(data);
        if (index == 0 ){
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }
        int count = 0;
        Node temp = head;
        while(temp != null && count < index -1){
            temp = temp.next;
            count++;
        }
        if (temp == null){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    public void removeFirst(){
        if(head != null){
            head = head.next;
            return;
        }
        throw new IndexOutOfBoundsException("empty linkedlist");
    }
    public int helper(Node head ,int target){
        if (head == null){
            return -1;
        }
        if (head.data == target){
            return 0;
        }
        int index = helper(head.next,target);
        if(index == -1){
            return -1;
        }
        return index + 1;
        
    }
    public int recursiveSearch(int target){
        return helper(head,target);
    }
    public void removeLast(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }else if(size == 1){
            head = null;
            tail = null;
            System.out.println("Successfully Removed...");
            size --;
            return;
        }
        Node temp = head;
        int count = 1;
        while (count < size - 1){
            temp =  temp.next;
            count++;
        }
        temp.next = null;
        tail = temp;
        System.out.println("Successfully Removed...");
        size--;
        return;
    }
    public boolean iterativeSearch(int target){
        if (head == null){
            System.out.println("LL is empty");
            return false;
        }
        Node temp = head;
        while (temp != null){
            if (temp.data == target){
                System.out.println("Target found");
                return true;
            }
            temp = temp.next;
        }
        System.out.println("Target is not found");
        return false;
    }
    public void reverseLL(){
        if (head == null){
            System.out.println("ll is empty");
            return;
        }
        Node curr = head;
        Node prev = null;
        while (curr != null){
            Node Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        
        ll.addFirst(10);   
        ll.addLast(20);    
        ll.addFirst(5);    
        ll.addLast(30);    
        ll.addFirst(1);  
        ll.addMiddle(3, 32);
        
        ll.printLL();
        ll.removeLast();
        ll.printLL();
        System.out.println("");
        System.out.println(ll.size);
        ll.iterativeSearch(10);
    }
}
