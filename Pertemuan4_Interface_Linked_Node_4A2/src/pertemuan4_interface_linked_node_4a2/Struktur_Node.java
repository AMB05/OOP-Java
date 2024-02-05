package pertemuan4_interface_linked_node_4a2;
import java.util.Scanner;
import java.util.ArrayList;

public class Struktur_Node {
    Node head; // head of the list
  
    /* Linked list Node*/
    static class Node 
    {
        int data;
        Node next;
  
        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int a )
        {
            data = a;
            next = null;
        }
    }
    
    public void printList()
    {
        Node n = head;
        while (n != null) 
        {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }
}

