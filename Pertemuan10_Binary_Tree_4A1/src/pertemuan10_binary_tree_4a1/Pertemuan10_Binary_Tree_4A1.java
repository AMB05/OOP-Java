package pertemuan10_binary_tree_4a1;


public class Pertemuan10_Binary_Tree_4A1 {
    
    public static class Node{    
        int data;    
        Node left;    
        Node right;    
        public Node(int data){    
            //Assign data to the new node, set left and right children to null    
            this.data = data;    
            this.left = null;    
            this.right = null;    
            }    
        }    
    //Represent the root of binary tree    
    public Node root;    
    public Pertemuan10_Binary_Tree_4A1(){    
        root = null;    
    }    
    //factorial() will calculate the factorial of given number    
    public int factorial(int num) {    
        int fact = 1;    
        if(num == 0)    
            return 1;    
        else {    
            while(num > 1) {    
                fact = fact * num;    
                num--;    
            }    
            return fact;    
        }    
    }    
    //numOfBST() will calculate the total number of possible BST by calculating Catalan Number for given key    
    public int numOfBST(int key) {    
        int catalanNumber = factorial(2 * key)/(factorial(key + 1) * factorial(key));    
        return catalanNumber;    
    }  

    public static void main(String[] args) {
        Pertemuan10_Binary_Tree_4A1 bt = new Pertemuan10_Binary_Tree_4A1();    
        //Display total number of possible binary search tree with key 5    
        System.out.println("Total number of possible Binary Search Trees with given key: " + bt.numOfBST(10));
    }
    
}