package pertemuan4_interface_linked_node;
import java.util.Scanner;
import java.util.ArrayList;

public class Struktur_Node {
    Node head; // head of the list
  
    /* Linked list Node*/
    static class Node 
    {
        int data;
        String data2;
        float data3;
        Node next;
  
        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int a )
        {
            data = a;
            next = null;
        }

        Node(String b) 
        {
            data2 = b;
            next = null;
        }

        Node(float c) 
        {
            data3 = c;
            next = null;
        }
    }
    
    public void printList()
    {
        Node n = head;
        while (n != null) 
        {
            if (n ==  ) 
            {
                System.out.println(n.data + " ");
                n = n.next;
            } 
            else if ( n == )
            {
                System.out.println(n.data2 + " ");
                n = n.next;
            }
            else if ( n == )
            {
                System.out.println(n.data3 + " ");
                n = n.next;
            }
            
//            System.out.println(n.data2 + " ");
//            n = n.next;
//            System.out.println(n.data3 + " ");
//            n = n.next;
        }
    }
}
