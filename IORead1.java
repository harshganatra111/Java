//user input using InputStreamReader and BufferedReader class

import java.io.*;

class IORead1
{
  public static void main(String[] args) throws IOException //throws the IOException(InputOutputException)
  {
    //establishes a bridge between java program and standard input device i.e- keyboard
    InputStreamReader isr=new InputStreamReader(System.in);

    //receives and stores the input data stream for further use
    BufferedReader br=new BufferedReader(isr);

    System.out.print("Enter your name : ");
    int a=(char)br.read();
    System.out.println((char)a+"\t"+a); //read() reads a single character at a time in the form of integer i.e- ASCII value of the character
    a=(char)br.read();
    System.out.println((char)a+"\t"+a);
    a=(char)br.read();
    System.out.println((char)a+"\t"+a);
    a=(char)br.read();
    System.out.println((char)a+"\t"+a);
    a=(char)br.read();
    System.out.println((char)a+"\t"+a);
  }
}