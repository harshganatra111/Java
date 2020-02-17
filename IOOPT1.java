// input name and display ASCII value of each character

import java.io.*; 
class IOOPT1
{
   public static void main(String[] args) throws IOException
   {
	char a;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your fullname : ");
	System.out.println("Character\tASCII Value  ");
        while((a=(char)br.read())!='\n')
	System.out.println(a+"\t\t"+(int)a);
   }   
}
