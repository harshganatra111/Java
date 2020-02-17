//1D string array

import java.io.*;

class Array1DString
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter no of strings : ");
    int size=Integer.parseInt(br.readLine());

    String str[]=new String[size];

    for(int a =0;a<size;++a)
    {
       str[a]=br.readLine();
    }

    for(int a =0;a<size;++a)
    {
       System.out.println("str["+a+"]="+str[a]);
    }
  }
}