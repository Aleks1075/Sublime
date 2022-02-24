public class Datamatik
{
    public static String [] students = {"Tobias", "Christian", "Nikolaj", "Chris", "Mathilde", "Per", "Sofie", "Siri", "John", "Gustav"};



    public static void main(String[] args)
    {
        getStudentName(students, 9);
        int num = getIndex(students, "Christian");
        System.out.println(num);
    }
    public static void getStudentName(String[] students, int s)
        {
           System.out.println(students[s]);
        }

    public static int getIndex (String[] students, String p)
        {
           for(int i = 0; i < students.length-1; i++)
        {
            if (students[i]==p)
                return i;
        }
        return 0;
    }
}