package pertemuan2_array_list_4a2;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class Pertemuan2_Array_List_4A2 {
    
    void Array()
    {
        int a [];   //array 1 dimensi
        int b [][]; //array 2 dimensi
        
        String c [] = {"Honda", "BMW", "Hyundai"}; //array yang memiliki nilai
        
        int [] arrayAngka = {11,12,13,14,15,16,17,18,19,20};
        
        double [] d = new double[5]; //array yang bernilai 5 tapi belum diiisi value
        
        char e [] ={}; //array kosong
    }
    
    void Array2()
    {
        int [] nilai = {1,2,3,4,5};
        System.out.println(nilai[2]);
        System.out.println(nilai[4]);
    }
    
    void Array3()
    {
        Scanner input =  new Scanner(System.in);
        
        String [] contoh_2 = new String[3]; //penulisan Array dengan inputan
        
        System.out.println("Input nama");
        contoh_2[0]=input.nextLine();//input di simpan pada array
        
        System.out.println("Input prodi");
        contoh_2[1]=input.nextLine(); //input di simpan pada array
        
        System.out.println("Input stambuk");
        contoh_2[2]=input.nextLine(); //input di simpan pada array
        
        System.out.println("");
        //output array
        System.out.println("nama saya " + contoh_2[0]);
        System.out.println("prodi " + contoh_2[1]);
        System.out.println("stambuk " + contoh_2[2]);
    }
    
    void array_list()
    {
        //contoh penggunaan array dengan list
        ArrayList contoh_ = new ArrayList();
        contoh_.add("Burger");
        contoh_.add(5000);
        contoh_.add(3.12);
        contoh_.add(false);

        //menampilkan list
        System.out.println(contoh_);
        //menghapus isi dalam list
        contoh_.remove(false);
        //menambahkan
        contoh_.add("kentang");
        System.out.println(contoh_);
        //menampilkan jumlah isi
        System.out.println(contoh_.size());
        //mengambil nilai dalam list
        System.out.println(contoh_.get(2));
    }

    
    public static void main(String[] args) {
        Pertemuan2_Array_List_4A2 panggil = new Pertemuan2_Array_List_4A2();
        
        panggil.array_list();
    }
    
}
