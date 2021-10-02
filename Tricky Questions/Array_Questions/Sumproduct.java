//Question 10 : Write a Program to find the sum and product of all elements of an array?
//Answer :

public class Sumproduct
{   
    public static void main(String[] args) {  
        int [] a = new int [] {1, 2, 3, 4, 5};  
        int sum = 0;
		int prod = 1;
        for (int i = 0; i < a.length; i++) {  
           sum = sum + a[i];  
		   prod = prod * a[i];
        }  
        System.out.println("Sum of the Elements : " + sum);  
		 System.out.println("Product of the Elements : " + prod);  
    }  
}
