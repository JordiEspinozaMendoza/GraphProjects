package com.graph;
//Using fonts
import java.awt.*;
import javax.swing.*;

public class Fonts extends JFrame{
//    set windows title bar and dimensions
    public Fonts(){
        super("Using fonts");
        setSize(420,125);
        setVisible(true);
    }
//    display strings in different fonts and colors
    public void paint(Graphics g){
//        Call superclass's paint method
        super.paint(g);
//        set font to Serif (Times), bold, 12px and draw a string
        g.setFont(new Font("Serif", Font.BOLD,12));
        g.drawString("Serif 12 point bold", 20,50);
//        set font Monospaced (Courier), italic, 24pt and draw a string
        g.setFont(new Font("Monospaced", Font.ITALIC, 24));
        g.drawString("Monospaced 24 point italic", 20,70);
//        set font to SansSerif (Helvectica), plain, 14pt and draw a string
        g.setFont(new Font("SansSerif", Font.PLAIN, 14));
        g.drawString("SansSerif 14 point plain", 20,90);
//        set font to serif(Times), bold/italic, 18pt and draw a string
        g.setColor(Color.RED);
        g.setFont(new Font("Serif", Font.BOLD+Font.ITALIC, 16));
        g.drawString(g.getFont().getName()+" "+g.getFont().getSize()+" point bold italic", 20,110);
    } //end method paint
//    execute application
    public static void main(String args[]){
        Fonts app = new Fonts();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
