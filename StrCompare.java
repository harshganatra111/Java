//string comparison

class StrCompare
{
  public static void main(String[] args)
  {
     String s1="Java";
     String s2="C++";

     if(s1==s2)
         System.out.println("Same");
     else
         System.out.println("Not Same");

     String s3="Java";
     String s4="Java";

     if(s3==s4)
         System.out.println("Same");
     else
         System.out.println("Not Same");

     String s5="Java";
     String s6=new String("Java");

     if(s5==s6)
         System.out.println("Same");
     else
         System.out.println("Not Same");

    if(s5.equals(s6))
         System.out.println("Same");
     else
         System.out.println("Not Same");

  }
}