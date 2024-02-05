package pertemuan9_merge_sort_2_4a1;

public class Pertemuan9_Merge_Sort_2_4A1 {

    public static void main(String[] args) 
    {
        int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };  
        int n = a.length;  
        Merge m1 = new Merge();  
        
        System.out.println("\nBefore sorting array elements are - ");  
        m1.printArray(a, n);  
        m1.mergeSort(a, 0, n-1);  
        
        System.out.println("\nAfter sorting array elements are - ");  
        m1.printArray(a, n);  
        System.out.println("");
    }
}
