//Question 3 : Write a Program to Sort the given array?
//Answer :

public class Sortarray
{  
    public static void main(String[] args) {          
        int [] a = new int [] {20,10,-20,40,-40,-10,-30,50,-50,30};     
        int temp = 0;    
       System.out.println("Original Array : ");    
       for (int i = 0; i <a.length; i++) {     
           System.out.print(a[i] + " ");    
        }        
        for (int i = 0; i <a.length; i++) {     
          for (int j = i+1; j <a.length; j++) {     
              if(a[i] >a[j]) {    
                 temp = a[i];    
                 a[i] = a[j];    
                 a[j] = temp;    
               }     
            }     
        }    
        System.out.println("\nSorted Array : ");    
        for (int i = 0; i <a.length; i++) {     
            System.out.print(a[i] + " ");    
        }    
    }    
}   