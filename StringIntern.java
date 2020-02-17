//string intern()
class StringIntern
{
  public static void main(String[] args)
   {
     String s="Hello Java";
     String s2=s.intern();
     System.out.println(s2);
   }
}