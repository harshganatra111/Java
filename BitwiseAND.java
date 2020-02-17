//bitwise AND operator

class BitwiseAND
{
  public static void main(String[] args)
  {
    int a=10,b=11,c;

    c=a&b; 
    System.out.println(a+"&"+b+"="+c);   
  }
}

/*	10/2=5	-0
	5/2=2	-1
	2/2=1	-0

	11/2=5	-1
	5/2=2	-1
	2/2=1	-0

	10->	1010
	11->	1011
	-------------
	10&11->	1010
*/