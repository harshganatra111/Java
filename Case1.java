	//casechange

import java.io.*;

class CaseChange
{
   String str;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    CaseChange() throws IOException
    {
    
    
    System.out.print("Enter String : ");
    str=br.readLine();
    }
    char[] up()
    {
       char arr[]=str.toCharArray();
       for(int i=0;i<str.length();i++)
        {
           if(arr[i]>=97 && arr[i]<=122)
	    {
                arr[i]-=32;
               
 	    }
        }
       return arr;
    }
   char[] low()
    {
     char arr[]=str.toCharArray();
     for(int i=0;i<str.length();i++)
       {
        if(arr[i]>=65 && arr[i]<=90)
	    {
                arr[i]+=32;
 	    }
         }
       return arr;
    }
    char[] toggle()
     {
     char arr[]=str.toCharArray();
      for(int i=0;i<str.length();i++)
       {  
        if(arr[i]>=65 && arr[i]<=90)
	    {
                arr[i]+=32;
 	    }
        else if(arr[i]>=97 && arr[i]<=122) 
           {   
             arr[i]-=32;
           }
        }
     return arr;
     }
       
}
class Case1
{  
  public static void main(String[] args) throws IOException 
 {
  CaseChange obj=new CaseChange();
  BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
  while(true)
  {
  System.out.println("Case Change");
  System.out.println("-----------");
  System.out.println("1. Lower Case to Upper Case");
  System.out.println("2. Upper Case to Lower Case");
  System.out.println("3. Toogle Case");
  System.out.println("0. Exit");
  int a=Integer.parseInt(br1.readLine());

     switch(a)
     {
	
	case 1:
		String s=new String(obj.up());
		System.out.println("Upper Case : "+s);
		
		break;
	case 2:
		
		 s=new String(obj.low());
		System.out.println("Lower Case : "+s);
		break;
	case 3:
		
		 s=new String(obj.toggle());
		System.out.println("Toggle Case : "+s);
		break;
        case 0:
		System.exit(0);
	
	default:
		System.out.println("Invalid Input....!!!!!!");
		break;
   }
  }
 }
}
