//nested if statement

class NestedIf1
{
  public static void main(String[] args)
  {
    int uid=70001;
    int pwd=12345;

    if(uid==70001)
    {
       if(pwd==1234)
       {
          System.out.println("Welcome");
       }
       else
       {
          System.out.println("Incorrect Password.");
       }
    }
    else
    {
       System.out.println("Incorrect UserId.");
    }
  }
}