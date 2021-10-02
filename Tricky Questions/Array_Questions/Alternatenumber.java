//How to Rearrange Array in alternating Positive and Negative Number..?
//Answer:

public class Alternatenumber {
	
	public static void main(String[] args) {
		
		int[] a1={-4,-3,-2,-1,1,2,5,6};	
		int i=-1;
		int a2;
		
		System.out.println("Original Array :");
		for(int a=0;a<a1.length;a++)
		{
			System.out.print(a1[a]+"\t");
		}
		
		for(int j=0;j<a1.length;j++)
		{
			if(a1[j]<0)
			{
				i++;
				a2=a1[i];
				a1[i]=a1[j];
				a1[j]=a2;
			}			
		}
		int positive=i+1,negative=0;
		while(positive<a1.length && negative<positive && a1[negative]<0)
		{
			a2=a1[negative];
			a1[negative]=a1[positive];
			a1[positive]=a2;
			positive++;
			negative+=2;
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Modified Array :");
		for(int k=0;k<a1.length;k++)
		{	
				System.out.print(a1[k]+"\t");
		}
	}
}