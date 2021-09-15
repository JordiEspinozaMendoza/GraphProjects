package com.graph;

import javax.swing.*;
import java.awt.*;

import java.awt.*;
import javax.swing.*;
class Panel extends JPanel{
    //    Draw rectangles and Strings in different colors
    public void paint(Graphics g){
//        Call superclass's paint method
//        set new drawing color using integers
        g.setColor(new Color(255,0,0));
        g.fillRect(25,25,100,20);
        g.drawString("Current RGB: " + g.getColor(), 200,40);
//        Set new drawing color using floats
        g.setColor(new Color(0.0f, 1.0f, 0.0f));
        g.fillRect(25,50,100,20);
        g.drawString("Current RGB: " + g.getColor(), 200,65);

//        set new drawinf color using static Color objects
        g.setColor(Color.BLUE);
        g.fillRect(25,75,100,20);
        g.drawString("Current RGB: " + g.getColor(), 200,90);

//        Display individual RGB values
        Color color = Color.MAGENTA;
        g.setColor(color);
        g.fillRect(25,100,100,20);
        g.drawString("RGB values: "+color.getRed()+", "+color.getGreen()+", "+color.getBlue(), 200,115);

    }//end method
}
public class ShowColors extends JFrame {
    public ShowColors(){
        super("Using Colors");
        setSize(600,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new Panel());
    }
    public static void main(String args[]){
        ShowColors app = new ShowColors();
    }
}//end class
