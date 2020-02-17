//compact notations for operators

class OptShortHands
{
  public static void main(String[] args)
  {
     int a=2;

     System.out.println("a+=2\t"+(a+=2));
     System.out.println("a-=2\t"+(a-=2));
     System.out.println("a*=2\t"+(a*=2));
     System.out.println("a/=2\t"+(a/=2));
     System.out.println("a%=2\t"+(a%=2));

     System.out.println("a&=2\t"+(a&=2));
     System.out.println("a|=2\t"+(a|=2));
     System.out.println("a^=2\t"+(a^=2));
     System.out.println("a<<=2\t"+(a<<=2));
     System.out.println("a>>=2\t"+(a>>=2));
     System.out.println("a>>>=2\t"+(a>>>=2));
  }
}