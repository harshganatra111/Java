//logical OR operator

class LogicalOR
{
  public static void main(String[] args)
  {
    char ch='z';

    if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
    {
      System.out.println(ch+" is a vowel.");
    }
    else
    {
      System.out.println(ch+" is not a vowel.");
    }
  }
}