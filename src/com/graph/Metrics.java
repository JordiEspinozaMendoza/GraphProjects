package com.graph;
import java.awt.*;
import javax.swing.*;

public class Metrics extends JFrame{
//    set windows title bar String and dimensions
    public Metrics(){
        super("Metrics");
        setSize(800,400);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public void paint(Graphics g){
        super.paint(g);
//        We set the new font
        Font font = new Font("SansSerif", Font.BOLD,12);
        g.setFont(font);
//        We get the metrics for the actual font
        FontMetrics metrics =g.getFontMetrics(font);
//        print font metrics
        printProps(metrics, 50, g);

        //We set the new font
        font = new Font("Serif", Font.ITALIC,14);
        g.setFont(font);
//        We get the metrics for the actual font
         metrics =g.getFontMetrics(font);
//        print font metrics
        printProps(metrics, 170, g);

    }
    public void printProps(FontMetrics fontMetrics, int y, Graphics g){
        g.drawString("Current font :"+fontMetrics.getFont(),20,y);
        g.drawString("Ascent: "+fontMetrics.getAscent(), 20,y+20);
        g.drawString("Descent: "+fontMetrics.getDescent(), 20,y+40);
        g.drawString("Height: "+fontMetrics.getHeight(),20, y+60);
        g.drawString("Leading: "+fontMetrics.getLeading(), 20,y+80);
    }
    public static void main(String[] args) {
        Metrics app = new Metrics();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
