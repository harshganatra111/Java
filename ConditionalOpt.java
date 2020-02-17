//conditional operator or ternary operator

class ConditionalOpt
{
  public static void main(String[] args)
  {
    int a=10,b=20,max;

    max=(a>b)?a:b;

    System.out.println("Max Value="+max);

    System.out.println((a>b)?"Max="+a:"Max="+b);
  }
}