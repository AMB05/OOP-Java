package pertemuan4_interface_linked_node;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Pertemuan4_Interface_Linked_Node {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Struktur_Node llist = new Struktur_Node();
        
        System.out.print("Input Data String : ");
        String a = input.nextLine();
        System.out.print("Input Data Integer : ");
        int b = input.nextInt();
        System.out.print("Input Data Char : ");
        float c = input.nextFloat();
                
  
        llist.head = new Struktur_Node.Node(a);
        Struktur_Node.Node second = new Struktur_Node.Node(b);
        Struktur_Node.Node third = new Struktur_Node.Node(c);
  
        llist.head.next = second; // Link first node with
                                  // the second node
        second.next = third; // Link second node with the third node
        
        System.out.println("\nHasil");
        // Function call methode
        llist.printList();
    }
    
}
