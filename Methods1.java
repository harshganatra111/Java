//methods

import java.util.Scanner;

class Calculate1
{
  int a,b;
  Scanner sc=new Scanner(System.in);
  void add()
  {
     System.out.println("Method without returntype and without parameter");
     System.out.print("a=");
     a=sc.nextInt();
     System.out.print("b=");
     b=sc.nextInt();
     System.out.println(a+"+"+b+"="+(a+b));
  }

  void add(int x,int y)
  {
     System.out.println("Method without returntype and with parameter");
     System.out.println(x+"+"+y+"="+(x+y));     
  }

  int sum()
  {
     System.out.println("Method with returntype and without parameter");
     System.out.print("a=");
     a=sc.nextInt();
     System.out.print("b=");
     b=sc.nextInt();
     return (a+b);
  }

  int sum(int x,int y)
  {
     System.out.println("Method with returntype and with parameter");
     return (x+y);
  }
}
class Methods1
{
   public static void main(String[] args)
   {
     Calculate1 c1=new Calculate1();
     c1.add();
     c1.add(10,20);
     System.out.println(c1.sum());
     System.out.println(c1.sum(20,30));
   }
}