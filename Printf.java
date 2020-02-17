//printf() and format specifiers

class Printf
{
  public static void main(String[] args)
  {
     int a=14;
     float f=15.5f;
     char ch='S';
     String str="Java";

     System.out.printf("\nInteger=%d",a);
     System.out.printf("\nBinary=%b",a);
     System.out.printf("\nOctal=%o",a);
     System.out.printf("\nHexa Decimal=%x",a);
     System.out.printf("\nFloat=%f",f);
     System.out.printf("\nCharacter=%c",ch);
     System.out.printf("\nString=%s",str);
  }
}



/* Format Specifier
	%c - character
	%d - integer
	%f - float
	%b %B - binary
	%o %O - octal
	%x %X - hexadecimal
	%s - string
*/