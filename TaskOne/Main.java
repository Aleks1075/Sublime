public class Main
{

	public static void emptyLine()
	{
		System.out.println("");
	}


	public static String myString(String tmpString)
	{
		return tmpString;

	}

	public static void nameAge(String tmpName, int tmpAge)
	{
		String name = tmpName;
		int age = tmpAge;
		System.out.println("My name is "+name+" I am "+age+" years old.");

	}


	public static void main(String[] args)
	{
		emptyLine();
		System.out.println(myString("Hej"));
		nameAge("Aleks", 27);

	}

}