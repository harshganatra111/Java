//decimal tro binary

class DecimailToBinary
{
   public static void main(String[] args)
    {
       int num=Integer.parseInt(args[0]);  
       int n=num;
       int arr[]=new int[8];
       if(num>=0)
       {
         for(int i=0;i<8;++i)
          {
           arr[i]=num%2;
           num=num/2;	
          }
       
          System.out.print("Binary value of "+n+" : ");
          for(int j=7;j>=0;--j)
          {
            System.out.print(arr[j]);
          }
       }
       else
       {
          num=-num;
          for(int i=0;i<8;++i)
          {
            arr[i]=num%2;
            num=num/2;	
          }
          
          System.out.print("Binary value of "+(-n)+" : ");
          int num1[]=new int[8];
          for(int i=0,j=7;i<8;++i,--j)
          {
             num1[j]=arr[i];
             System.out.print(arr[j]);
          }
          System.out.print("\n1's complement of "+(-n)+" : ");
          int num2[]=new int[8];
          for(int i=0;i<8;++i)
          {
             if(num1[i]==1)
             {
               num2[i]=0;
             }
             else
             {
               num2[i]=1; 
             }
             System.out.print(num2[i]);
          }//for loop ends
        
          int temp=1;
          int num3[]=new int[8];
          for(int i=7;i>=0;--i)
          {
            if(num2[i]==1 && temp==1)
            {
              num3[i]=0; 
            }
            else if(num2[i]==1 && temp==0)
            {
              num3[i]=1;
              temp=0;  
            }
            else if(num2[i]==0 && temp==1)    
            {
               num3[i]=1;
               temp=0;
            }
            else
            {
               num3[i]=0;
               temp=0;
            } 
          }

          System.out.print("\n2's complement of "+(-n)+" : ");
          for(int i=0;i<8;++i)
          {
            System.out.print(num3[i]);
          }

          System.out.print("\nBinary value of "+n+" : ");
          for(int i=0;i<8;++i)
          {
            System.out.print(num3[i]);
          }
       }
    }
}