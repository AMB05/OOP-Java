package pertemuan10_binary_tree_2_4a1;

public class Pertemuan10_Binary_Tree_2_4A1 {

    public static void main(String[] args) {
        Pertemuan10_Binary_Tree_2_4A1 node = new Pertemuan10_Binary_Tree_2_4A1();
        node.run();
    }
    
    static class Node   
    {  
        Node left;  
        Node right;  
        int value;  
        public Node(int value)   
        {  
            this.value = value;  
        }  
    }  
    public void run()   
    {  
        Node rootnode = new Node(10);  
        System.out.println("Building tree with root value " + rootnode.value);  
        System.out.println("=================================");  
//        insert(rootnode, 10);  
        insert(rootnode, 20);  
        insert(rootnode, 30);  
        insert(rootnode, 100);  
        insert(rootnode, 90);  
        insert(rootnode, 40); 
        insert(rootnode, 50); 
        insert(rootnode, 60); 
        insert(rootnode, 70); 
        insert(rootnode, 80);
        insert(rootnode, 150);
        insert(rootnode, 110);
        insert(rootnode, 120); 
    }  
    public void insert(Node node, int value)   
    {  
        if (value < node.value)   
        {  
            if (node.left != null)   
            {  
                insert(node.left, value);  
            } 
            else   
            {  
                System.out.println("  Inserted " + value + " to left of Node " + node.value);  
                node.left = new Node(value);  
            }  
        }   
        else if (value > node.value)   
        {  
            if (node.right != null)   
            {  
                insert(node.right, value);  
            } 
            else   
            {  
                System.out.println("  Inserted " + value + " to right of Node " + node.value);  
                node.right = new Node(value);  
            }  
        }  
    }  
}
