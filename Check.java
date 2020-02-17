//a character is number, alphabet or special charater.

class Check
{
    public static void main(String[] args)
       {
	  char ch;
	  ch='z';
          if(ch>=48 && ch<=57)
		System.out.println("character is a number");
 	  else if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
		System.out.println("Character is a alphabet");
	  else
		System.out.println("Character is a special character");
       }
}