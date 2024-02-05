package pertemuan3_interface_list_array_4a2;
import java.util.List;
import java.util.ArrayList;

public class List_arrary implements Interface_List_Array
{
    


    @Override
    public void List_array() {
               
        //Creating a List  
        List<String> list=new ArrayList<String>();  
        //Adding elements in the List  
        list.add("Mango");  
        list.add("Apple");  
        list.add("Banana");  
        list.add("Grapes");  
        //Iterating the List element using for-each loop  
        for(String fruit:list){
            System.out.println(fruit);
        } 
     }

    @Override
    public void Array_list() {
        ArrayList<String> arrayList = new ArrayList<String>();
        
        // add elements in the array list
        arrayList.add("Java");
        arrayList.add("Kotlin");
        arrayList.add("C++");
        System.out.println("ArrayList: " + arrayList);
        
        // change the element of the array list
        arrayList.set(2, "JavaScript");
        System.out.println("Modified ArrayList: " + arrayList);
        
        // remove element from index 2
        String str = arrayList.remove(2);
        System.out.println("Updated ArrayList: " + arrayList);
        System.out.println("Removed Element: " + str);
    }
}
