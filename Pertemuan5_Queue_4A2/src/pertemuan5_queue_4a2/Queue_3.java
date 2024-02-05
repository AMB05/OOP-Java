package pertemuan5_queue_4a2;
import java.util.*;  

public class Queue_3 extends Queue_2
{
    public Queue_3(int id, String name, String author, String publisher, int quantity) 
    {
        super(id, name, author, publisher, quantity);
        
        Queue<Queue_2> input_queue=new PriorityQueue<Queue_2>();  
        //Creating Books  
        Queue_2 b1=new Queue_2(121,"Let us C","Yashwant Kanetkar","BPB",8);  
        Queue_2 b2=new Queue_2(233,"Operating System","Galvin","Wiley",6);  
        Queue_2 b3=new Queue_2(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
        //Adding Books to the queue  
        input_queue.add(b1);  
        input_queue.add(b2);  
        input_queue.add(b3);  
        System.out.println("Traversing the queue elements:");  
        
        //Traversing queue elements  
        for(Queue_2 b:input_queue)
        {  
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
        }  
        input_queue.remove();  //mengahpus antrian
        System.out.println("After removing one book record:");  
        for(Queue_2 b:input_queue)
        {  
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
        }
    }
    
}
