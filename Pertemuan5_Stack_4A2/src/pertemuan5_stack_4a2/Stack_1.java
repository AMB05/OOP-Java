package pertemuan5_stack_4a2;
import java.util.Stack;

public class Stack_1 {
    void stack1()
    {
        //creating an instance of Stack class  
        Stack<Integer> stk= new Stack<>();  
        // checking stack is empty or not  
        boolean result = stk.empty();  
        System.out.println("Is the stack empty? " + result);  
        // pushing elements into stack  
        stk.push(78);  
        stk.push(113);  
        stk.push(90);  
        stk.push(120);  
        //prints elements of the stack  
        System.out.println("Elements in Stack: " + stk);  
        result = stk.empty();  
        System.out.println("Is the stack empty? " + result); 
    }
}

