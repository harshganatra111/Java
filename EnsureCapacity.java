//ensureCapacity()
class EnsureCapacity
{
  public static void main(String[] args)
   {
     StringBuffer str = new StringBuffer("hello");
     str.ensureCapacity(10);
     System.out.println(str);
   }
}