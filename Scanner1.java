//user input using Scanner class

import java.util.Scanner;

class Scanner1
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a string : ");
    System.out.println(sc.next()); //next() reads the next string from the Scanner class object in string format
    System.out.println(sc.nextDouble()+3.146725629962); //nextDouble() reads the next double value from the Scanner class object in double format
    System.out.println(sc.nextFloat()+14.5); //nextFloat() reads the next float value from the Scanner class object in float format
    System.out.println(sc.nextLong()+1000000000); //nextLong() reads the next long value from the Scanner class object in long format
    System.out.println(sc.nextInt()+100); //nextInt() reads the next integer from the Scanner class object in integer format
  }
}