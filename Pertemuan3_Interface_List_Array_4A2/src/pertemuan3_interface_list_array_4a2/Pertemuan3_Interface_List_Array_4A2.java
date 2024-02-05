package pertemuan3_interface_list_array_4a2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Pertemuan3_Interface_List_Array_4A2 {
    
    void Implementasi_1(){
        int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};
        
        // looping standard
        System.out.println("looping standard");
        for(int i = 0; i < 10; i++)
        {
            System.out.println("index ke-"+i+" adalah = " + arrayAngka[i]);
        }
        System.out.println("-----------------------------------");
        
        // looping dengan properti array
        System.out.println("looping dengan properti length");
        for(int i = 0; i < arrayAngka.length; i++)
        {
            System.out.println("index ke-"+i+" adalah = " + arrayAngka[i]);
        }
        System.out.println("-----------------------------------");
        
        // looping khususon untuk collection <- array
        System.out.println("looping for each");
        for( int angka : arrayAngka)
        {
            System.out.println("angka pada looping ini = " + angka);
        }
    }

    
    public static void main(String[] args) {
       Pertemuan3_Interface_List_Array_4A2 panggil = new Pertemuan3_Interface_List_Array_4A2();
               
       panggil.Implementasi_1();
         
    }
    
}



  


//Interface_List_Array [] drawables = new Interface_List_Array[]
//                                            { 
//                                                new Circle(10, 20, 15), 
//                                                new Circle(30, 20, 10),
//                                            };
//      for (int i = 0; i < drawables.length; i++){
//          drawables[i].draw(Interface_List_Array.RED);
//      }