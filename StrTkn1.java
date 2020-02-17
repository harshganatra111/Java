//StringTokenizer class

import java.io.*;
import java.util.*;

class StrTkn1
{
   public static void main(String[] args) throws IOException
   {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

     System.out.println("Enter the name of programming languages :-");
     String str=br.readLine();

     System.out.println("Enter the Delimiter : ");
     String deli=br.readLine();

     StringTokenizer st=new StringTokenizer(str,deli);
     
     System.out.println("\nCourses :-");
     while(st.hasMoreTokens()) //hasMoreTokens() returns true if there is a token in the StringTokenizer object, otherwise returns false
     {
        System.out.println(st.nextToken());
     }
   }
}