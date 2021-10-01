//Write a program to check if elements of an array are same or not it read from front or back.

import java.util.*;
class ReverseEqualOrginal
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array : ");
		int n = s.nextInt();
		if(n>0){
			int [] arr = new int [n];
			for(int i=0; i<n; i++){
				System.out.print("Enter the "+(i+1)+" element : ");
				arr[i] = s.nextInt();
			}
			ReverseEqualOrginal a = new ReverseEqualOrginal();
			a.print(arr,n);
			a.RevOrginal(arr,n);
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

	//Reversed array is same as the original array
	public void RevOrginal(int arr[], int n){
		int count = 0;
		int reversedArray[] = new int[n];
		System.out.print("\nReversed array : [");
		for(int i=0; i<n; i++){
			reversedArray[i] = arr[n-(i+1)];
			System.out.print(reversedArray[i]+",");
		}
		System.out.print("\b]\n\n");
		for(int i=0; i<n; i++){
			if(arr[i]==reversedArray[i]){
				count++;
			}
			else{
				System.out.println("The orginal array and the reversed array are different.\n");
				break;
			}
		}
		if(count==n){
				System.out.println("The orginal array and the reversed array are same.\n");		
		}
	}
}

