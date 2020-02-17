/*
	Aa
	Aa Bb
	Aa Bb Cc
	Aa Bb Cc Dd
	Aa Bb Cc Dd Ee
*/

import java.io.*;

class Pattern4
{
   public static void main(String[] args)
     {  
	for(int a=1;a<=5;a++)
        {
          for(int i=65,j=1;j<=a;i++,j++)
           {
             System.out.print((char)i+""+(char)(i+32)+"\t");
           }
	  System.out.println();	
        }
     }
}