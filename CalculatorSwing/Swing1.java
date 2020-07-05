import java.awt.*;
import javax.swing.*;

class ExceptionGraphics extends JFrame{
    
    static int n;
    public static void main (String[] args){
    getNum();
    display();

    }
    static void getNum(){
    boolean valid=false;
        do{
            try{
                n=Integer.parseInt(JOptionPane.showInputDialog("Enter A number"));
                valid=true;
            }
            catch(NumberFormatException e){
                JOptionPane.showInputDialog(null," Error - type not allowed",JOptionPane.ERROR_MESSAGE);

            }
        }while(!valid);
    
    }
    
    public void paint(Graphics g){
        super.paint(g);
        Font f=new Font ("sanserif", Font.BOLD|Font.ITALIC, 18);
        g.setFont(f);
        g.setColor(Color.red);
        g.drawString("Square root of "+n+"=",100,250);
        g.drawString(String.valueOf(Math.sqrt(n)),270,250);
        
        
    }
    
    static void display(){
        ExceptionGraphics frame= new ExceptionGraphics();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con=frame.getContentPane();
        con.setBackground(Color.blue);
        frame.setSize(500,500);
        frame.setVisible(true);
        
        
    }
    
    
}