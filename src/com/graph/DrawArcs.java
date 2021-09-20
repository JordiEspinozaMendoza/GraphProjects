package com.graph;
import java.awt.*;
import javax.swing.*;
public class DrawArcs extends JFrame{
//    set window's title bar String and dimensions
    public DrawArcs(){ //Constructor
       super("Drawing Arcs");
        setSize(300, 170);
        setVisible(true);
        setLocationRelativeTo(null);
    }
//    Draw rectangles and arcs
    public void paint(Graphics g){
        super.paint(g);//Call superclass's paint method
//        start at 0 and sweep 360 degrees
        g.setColor(Color.YELLOW);
        g.drawRect(15,35,80,80);
        g.setColor(Color.BLACK);
        g.drawArc(15,35,80,80,0,360);
//        start at 0 and sweep 110 degrees
        g.setColor(Color.YELLOW);
        g.drawRect(100,35,80,80);
        g.setColor(Color.BLACK);
        g.drawArc(100,35,80,80,0,110);
//        start at 0 and sweep -270 degrees
        g.setColor(Color.YELLOW);
        g.drawRect(185,35,80,80);
        g.setColor(Color.BLACK);
        g.drawArc(185,35,80,80,0,-270);
//        start at 0 and sweep 360 degrees
        g.fillArc(15,120,80,40,0,360);
//        start at 270 an sweep -90 degrees
        g.fillArc(100,120,80,40,270,-90);
//        start at 0 and sweep -270 degrees
        g.fillArc(185,120,80,40,0,-270);

    } //end method paint
    public static void main(String args[]){
        DrawArcs app = new DrawArcs();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
