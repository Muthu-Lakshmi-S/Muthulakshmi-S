// Find The Occurence of an Integer in the Array..?
//Answer :

import java.util.Scanner;

 class Occurence {
	public static void main(String[] args) {
		int[] a = {1,-1,-2,-3,2,1,-5,3,-2,9};
		System.out.println("Given Array : ");
		for (int i = 0; i <a.length; i++) {     
           System.out.print(a[i] + " ");    
        }       
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the Value of an Integer :");
		
		int x=sc.nextInt();
		sc.close();
		int occurence = 0;
		for(int i=0;i<a.length;i++)
		{
			if(x == a[i])
			{
				occurence++;
			}
		}
		System.out.println("Total Number of Occurence of an integer "+x+" : "+occurence);
	}
}