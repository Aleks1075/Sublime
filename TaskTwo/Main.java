public class Main
{
  public static boolean happy = true;

  public static int sum(int a, int b)
  {
  System.out.println(a+b);
  return a+b;
  }

  public static String upperCase(String tmpString)
  {
  String upperCaseString = tmpString;
  System.out.println(upperCaseString.toUpperCase());
  return upperCaseString.toUpperCase();
  }

  public static boolean letterCase(String tempString)
  {
  char charchecker = tempString.charAt(0);
  if(Character.isUpperCase(charchecker))
  {
  System.out.println("True");
  return true;
  }
  return false;
  }


  public static void main(String [] args) {
  if (iAmHappy())
  {
  System.out.println("I clap my hands");
  }
  else
  {
  System.out.println("I don't clap my hands"); 
  }

  sum(5,10);

  upperCase("computer");

  letterCase("Hello");
  }
  

  public static boolean iAmHappy()
  {
  // fill out what is missing here:
  return happy;
  }
}