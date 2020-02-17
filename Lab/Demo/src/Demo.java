import java.text.*;

public class Demo {

   static public void main(String[] args) {
      int value = 12;
      String pattern="000";
      DecimalFormat myFormatter = new DecimalFormat(pattern);
      String output = myFormatter.format(value);
      System.out.println(output); // 0123
   }
}