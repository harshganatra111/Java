//compareTo
class CompareTo1
{
   public static void main(String args[]) 
   {
       String str1 = "java";
       String str2 = "programming";
       String str3 = "java";

       int var1 = str1.compareTo( str2 );
       System.out.println("str1 & str2 comparison: "+var1);

       int var2 = str1.compareTo( str3 );
       System.out.println("str1 & str3 comparison: "+var2);

       int var3 = str2.compareTo("programming");
       System.out.println("str2 & string argument comparison: "+var3);
   }
}