import javax.swing.*;
import java.awt.event.*;
public class Demo implements ActionListener{
	JTextField tf1,tf2,tf3;
	JButton b1,b2,b3,b4;
	JLabel l1,l2,l3;
	Demo(){
		JFrame f = new JFrame();
		l1 = new JLabel("Num 1");
		l1.setBounds(50,20,100,20);
		tf1 = new JTextField();
		tf1.setBounds(50, 50, 150, 20);
		l2 = new JLabel("Num 2");
		l2.setBounds(50,120,100,20);
		tf2 = new JTextField();
		tf2.setBounds(50, 100, 150, 20);
		l3 = new JLabel("Answer");
		l3.setBounds(50,170,100,20);
		tf3 = new JTextField();
		tf3.setBounds(50, 150, 150, 20);
		b1 = new JButton("+");
		b1.setBounds(50,250,50,50);
		b2 = new JButton("-");
		b2.setBounds(110,250,50,50);
		b3 = new JButton("*");
		b3.setBounds(50,320,50,50);
		b4 = new JButton("/");
		b4.setBounds(110,250,50,50);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.setSize(500,500);
		f.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s1 = tf1.getText();
		String s2 = tf1.getText();
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		int ans = 0;
		if(e.getSource()==b1) {
			ans = n1+n2;
		}
		else if(e.getSource()==b2) {
			ans = n1-n2;
		}
		else if(e.getSource()==b3) {
			ans = n1*n2;
		}
		else if(e.getSource()==b4) {
			ans = n1/n2;
		}
		String res = String.valueOf(ans);
		tf3.setText(res);
	}
	public static void main(String[] args) {
		new Demo();
	}
}