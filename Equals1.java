//equals()
 class Equals1
{

   public static void main(String args[]) {
      String Str1 = new String("Java Programming");
      String Str2 = Str1;
      String Str3 = new String("Java Programming");
      boolean retVal;

      retVal = Str1.equals( Str2 );
      System.out.println("Returned Value = " + retVal );

      retVal = Str1.equals( Str3 );
      System.out.println("Returned Value = " + retVal );
   }
}