//foreach loop (only for 1D array)

class ForEach1
{
   public static void main(String[] args)
   {
     int sum=0;
     for(String s:args)
     {
       sum+=Integer.parseInt(s); 
     }
     System.out.println("Sum="+sum); 
   }
}