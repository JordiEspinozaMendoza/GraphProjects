package com.graph;
import java.awt.*;
import javax.swing.*;
class LinesRectsOvalsContainer extends JPanel{
//    display various lines, rectangles and ovals
    public void paint(Graphics g){
        super.paint(g); //Call superclass's paint method
        //Set red color and draw a line
        g.setColor(Color.RED);
        g.drawLine(5,30,350,30);
        // set color blue
        g.setColor(Color.BLUE);
        g.drawRect(5,40,90,55);
        g.fillRect(100,40,90,55);
        //cyan color
        g.setColor(Color.CYAN);
        g.fillRoundRect(195,40,90,55,50,50);
        g.drawRoundRect(290,40,90,55,50,50);
        //yellow
        g.setColor(Color.YELLOW);
        g.draw3DRect(5,100,90,55,true);
        g.fill3DRect(100,100,90,55,false);
        //Magenta
        g.setColor(Color.MAGENTA);
        g.drawOval(195,100,90,55);
        g.fillOval(290,100,90,55);
    }//end method paint
}
public class LinesRectsOvals extends JFrame{
    //    set window's title bar String and dimensions
    public LinesRectsOvals(){
        super("Drawing lines, rectangles and ovals");
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
        add(new LinesRectsOvalsContainer());
    }
    //execute application
    public static void main(String[] args) {
        LinesRectsOvals app = new LinesRectsOvals();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
