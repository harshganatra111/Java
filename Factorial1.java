//factorial

import java.io.*;
class Factorial
{  
   long fact1(int a)
   {
  
   
   long fact=1;
   for(int i=1;i<=a;i++)
     {
       fact=fact*i;
     }
  return fact;
   }
}

class Factorial1
{
  public static void main(String[] args) throws IOException
  {
    Factorial obj=new Factorial();
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter an integer to find it's factorial :");
    int n=Integer.parseInt(br.readLine());
    long f=obj.fact1(n);
    System.out.println("Factorial on "+n+"= "+f);    
  }
}
