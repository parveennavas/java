
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Light extends JFrame implements ActionListener
{
  JRadioButton b1,b2,b3;
  ButtonGroup bg;
   JLabel l1; JButton jButton;
    JTextField t1;
    Light()
    {
     JFrame f=new JFrame("TRAFFIC LIGHT");
     f.setLayout(new FlowLayout());
      b1=new JRadioButton("RED");
      b2=new JRadioButton("YELLOW");
      b3=new JRadioButton("GREEN");
      bg=new ButtonGroup();
      jButton = new JButton("Click");
      bg.add(b1);
      bg.add(b2);
      bg.add(b3);
      jButton.addActionListener(this);
     t1=new JTextField();
     f.add(b1);
     f.add(b2);
     f.add(b3);
     f.add(jButton);
     f.add(t1);
      
     f.setVisible(true);
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
    }
    public void actionPerformed(ActionEvent e)
       {
         
         
        if (b1.isSelected()||b2.isSelected()||b3.isSelected()) {
  
           t1.setText("ON");
        }

        else  {

            t1.setText("OFF");
        }
        
   
    }
}
class Traffic
{
   public static void main(String args[])
   {
     new Light();
   }
 }   
