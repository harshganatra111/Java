// String Tokenizer

import java.io.*;
import java.util.*;

class StrTkn
{
   public static void main(String[] args) throws IOException
    {
	int i=1;
        String str;
	System.out.print("Enter names of students separated by comma :");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	str=br.readLine();
	StringTokenizer st=new StringTokenizer(str,",");
	while(st.hasMoreTokens())
         {
           System.out.println(i+". "+st.nextToken());
	   i++;
         }
    }
}