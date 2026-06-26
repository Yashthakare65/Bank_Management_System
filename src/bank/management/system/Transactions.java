
package bank.management.system;

import javax.swing.*;
import java.awt.*;


public class Transactions extends JFrame {
    
    Transactions(){
        
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        
        JLabel text=new JLabel("Please select your Transaction");
        text.setBounds(220,200,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        
        setSize(900,900);
        setLocation(300,0);
        //setUndecorated(true);
        setVisible(true);
        
    }
    
    public static void main(String args[]){
        new Transactions();
    }
}


