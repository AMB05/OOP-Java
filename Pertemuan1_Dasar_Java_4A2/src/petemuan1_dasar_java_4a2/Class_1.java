package petemuan1_dasar_java_4a2;
import java.util.Scanner;

public class Class_1 {
    Scanner input2 = new Scanner(System.in);
    
    Interface_1 panggil2;

    public Class_1() {
        this.panggil2 = new Interface_1() {
            
            @Override
            public void satu() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public void dua() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
    
    void metod_1 ()
    {
        System.out.println("Data Diri");
        System.out.println("---------");
        
        System.out.print("Input nama : ");
        String Nama = input2.nextLine();
    }
}
