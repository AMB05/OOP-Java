package pertemuan6_set_map_4a2;
import java.util.Arrays;
import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.HashSet;  
import java.util.List;  
import java.util.Map;  
import java.util.Set;

public class Pertemuan6_Set_Map_4A2 {
    
    public static void main(String[] args) {
        
                     //variabel set (setting)
        Set <String> Setting = new HashSet<String>(); //deklarasi set
        
                             //variabel map (mapping)        
        Map<Integer, String> mapping = new HashMap<Integer, String>(); //deklarasi map
        
        //input data set
        Setting.add("Fadhil"); //input data set
        Setting.add("Agil"); //input data set
        Setting.add("Catur"); //input data set
        Setting.add("Pasha"); //input data set
        Setting.add("Fikri"); //input data set
        
//        System.out.println("Data Set adalah : " + Setting);
        
        //input data map
        mapping.put(1, "Mahrun"); //input data map
        mapping.put(2, "Azizah"); //input data map
        mapping.put(3, "Safira"); //input data map              
        mapping.put(4, "Alya"); //input data map        
                
//        System.out.println(mapping);        
        
        //output map
        for (Map.Entry m : mapping.entrySet()) 
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
    
}
