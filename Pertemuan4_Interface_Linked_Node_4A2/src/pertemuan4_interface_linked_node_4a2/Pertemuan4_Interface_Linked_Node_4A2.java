package pertemuan4_interface_linked_node_4a2;
import java.util.ArrayList;
import java.util.Scanner;

public class Pertemuan4_Interface_Linked_Node_4A2 {

    
    public static void main(String[] args) {
        Struktur_Node llist = new Struktur_Node();
        
        llist.head = new Struktur_Node.Node(1);
        Struktur_Node.Node second = new Struktur_Node.Node(2);
        Struktur_Node.Node third = new Struktur_Node.Node(3);
  
        llist.head.next = second; // Link first node with
                                  // the second node
        second.next = third; // Link second node with the third node
        
        System.out.println("\nHasil");
        // Function call methode
        llist.printList();
    }
    
}

