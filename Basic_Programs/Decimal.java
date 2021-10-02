/*Write a program to add an integer variable having value 5 and 
a double variable having value 6.2 and print up to 3 decimal? */

class Decimal 
{
	public static void main(String[] args) 
	{
		Program p = new Program();
		p.Decimal();
	}
}
class Program
{
void Decimal(){
		int i=5;
		double f1 = 6.2;
		System.out.print("Add "+i+" and "+f1+" then print upto 3 decimals : ");
		System.out.printf("%.3f",i+f1);
	}
}