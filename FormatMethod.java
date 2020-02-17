//format()

class FormatMethod
{
  public static void main(String[] args)
  {
    int a=21;
    String str=String.format("Integer=%d\nOctal=%o\nHexa Decimal=%x",a,a,a);
    System.out.println(str);
  }
}