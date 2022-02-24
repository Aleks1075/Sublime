public class Teacher
{
	//1.fields
	private String name;
	private int age;
	private boolean isFemale;

//2.constructor
	public Teacher(String tmpName, int tmpAge, boolean tmpIsFemale)
{
this.name = tmpName;
this.age = tmpAge;
this.isFemale = tmpIsFemale;
}

//3.methods

public String getName()
{
	return this.name;
}
public int getAge()
{
	return this.age;
}
public boolean getGender()
{
	return this.isFemale;

}

}