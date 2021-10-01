//Take 10 integer inputs from user and store them in an array and print them on screen.

import java.util.Scanner; 
class Print
{
	public static void main(String[] args) 
	{
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the number of elements in the array : ");
       int n = s.nextInt();
       if(n>0){
			}
       else {
    	   System.out.print("Enter the number of elements above 0");
		}
	   int[] a = new int[n];
	   for(int i = 0; i<a.length;i++){
		   System.out.print("Print the value of a["+i+"]");
		   a[i] = s.nextInt();
	   }
	   for(int i = 0; i<a.length;i++){
		   System.out.println("The Value of a["+i+"] is "+a[i]);
	   }
	}
	}