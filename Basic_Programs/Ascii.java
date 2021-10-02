//Print the ASCII value of the character 'H' ?

class Ascii 
{
	public static void main(String[] args) 
	{
		Program p = new Program();
		p.Ascii();
	}
}
class Program
{
void Ascii(){
		char c = 'H';
		int i = c;
		System.out.println("The ASCII value if "+c+" is : "+ i);
	}
}