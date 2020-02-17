//try catch

import java.util.*;

class TryCatch
{
  public static void main(String[] args)
   {
     Scanner scr=new Scanner(System.in);
     try
      {
        System.out.print("Enter an integer : ");
        double num1=scr.nextInt();
        System.out.print("Enter an integer : ");
        double num2=scr.nextInt();
        double ans=num1/num2;
        System.out.println("Ans = "+ans);
      }
     catch(Exception e)
      {
        System.out.println("Invalid Input......!!!!!");
      }
   }
}