//Write a program to print the product of the numbers 8.2 an 6. ?

class Prodofnumber 
{
	public static void main(String[] args) 
	{
		Program p = new Program();
		p.Product();
	}
}
class Program
{
	void Product(){
		double a=8.2, b=6.;
		System.out.println("The product of two numbers "+a+" and "+b+" is : "+ (a*b));
	}
}