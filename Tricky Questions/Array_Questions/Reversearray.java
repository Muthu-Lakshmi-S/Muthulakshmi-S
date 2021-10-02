//Question 2 : Write a Program to Reverse the array?
//Answer :

public class Reversearray
{
   public static void main(String[] args) {
    int[] a = {10,20,30,40,50,60,70,80,90};
    System.out.println("Original Array : ");
    for(int i=0;i<a.length;i++)
         System.out.print(a[i] + "  ");
    System.out.println();
   System.out.println("In Reverse Order : ");
         for(int i=a.length-1;i>=0;i--)
         System.out.print(a[i] + "  ");
    }
}
