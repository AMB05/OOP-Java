package pertemuan12_binari_tree_traversal_preorder;

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


public class Pertemuan12_Binari_Tree_Traversal_Preorder {

    // Root of Binary Tree
    Node root;
 
    Pertemuan12_Binari_Tree_Traversal_Preorder() 
    {
        root = null;
    }
 
    // Given a binary tree, print its nodes in preorder
    void printPreorder(Node node)
    {
        if (node == null)
            return;
 
        // First print data of node
        System.out.print(node.key + " ");
 
        // Then recur on left subtree
        printPreorder(node.left);
 
        // Now recur on right subtree
        printPreorder(node.right);
    }
    
    public static void main(String[] args) {
        
        Pertemuan12_Binari_Tree_Traversal_Preorder tree = new Pertemuan12_Binari_Tree_Traversal_Preorder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        // Function call
        System.out.println(
            "Preorder traversal of binary tree is ");
        tree.printPreorder(tree.root);
    }
    
}

