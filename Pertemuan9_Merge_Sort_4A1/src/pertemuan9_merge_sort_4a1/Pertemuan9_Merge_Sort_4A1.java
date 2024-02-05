package pertemuan9_merge_sort_4a1;


public class Pertemuan9_Merge_Sort_4A1 {

    
    public static void main(String[] args) 
    {
        int a[] = { 12, 31, 25, 8, 32, 17, 40, 42 };  
//        int n = sizeof(a) / sizeof(a[0]);  
        int n = a.length;
        
//        Merge merge = new Merge();
        
        System.out.println("Before sorting array elements are - \n");
        
        Print_Array print_Array = new Print_Array();
        print_Array.print_Array(a, n);
        
         
        Merge_Sort merge_Sort = new Merge_Sort();
        merge_Sort.Merge_Sort(a, 0, n-1);
        
        
        System.out.println("After sorting array elements are - \n");
        print_Array.print_Array(a, n);
    }
}
