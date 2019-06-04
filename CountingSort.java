class CountingSort 
{ 
    void sort(Integer arr[]) 
    { 
        int n = arr.length; 
        Integer output[] = new Integer[n]; 
        int count[] = new int[11]; 
        
        //give count = 0 all
        for (int i=0; i<10; ++i) 
            count[i] = 0; 
  
        // count gets the amount of each value of the original data
        for (int i=0; i<n; ++i) 
            ++count[arr[i]]; 

        // change the value of count to i and i + 1
        for (int i=1; i<=10; ++i) 
            count[i] += count[i-1]; 
  
        
        //from the count last modification add to the output and reduce the value of count  
        for (int i = n-1; i>=0; i--) 
        { 
            output[count[arr[i]]-1] = arr[i]; 
            --count[arr[i]]; 
        } 
        
        for (int i = 0; i<n; ++i) 
            arr[i] = output[i]; 
    } 
  
    public static void main(String args[]) 
    { 
        CountingSort ob = new CountingSort(); 
        Integer arr[] = {1, 3, 5, 8, 3, 1, 4, 6, 7, 9, 3, 1, 4, 7, 4, 1, 1, 1, 1 }; 
       
        System.out.println("UnSorted character array is: ");
        for (int i = 0; i < arr.length; i++) 
        	System.out.print(arr[i]);
  
        ob.sort(arr); 
       
  
        System.out.println("\nSorted character array is: "); 
        for (int i=0; i<arr.length; ++i) 
            System.out.print(arr[i]); 

    
    } 
} 
