//Write a program to find the cube of the number 3.2

class Cube
{
	public static void main(String[] args) 
	{
		Program p = new Program();
		p.Cube();
	}
}
class Program
{
void Cube(){
		double d1 = 3.2;
		double d2 = Math.pow(d1,3);
		System.out.println("Cube of the number "+ d1+ " is : "+d2 + "\n");
	}
}