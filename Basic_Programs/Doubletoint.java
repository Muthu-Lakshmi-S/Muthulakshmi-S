//Write a program to assign a value of 100.235 to a double variable and then convert it to int?

class Doubletoint 
{
	public static void main(String[] args) 
	{
		Program p = new Program();
		p.DoubleToInt();
	}
}
class Program
{
void DoubleToInt(){
		double d =100.235;
		int i = (int)d;
		System.out.println("Convert the double value "+d+" to int value : "+i);
	}
}