//arithmatic operators

import java.lang.*;

class ArithOpt1
{
  public static void main(String[] args)
  {
     int a,b,c;
     
     a=10;
     b=15;

     c=a+b; //addition operator

     System.out.println(c);
     System.out.println(a+b);
     System.out.println("c="+c);
     System.out.println("a+b="+c);
     System.out.println(a+"+"+b+"="+c);

     c=a-b; //substraction operator
     System.out.println(c);
     System.out.println(a-b);
     System.out.println("c="+c);
     System.out.println("a-b="+c);
     System.out.println(a+"-"+b+"="+c);
    
     c=a*b;//multiplication operator
     System.out.println(c);
     System.out.println(a*b);
     System.out.println("c="+c);
     System.out.println("a*b="+c);
     System.out.println(a+"*"+b+"="+c);

     c=a/b;//division operator
     System.out.println(c);
     System.out.println(a/b);
     System.out.println("c="+c);
     System.out.println("a/b="+c);
     System.out.println(a+"/"+b+"="+c);

     c=a%b;//modulous operator
     System.out.println(c);
     System.out.println(a%b);
     System.out.println("c="+c);
     System.out.println("a%b="+c);
     System.out.println(a+"%"+b+"="+c);

  }
}