import java.io.*;

class Cal1
{
  public static void main(String[] args) throws IOException
  {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     double d1,d2;
     int a,b,c;

     System.out.print("a=");
     a=Integer.parseInt(br.readLine());
     System.out.print("b=");
     b=Integer.parseInt(br.readLine());
     System.out.print("c=");
     c=Integer.parseInt(br.readLine());

     System.out.print("d1=");
     d1=Double.parseDouble(br.readLine());
     System.out.print("d2=");
     d2=Double.parseDouble(br.readLine());
     
     Sum s1=new Sum();
     s1=new Sum(a,b);
     s1=new Sum(a,b,c);
     s1=new Sum(d1,d2);
  }
}