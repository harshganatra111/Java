import java.awt.*;
import javax.swing.*;


public class Component {
public static void main(String [] args){
JFrame f=new JFrame("HELLO");
JButton b=new JButton();  
    b.setBounds(50,100,95,30); 
    b.setText("HEY");
    b.setBackground(Color.blue);
    b.setForeground(Color.black);
    //b.setIcon(new ImageIcon("C:\\Users\\MAHESH\\Downloads\\Nature.jpg"));// setting images
    b.setEnabled(true);
    
    f.add(b);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}

}
