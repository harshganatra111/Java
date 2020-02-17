//toCharArray
import java.io.*;
class ToCharArray1
{

   public static void main(String args[])
  {
      String Str = new String("Welcome to Java Programming.");

      System.out.print("Return Value :" );
      
      char chr[]=Str.toCharArray();
      System.out.println(chr);
   }
}