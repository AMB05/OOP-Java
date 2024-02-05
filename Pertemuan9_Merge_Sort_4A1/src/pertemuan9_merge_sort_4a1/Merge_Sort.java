package pertemuan9_merge_sort_4a1;

public class Merge_Sort 
{
    void Merge_Sort(int a[], int beg, int end)  
    {  
        if (beg < end)   
        {  
            int mid = (beg + end) / 2;  
            Merge_Sort(a, beg, mid);  
            Merge_Sort(a, mid + 1, end); 
            
            Merge merge = new Merge();
            merge.Merge(a, beg, mid, end);
            
        }  
    }  

    
}
