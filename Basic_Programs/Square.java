//Write a program to find the square of the number 3.9 ?

class Square 
{
	public static void main(String[] args) 
	{
		Program p = new Program();
		p.Square();
	}
}
class Program
{
void Square(){
		double d1 = 3.9;
		double d2 = Math.pow(d1,2);
		System.out.println("Square of the number "+ d1+ " is : "+d2);
	}
}