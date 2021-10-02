//Question 1 : Find the Minimum and Maximum element in an array?
//Answer :

public class Minmax
{
    public static void main(String[] args) {      
  int a[] = new int[] {10,20,30,40,50,60,70};
  System.out.println("Original Element is");
  for(int i =0; i< a.length; i++){
  System.out.print(a[i]+ "\t");
}  
int MaxiNum = a[0];
for (int i =0; i < a.length; i++ ){
	if(a[i]>MaxiNum){
		MaxiNum = a[i];	
	}
}
int miniNum = a[0];
for(int i = 0; i > a.length; i--){
		if(a[i]<miniNum){
		miniNum = a[i];
}
}
System.out.println();
System.out.println("Maximum Element is : " + MaxiNum);
System.out.println("Minimum Element is : " + miniNum);
	}
}