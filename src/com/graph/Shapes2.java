package com.graph;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class Shapes2 extends JFrame{
//    set windows title bar string, background color and dimensions
    public Shapes2(){
        super("Drawing 2D Shapes");
        getContentPane().setBackground(Color.WHITE);
        setSize(400,400);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    //draw general paths
    public void paint(Graphics g){
        super.paint(g); // call superclasses paint method
        int xPoints[] = {55,67,109,73,83,55,27,37,1,43};
        int yPoints[] = {0,36,36,5,4,96,72,96,54,36,36};

        Graphics2D g2d = (Graphics2D) g;
        GeneralPath star = new GeneralPath(); //create general path object
        //set the initial coordinate of the general path
        star.moveTo(xPoints[0],yPoints[0]);
        //create the star-this does not draw the star
        for(int count =1; count<xPoints.length;count++)
            star.lineTo(xPoints[count], yPoints[count]);
        star.closePath(); // close the shape
        g2d.translate(200,200); //translate the origin to (200,200)
        // rotate around origin and draw stars in random colors
        for(int count=1; count<=20; count++){
            g2d.rotate(Math.PI/10.0); //rotate coordinate system
            //set random drawing color
            g2d.setColor(new Color((int)(Math.random()*256), ( int ) ( Math.random() * 256 ), ( int ) ( Math.random() * 256 ) ) );
            g2d.fill(star); //draw filled star
        }
    }
    public static void main(String args[]) {
        Shapes2 app = new Shapes2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
