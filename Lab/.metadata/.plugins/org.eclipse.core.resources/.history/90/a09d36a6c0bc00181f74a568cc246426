import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class encryption extends JPanel implements ActionListener {

    char[]  str={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
    char[] str1={'!','@','#','$','%','^','&','*','(',')','-','=','_','+','`','|','{','}','[',']',';',':',',','<','>','/','z','y','x','w','v','u','t','s','r','q'};
    String k="";
    String l="";
    char[] a=new char[50];
    char[] b=new char[50];
    JLabel pln,enc,dec;
    JTextField tplain,tenc,tdec;
    JButton bencrypt,bdecrypt,bclear,bexit;
    Font f1;

     encryption()
    {
     f1=new Font(Font.SANS_SERIF,Font.BOLD,20);

    pln=new JLabel("Plain Text");
    enc=new JLabel("Encrypted Text");
    dec=new JLabel("Decrypted Text");

    pln.setFont(f1);
    enc.setFont(f1);
    dec.setFont(f1);


    //JTextField

    tplain=new JTextField(20);
    tenc=new JTextField(20);
    tdec=new JTextField(20);
    tenc.setEditable(false);
    tdec.setEditable(false);

    tplain.setFont(f1);
    tenc.setFont(f1);
    tdec.setFont(f1);


    //JButton

    bencrypt=new JButton("Encryption");
    bdecrypt=new JButton("Decryption");
    bclear=new JButton("Clear");
    bexit=new JButton("Exit");

    bdecrypt.setEnabled(false);
        
    bencrypt.setFont(f1);
    bdecrypt.setFont(f1);
    bclear.setFont(f1);
    bexit.setFont(f1);

    setLayout(null);

    add(pln);
    add(tplain);
    add(enc);
    add(tenc);
    add(dec);
    add(tdec);
    add(bencrypt);
    add(bdecrypt);
    add(bclear);
    add(bexit);

    //Setbounds

    pln.setBounds(20, 20, 200,30);
    tplain.setBounds(220,20,200,30);

    enc.setBounds(20,80,200,30);
    tenc.setBounds(220,80,200,30);

    dec.setBounds(20,140, 200,30);
    tdec.setBounds(220,140,200,30);

    bencrypt.setBounds(30,200,160,30);
    bdecrypt.setBounds(240,200,160,30);

    bclear.setBounds(30,240,160,30);
    bexit.setBounds(240,240,160,30);
    
    bencrypt.addActionListener(this);
    bdecrypt.addActionListener(this);
    bclear.addActionListener(this);
    bexit.addActionListener(this);



    }
public void actionPerformed(ActionEvent ae)
    {
    String action=ae.getActionCommand();
   if(action.equals("Encryption"))
    {
         k=tplain.getText().toString().toLowerCase();
        
 
        
        bdecrypt.setEnabled(true);
        bencrypt.setEnabled(false);
       
        a=k.toCharArray();
        for(int i=0;i<k.length();i++)
        {
            for(int j=0;j<36;j++)
            {
             if(a[i]==str[j])
             {
                 a[i]=str1[j];
                 j=36;
             }
            }

        }
        for(int i=0;i<k.length();i++)
        {
          l=l+a[i] ;
        }
        tenc.setText(l);
        l="";

       
    
  }
 else if(action.equals("Decryption"))
    {
  String x=tenc.getText().toString();
  String y="";
 
  b=x.toCharArray();
  
  for(int i=0;i<x.length();i++)
  {
      for(int j=0;j<36;j++)
      {
      if(b[i]==str1[j])
      {
          b[i]=str[j];
          j=36;
      }
      }
  }
  for( int i=0;i<x.length();i++)
  {
      y=y+b[i];
  }
  tdec.setText(y);
  y="";
 
 }
 else if(action.equals("Clear"))
    {
     
     tplain.setText("");
     tenc.setText("");
     tdec.setText("");
     tplain.setFocusable(true);
     bdecrypt.setEnabled(false);
     bencrypt.setEnabled(true);
     
    }
 else if(action.equals("Exit"))
    {
     System.exit(0);
 }
}


    public static void main(String[] args) {
        JFrame n=new JFrame();
        encryption a=new encryption();
        n.add(a);
        n.setSize(440,310);
        n.setVisible(true);
        n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    

}