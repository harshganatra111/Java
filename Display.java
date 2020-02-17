//display 1. (a+b)(a-b)
//display 2. (a+b+c)/3
//display 3. (ab+bc+ca+2ab)

import java.lang.*;

class Display
{
   public static void main(String[] obj)
   {
    int a,b,c;
    a=5;
    b=10;
    c=(a+b)*(a-b);
    System.out.println("(a+b)(a-b)="+c);
    c=(a+b+c)/3;
    System.out.println("(a+b+c)/3="+c);
    c=((a*b)+(b*c)+(c*a)+2*a*b*c);
    System.out.println("(ab+bc+ca+2abc)="+c);
   }
}