//bitwise NOT operator

class BitwiseNOT
{
  public static void main(String[] args)
  {
    int a=10,b;
    b=~a;
    System.out.println("~"+a+"="+b);   
  }
}

/*	10/2=5	-0
	5/2=2	-1
	2/2=1	-0

	10		->	00001010

	1's complement	->	11110101

	2's complement	->	+      1
				--------
				11110110

	11110101	->	1X2^7+1X2^6+1X2^5+1X2^4+0X2^3+1X2^2+0X2^1+1X2^0
			->	128+64+32+16+0+4+0+1
			->	245-2^8
			->	245-256
			->	-11

        if n is the number=~n=-n-1
*/