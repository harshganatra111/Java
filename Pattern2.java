//for loop

/*

A A A A
B B B
C C
D

*/

class Pattern2
{
  public static void main(String[] args)
  {
    for(int i=4,k=65;i>=1;--i,++k)
    {
      for(int j=1;j<=i;++j)
      {
         System.out.print((char)k);
      }
      System.out.println();
    }
  }
}