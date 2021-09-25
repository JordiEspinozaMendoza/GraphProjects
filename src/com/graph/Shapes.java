package com.graph;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import javax.swing.*;

class ShapesContainer extends JPanel {
    //draw shapes with java2d api
    public void paint(Graphics g) {
        super.paint(g); // call superclasses paint method
        Graphics2D g2d = (Graphics2D) g; // cast to Graphics2d
        //draw 2d eclipse filled with a blue-yellow gradient
        g2d.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100, Color.YELLOW, true));
        g2d.fill(new Ellipse2D.Double(5, 30, 65, 100));

        //draw 2d rectangle in red
        g2d.setPaint(Color.RED);
        g2d.setStroke(new BasicStroke(10.0f));
        g2d.draw(new Rectangle2D.Double(80, 30, 65, 100));
        //draw 2d rounded rectangle with a buffered background
        BufferedImage buffImage = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);

        Graphics2D gg = buffImage.createGraphics();
        gg.setColor(Color.YELLOW);//draw in yellow
        gg.fillRect(0, 0, 10, 10);// draw a filled rectangle
        gg.setColor(Color.BLACK); //draw in black
        gg.drawRect(1, 1, 6, 6);
        gg.setColor(Color.BLUE);// draw in blue
        gg.fillRect(1, 1, 3, 3);//draw a filled rectangle
        gg.setColor(Color.RED); // Draw in red
        gg.fillRect(4, 4, 3, 3);//draw a filled rectangle

        //paint buffimage onto the JFrame
        g2d.setPaint(new TexturePaint(buffImage, new Rectangle(10, 10)));
        g2d.fill(new RoundRectangle2D.Double(155, 30, 75, 100, 50, 50));
        //draw 2d pie-shaped arc in white
        g2d.setPaint(Color.WHITE);
        g2d.setStroke(new BasicStroke(6.0f));
        g2d.draw(new Arc2D.Double(240, 30, 75, 100, 0, 270, Arc2D.PIE));

        //draw 2d lines in green and yellow
        g2d.setPaint(Color.GREEN);
        g2d.draw(new Line2D.Double(395, 30, 320, 150));

        float dashes[] = {10};

        g2d.setPaint(Color.YELLOW);
        g2d.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, dashes, 0));
        g2d.draw(new Line2D.Double(320, 30, 395, 150));
    }//end method paint
}
public class Shapes extends JFrame {
    //    set window's title bar string and dimensions
    public Shapes() {
        super("Drawing 2D shapes");
        setSize(425, 260);
        setVisible(true);
        setLocationRelativeTo(null);
        add(new ShapesContainer());
    }

    public static void main(String args[]) {
        Shapes app = new Shapes();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

