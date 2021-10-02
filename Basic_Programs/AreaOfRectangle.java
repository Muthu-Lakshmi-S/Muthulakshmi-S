//Write a program to print the area of rectangle of sides 2 and 3 units respectively?

class Areaofrectangle
{
	public static void main(String[] args) 
	{
		Program p = new Program();
		p.areaOfRectangle();
	}
}
class Program
{
	void areaOfRectangle(){
		int l=3, b=2;
		System.out.println("Area of Rectangle");
		System.out.println("To find the area of triangle of length "+l+" and breath "+b+" is : "+(l*b));
	}
}
