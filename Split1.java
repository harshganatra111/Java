import java.io.*;
public class Split1
 {

   public static void main(String args[]) 
  {
      String Str = new String("Java-Programming");
      System.out.println("Return Value :" );      
      
         for(String retval: Str.split("-"))
         	System.out.println(retval);
     
   }
}