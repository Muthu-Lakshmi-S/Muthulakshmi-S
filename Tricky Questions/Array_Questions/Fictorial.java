//Find Fictorial of a Large Number..?
//Answer:

class Fictorial
{

	public static void main(String[] args) 
	{
		int a[] = {1,-1,-2,-3,2,1,-5,3,-2,11};
		int len = a.length;
		System.out.print("Given array : ");
		for(int i=0; i<len; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
		ArrayQues ar = new ArrayQues();
		ar.Factorial(a,len);
	}
		void Factorial(int a[], int len){
		int largest = a[0], factorial = 1;
		for(int i=1; i<len; i++){
			if(a[i] > largest){
				largest = a[i];
			}
		}
		System.out.print(largest+" is the largest and it's factorial is : ");
		for(int j=largest; j>0; j--){
			factorial = j * factorial;
		}
		System.out.print(factorial+" ");
		System.out.println("\n");
	}
}