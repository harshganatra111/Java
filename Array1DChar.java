//1D character array

import java.io.*;

class Array1DChar
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter no of characters : ");
    int size=Integer.parseInt(br.readLine());

    char chr[]=new char[size];

    for(int a =0;a<size;++a)
    {
       chr[a]=(char)br.read();
    }

    for(int a =0;a<size;++a)
    {
       System.out.println("chr["+a+"]="+chr[a]);
    }
  }
}