//displaying the biodata

import java.lang.*;

class Variable1
{
  public static void main(String[] data)
  {
    int a,b,c;
    a=b=c=10;

    int x=10,y=20,z=30;

    System.out.println(a);
    System.out.println("a="+a); //+ is coincatenation operator
    System.out.println("a="+a+"\nb="+b+"\nc="+c);
    a='A';
    System.out.println("a="+a);

    float f1,f2;
    f1=31.14f;
    System.out.println("f1="+f1);

    double d1,d2;
    d1=-3.1452722000;
    System.out.println("d1="+d1);

    char ch;
    ch='a';
    System.out.println("ch="+ch);
    ch=65;
    System.out.println("ch="+ch);

    boolean b1,b2;
    b1=true;
    b2=false;
    System.out.println("b1="+b1);
    System.out.println("b2="+b2);

    String s1,s2;
    s1="Java";
    s2="C++";
    System.out.println("s1="+s1);
    System.out.println("s2="+s2);
  }
}