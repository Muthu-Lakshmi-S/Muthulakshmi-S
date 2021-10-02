//How to find common Elements in Three Sorted Arrays..?
//Answer

import java.util.Arrays;
public class Threesorted {
	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5,6};
		int[] a2 = {2,4,6,8,7,1};
		int[] a3 = {3,6,9,0,2,7};
		Arrays.sort(a1);
		Arrays.sort(a2);
		Arrays.sort(a3);
		int i=0,j=0,k=0;
		while(i<a1.length && j<a2.length && k<a3.length)
		{
			if(a1[i] == a2[j] && a2[j] == a3[k])
			{
				System.out.println(a1[i]);
				i++;
				j++;
				k++;
			}
			else if(a1[i] < a2[j])
			{
				i++;
			}
			else if(a2[j] < a3[k])
			{
				j++;
			}
			else
				k++;
		}
	}
}
