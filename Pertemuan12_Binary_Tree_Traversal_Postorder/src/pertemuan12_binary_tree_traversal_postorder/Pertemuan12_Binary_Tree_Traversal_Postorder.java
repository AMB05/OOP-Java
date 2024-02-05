package pertemuan12_binary_tree_traversal_postorder;

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

public class Pertemuan12_Binary_Tree_Traversal_Postorder {

    // Root of Binary Tree
    Node root;
    
    public Pertemuan12_Binary_Tree_Traversal_Postorder()
    {
        root = null;
    }
 
    // Given a binary tree, print its nodes according to the
    // "bottom-up" postorder traversal.
    void printPostorder(Node node)
    {
        if (node == null)
            return;
 
        // First recur on left subtree
        printPostorder(node.left);
 
        // Then recur on right subtree
        printPostorder(node.right);
 
        // Now deal with the node
        System.out.print(node.key + " ");
    }
    
    public static void main(String[] args) {
        
        Pertemuan12_Binary_Tree_Traversal_Postorder tree = new Pertemuan12_Binary_Tree_Traversal_Postorder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        // Function call
        System.out.println(
            "Postorder traversal of binary tree is ");
        tree.printPostorder(tree.root);
        
    }
    
}

