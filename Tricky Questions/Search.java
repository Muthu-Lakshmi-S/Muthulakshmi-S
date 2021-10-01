/*Take 10 integer inputs from user and store them in an array. 
Again ask user to give a number. Now, tell user whether that number is present in array or not.*/

import java.util.*;
class Search
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number of elements in the array : ");
		int n = s.nextInt();
		if(n>0){
			int [] arr = new int [n];
			for(int i=0; i<n; i++){
				System.out.print("Enter the "+(i+1)+" element : ");
				arr[i] = s.nextInt();
			}
			Search a = new Search();
			a.print(arr,n);
			a.PresentInArray(arr,n);
		}
		else{
			System.out.print("\nEnter the number of elements above 0.\n ");
		}
	}

	// Display the Array
	public void print(int arr[],int n){
		System.out.print("\nGiven Array : [");
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+",");
		}
		System.out.print("\b]\n");
	}

	//Check whether the number is present or not
	public void PresentInArray(int arr[],int n){
		System.out.print("Enter the number to be searched : ");
		int find = s.nextInt();
		int count = 0;
		for(int i=0; i<n; i++){
			if(arr[i]== find){
				System.out.println("Number "+find+" is present in the array");
				count = 1;
				break;
			}
		}
		if(count==0){
			System.out.println("Number "+find+" is not present in the array");
		}
	}
}
