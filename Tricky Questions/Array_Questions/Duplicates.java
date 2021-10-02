//Question 6 : Find duplicates in an array?
//Answer :

public class Duplicates
{
    public static void main(String[] args) {      
      int [] a = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3, 10, 10};   
      System.out.println("Original Elements : " +"\n"+ "1, 2, 3, 4, 2, 7, 8, 8, 3, 10, 10"); 
	   System.out.println();
        System.out.println("Duplicate Elements : ");  
        for(int i = 0; i < a.length; i++) {  
            for(int j = i + 1; j < a.length; j++) {  
               if(a[i] == a[j])  
                   System.out.println(a[j]);  
          }  
      }  
    }  
}  