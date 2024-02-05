package pertemuan3_interface_list_array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;        

public class Pertemuan3_Interface_List_Array {
    
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
    
    public interface MyInterface {
        void method1();
        void method2();
    }

    
    public static void main(String[] args) {
//        Pertemuan3_Interface_List_Array panggil = new Pertemuan3_Interface_List_Array();
//        
//        panggil.Implementasi_1();
                
        MyInterface[] myArray = new MyInterface[10];
        System.out.println(myArray);      
                
                
        
        
    }
    
}
