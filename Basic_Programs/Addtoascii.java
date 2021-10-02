/*Write a program to add 3 to the ASCII value of the character 'D' and 
print the equivalent character.*/  

class Addtoascii 
{
	public static void main(String[] args) 
	{
		Program p = new Program();
		p.AddToAscii();
	}
}
class Program
{
	void AddToAscii(){
		char c1 = 'D';
		char c2 = (char)(c1+3);
		System.out.println("Add 3 to the ASCII value of "+c1+" : "+ c2);
	}
}