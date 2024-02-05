package pertemuan12_binary_tree_traversal_inorder;

class Node 
{
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

public class Pertemuan12_Binary_Tree_Traversal_Inorder {

    // Root of Binary Tree
    Node root;
 
    Pertemuan12_Binary_Tree_Traversal_Inorder() 
    {
        root = null;
    }
     
    // Given a binary tree, print its nodes in inorder
    void printInorder(Node node)
    {
        if (node == null)
            return;
 
        // First recur on left child
        printInorder(node.left);
 
        // Then print the data of node
        System.out.print(node.key + " ");
 
        // Now recur on right child
        printInorder(node.right);
    }
    
    public static void main(String[] args) {
        
        Pertemuan12_Binary_Tree_Traversal_Inorder tree = new Pertemuan12_Binary_Tree_Traversal_Inorder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        // Function call
        System.out.println(
            "Inorder traversal of binary tree is ");
        tree.printInorder(tree.root);
    }
    
}
