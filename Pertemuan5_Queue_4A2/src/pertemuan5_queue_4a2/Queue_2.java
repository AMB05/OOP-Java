package pertemuan5_queue_4a2;


public class Queue_2 implements Comparable<Queue_2>
{
    int id;  
    String name,author,publisher;  
    int quantity;  
    
    public Queue_2(int id, String name, String author, String publisher, int quantity) 
    {  
        this.id = id;  
        this.name = name;  
        this.author = author;  
        this.publisher = publisher;  
        this.quantity = quantity;  
    }  
    
    public int compareTo(Queue_2 b) 
    {  
        if(id>b.id){  
            return 1;  
        }else if(id<b.id){  
            return -1;  
        }else{  
        return 0;  
        }  
    }  
}
