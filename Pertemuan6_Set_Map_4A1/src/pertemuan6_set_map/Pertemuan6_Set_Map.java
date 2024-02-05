package pertemuan6_set_map;

import java.util.Arrays;
import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.HashSet;  
import java.util.List;  
import java.util.Map;  
import java.util.Set; 

public class Pertemuan6_Set_Map {

    public static void main(String[] args) {
        
                     //variabel set (setting)
        Set <String> Setting = new HashSet<String>(); //deklarasi set
                     //variabel map (mapping)        
        Map<Integer, String> mapping = new HashMap<Integer, String>(); //deklarasi map
        
        Setting.add("Ipeh"); //input data set
        Setting.add("Agna"); //input data set
        Setting.add("Ahmad"); //input data set
        Setting.add("Amrul"); //input data set
        
        mapping.put(1, "Ipeh"); //input data map
        mapping.put(2, "Ahmad"); //input data map
        mapping.put(3, "Agna"); //input data map
        mapping.put(4, "Amrul"); //input data map
        
//        System.out.println("Output set adalah " + Setting); //output set
        
        //output map
        for (Map.Entry m : mapping.entrySet()) 
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
                
    }
    
}
