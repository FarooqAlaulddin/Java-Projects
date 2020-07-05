  import javax.swing.*;
   import java.awt.*;
       
    class Arrow extends JPanel{
      
       public Arrow(Color backColor)
      {
         setBackground(backColor);
         
      }
      
      public void paintComponent(Graphics g)
      {
          
         super.paintComponent(g);   
        
         g.setColor(Color.red);
         g.drawLine(40, 40, 70, 40);
         g.drawLine(44, 44, 40, 40);
         g.drawLine(44, 36, 40, 40);
         g.drawLine(66, 44, 70, 40);
         g.drawLine(66, 36, 70, 40);
        
         g.setColor(Color.green);
         g.drawLine(40, 70, 70, 70);
         g.drawLine(36, 74, 40, 70);
         g.drawLine(36, 66, 40, 70);
         g.drawLine(74, 74, 70, 70);
         g.drawLine(74, 66, 70, 70);
         
      }
    } 
    class Circle extends JPanel{
    
         public Circle(){ 
          setBackground(Color.white);
          
      }
      
      public void paintComponent(Graphics g)
      {
          
         super.paintComponent(g);   
         
         g.setColor(Color.black);
         g.fillRect(0,0,100,200);
         
         g.setColor(Color.gray);
         g.fillRect(100,0,100,200);
         
         g.setColor(Color.red);
         g.fillOval(20,50,60,70);
         
         g.setColor(Color.red);
         g.fillOval(120,50,60,70);
      }
    }
    
      public class driver{
       public static void main(String [] args)
      {
         JFrame GUI1 = new JFrame();
         GUI1.setSize(200, 200);
         GUI1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Arrow Arrow = new Arrow(Color.black);
         Container con = GUI1.getContentPane();
         con.add(Arrow);
         GUI1.setVisible(true);
         
         JFrame GUI2 = new JFrame();
         GUI2.setSize(210, 200);
         GUI2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Circle Circle = new Circle();
         Container con2 = GUI2.getContentPane();
         con2.add(Circle);
         GUI2.setVisible(true);
         

      }
   }