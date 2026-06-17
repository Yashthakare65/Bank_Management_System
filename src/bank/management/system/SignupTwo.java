package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField aadhar,pan;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,income,occupation,education;
    String formno;
  SignupTwo(String formno){
      this.formno=formno;
    setLayout(null);

      setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

    JLabel additionalDetails=new JLabel("Page 2: Additional Details");
    additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
    additionalDetails.setBounds(290,80,400,30);
    add(additionalDetails);

    JLabel Religion=new JLabel("Religion:");
    Religion.setFont(new Font("Raleway",Font.BOLD,22));
    Religion.setBounds(100,140,100,30);
    add(Religion);
    
    String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
     religion=new JComboBox(valReligion);
    religion.setBounds(300,140,400,30);
    religion.setBackground(Color.WHITE);
    add(religion);
    
    JLabel Category=new JLabel("Category:");
    Category.setFont(new Font("Raleway",Font.BOLD,22));
    Category.setBounds(100,190,200,30);
    add(Category);
    
    String valcategory[]={"General","OBC","SC","ST","Other"};
     category= new JComboBox(valcategory);
    category.setBounds(300,190,400,30);
    category.setBackground(Color.WHITE);
    add(category);

    JLabel Income=new JLabel("Income:");
    Income.setFont(new Font("Raleway",Font.BOLD,22));
    Income.setBounds(100,240,200,30);
    add(Income);
    
    String incomecategory[]={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
     income= new JComboBox(incomecategory);
    income.setBounds(300,240,400,30);
    income.setBackground(Color.WHITE);
    add(income);


    JLabel Educational=new JLabel("Educational");
    Educational.setFont(new Font("Raleway",Font.BOLD,22));
    Educational.setBounds(100,290,200,30);
    add(Educational);
    
    JLabel Qualification=new JLabel("Qualification:");
    Qualification.setFont(new Font("Raleway",Font.BOLD,22));
    Qualification.setBounds(100,315,200,30);
    add(Qualification);
    
    String educationValues[]={"Non-Graduation","Graduate","Post-Graduation","Doctrate","Others"};
     education= new JComboBox(educationValues);
    education.setBounds(300,315,400,30);
    education.setBackground(Color.WHITE);
    add(education);

    JLabel Occupation=new JLabel("Occupation:");
    Occupation.setFont(new Font("Raleway",Font.BOLD,22));
    Occupation.setBounds(100,390,200,30);
    add(Occupation);
    
    String occupationValues[]={"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
     occupation= new JComboBox(occupationValues);
    occupation.setBounds(300,390,400,30);
    occupation.setBackground(Color.WHITE);
    add(occupation);
    

    JLabel Pan=new JLabel("PAN Number:");
    Pan.setFont(new Font("Raleway",Font.BOLD,22));
    Pan.setBounds(100,440,200,30);
    add(Pan);

     pan=new JTextField();
    pan.setFont(new Font("Raleway",Font.BOLD,14));
    pan.setBounds(300,440,400,30);
    add(pan);

    JLabel Aadhar=new JLabel("Aadhar Number:");
    Aadhar.setFont(new Font("Raleway",Font.BOLD,22));
    Aadhar.setBounds(100,490,200,30);
    add(Aadhar);

     aadhar=new JTextField();
    aadhar.setFont(new Font("Raleway",Font.BOLD,14));
    aadhar.setBounds(300,490,400,30);
    add(aadhar);

    JLabel Seniorcitizen=new JLabel("Senior Citizen:");
    Seniorcitizen.setFont(new Font("Raleway",Font.BOLD,22));
    Seniorcitizen.setBounds(100,540,200,30);
    add(Seniorcitizen);

      syes = new JRadioButton("Yes");
      syes.setBounds(300, 540, 100, 30);
      syes.setBackground(Color.WHITE);
      add(syes);

      sno = new JRadioButton("No");
      sno.setBounds(450, 540, 100, 30);
      sno.setBackground(Color.WHITE);
      add(sno);
      
      ButtonGroup seniorgroup=new ButtonGroup();
      seniorgroup.add(syes);
      seniorgroup.add(sno);

    JLabel Existingaccount=new JLabel("Existing Account:");
    Existingaccount.setFont(new Font("Raleway",Font.BOLD,22));
    Existingaccount.setBounds(100,590,200,30);
    add(Existingaccount);
    
      eyes = new JRadioButton("Yes");
      eyes.setBounds(300, 590, 100, 30);
      eyes.setBackground(Color.WHITE);
      add(eyes);

      eno = new JRadioButton("No");
      eno.setBounds(450, 590, 100, 30);
      eno.setBackground(Color.WHITE);
      add(eno);

      ButtonGroup existinggroup = new ButtonGroup();
      existinggroup.add(eyes);
      existinggroup.add(eno);

    

     next=new JButton("Next");
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setFont(new Font("Raleway",Font.BOLD,14));
    next.setBounds(620,660,80,30);
    next.addActionListener(this);
    add(next);

    getContentPane().setBackground(Color.WHITE);

    setSize(850,800);
    setLocation(350,10);
    setVisible(true);

  }
  
  public void actionPerformed(ActionEvent ae){
        
        String sreligion=(String)religion.getSelectedItem();
        String scategory=(String)category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String seducation=(String)education.getSelectedItem();
        String soccupation=(String)occupation.getSelectedItem();
        String seniorcitizen=null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }else if(sno.isSelected()){
            seniorcitizen="NO";
        }
        
        String existingaccount=null;
        if(eyes.isSelected()){
            existingaccount="Yes";
        }else if(eno.isSelected()){
            existingaccount="No";
        }
        
        String span=pan.getText();
        String saddhar=aadhar.getText();
        
       try {
          Conn c = new Conn();
          String query = "insert into signuptwo values('" + formno + "','" + sreligion + "','" + scategory + "','" + sincome + "','" + seducation + "','" + soccupation + "','" + span + "','" + saddhar + "','" + seniorcitizen + "','" + existingaccount + "')";
          c.s.executeUpdate(query);
          
          //Signup3 Object
      } catch (Exception e) {
          System.out.println(e);
      }
        
  }
  public static void main(String args[]){
    new SignupTwo("");
  }
}

