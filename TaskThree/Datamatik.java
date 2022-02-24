public class Datamatik
{
	public static void main(String[] args)
	{
		Teacher tobias = new Teacher("Tobias", 50, false);
		System.out.println(tobias.getName()+tobias.getAge()+tobias.getGender());

		Student aleks = new Student("Aleks", 27, false, 1);
		System.out.println(aleks.getName()+aleks.getAge()+aleks.getGender()+aleks.getDatamatikerTeam());

		Student pelle = new Student("Pelle", 27, false, 2);
		System.out.println(pelle.getName()+pelle.getAge()+pelle.getGender()+aleks.getDatamatikerTeam());


	}

}