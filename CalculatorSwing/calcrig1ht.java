import java.util.Random;
import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.*;

public class example 
{   
    
    public static void main (String[] args)
    {   
        JFrame frame = new JFrame("WELCOME TO THE PROGRAM");
        frame.setVisible(true);
        frame.setSize(500,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button = new JButton("Generate");
        panel.add(button);
        button.addActionListener (new Action1());

        JButton button2 = new JButton("Queue");
        panel.add(button2);
        button2.addActionListener (new Action2()); 
        JButton button3 = new JButton("List");
        panel.add(button3);
        //button3.addActionListener (new Action3());
        JButton button4 = new JButton("vector");
        panel.add(button4);
        //button4.addActionListener (new Action4());
        JButton button5 = new JButton("map");
        panel.add(button5);
        //button5.addActionListener (new Action5());
    }

    static class Action1 implements ActionListener 
    {   
        //int[] Random=new int[5];
        List <Integer> list1=new ArrayList<Integer> ();
        Stack <Integer> stack1=new Stack<Integer> ();
        static int count;
        public void actionPerformed (ActionEvent e) 
        {   
            JTextField display = new JTextField(10);
            JFrame frame2 = new JFrame("Clicked");
            frame2.setVisible(true);
            frame2.setSize(200,200);
            JLabel label = new JLabel("Your stack is: ");
            JPanel panel = new JPanel();
            
            frame2.add(panel);
            panel.add(label);
            panel.add(display);
            for(int i=0; i < 5 ; i++){    
            list1.add((int)(Math.random()*100));
            }
            
            for(Integer i: list1)    
                stack1.push(i);

            for(Integer i: stack1){
               System.out.print(i+"\n");
               display.setText(Integer.toString(i));
            } 
            
        }
    }   

    static class Action2 implements ActionListener 
    {        
        public void actionPerformed (ActionEvent e) 
        {     
            JFrame frame3 = new JFrame("OKNO 3");
            frame3.setVisible(true);
            frame3.setSize(200,200);

            JLabel label = new JLabel("HELLO");
            JPanel panel = new JPanel();
            frame3.add(panel);
            panel.add(label);
        }
    }   
}