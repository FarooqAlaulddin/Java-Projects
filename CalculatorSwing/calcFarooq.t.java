
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
 
public class Calculator extends JPanel implements ActionListener {
  private JFrame frame = new JFrame("Calculator");
  private JLabel Error=new JLabel();
  private Panel p1 =new Panel();
  private Panel p2 =new Panel();  
  private JTextField display = new JTextField(20);
  private double result = 0;
  private String operator = "=";
  private boolean calculating = true;
  static  JButton bclr=new JButton("Clear");
 
  public Calculator() {
    //setTitle(obj);
    frame.setLayout(new BorderLayout());
    p1.setLayout(new GridLayout(4,4));
    p2.setLayout(new FlowLayout());
    frame.setVisible(true);
    frame.setSize(600,400);
    frame.add(p1,BorderLayout.CENTER);
    frame.add(p2,BorderLayout.SOUTH);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    //display.setEditable(false);
    //add(display, "North");
    String buttonLabels = "789+456-123*0.=/";
    for (int i = 0; i < buttonLabels.length(); i++) {
      JButton b = new JButton(buttonLabels.substring(i, i + 1));
      p1.add(b);
      b.addActionListener(this);
    }
    p2.add(display);
    p2.add(bclr);
    p2.add(Error);
    bclr.addActionListener(this);
    
  }
 
  public void actionPerformed(ActionEvent evt) {
    String cmd = evt.getActionCommand();
    if(evt.getSource()!=bclr){
        if ('0' <= cmd.charAt(0) && cmd.charAt(0) <= '9' || cmd.equals(".")) {
                if (calculating)
                display.setText(cmd);
        else
                display.setText(display.getText() + cmd);
                calculating = false;
                Error.setText("");
        }else {
                if (calculating) {
                operator = cmd;
                Error.setText("Cannot Choose another operator again");
                }else {
                    double x = Double.parseDouble(display.getText());
                    calculate(x);
                    operator = cmd;
                    calculating = true;
                }     
        }
    }else{
         display.setText(null);
         operator=null;
         result = 0;
       }
    
    
  }
 
  private void calculate(double n) {
    if (operator.equals("+"))
      result += n;
    else if (operator.equals("-"))
      result -= n;
    else if (operator.equals("*"))
      result *= n;
    else if (operator.equals("/"))
      result /= n;
    else if (operator.equals("="))
      result = n;
    display.setText("" + result);
  }
 
    
  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(false);
    Calculator calc=new Calculator();
    
  }
}

