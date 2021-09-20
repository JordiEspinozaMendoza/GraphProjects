package com.graph;
import java.awt.*;
import javax.swing.*;
public class DrawPolygons extends JFrame {
    public DrawPolygons(){
        super("Drawing Polygons");
        setSize(275,230);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    // draw polygons and polylines
    public void paint(Graphics g){
        super.paint(g); //call superclass paint method
        int xValues[] = {20,40,50,30,20,15};
        int yValues[] = {50,50,60,80,80,60};
        Polygon polygon1 = new Polygon(xValues,yValues,6);
        g.drawPolygon(polygon1);

        int xValues2[] = {70,90,100,80,70,65,60};
        int yValues2[] = {100,100,110,110,130,110,90};
        g.drawPolyline(xValues2,yValues2,7);

        int xValues3[] = {120,140,150,190};
        int yValues3[] = {40,70,80,60};

        g.fillPolygon(xValues3, yValues3,4);

        Polygon polygon2 =  new Polygon();
        polygon2.addPoint(165,135);
        polygon2.addPoint(175,150);
        polygon2.addPoint(270,200);
        polygon2.addPoint(200,220);
        polygon2.addPoint(130,180);

        g.fillPolygon(polygon2);
    }//end method paint
    //run app
    public static void main(String args[]){
        DrawPolygons app =  new DrawPolygons();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}// end class DrawPolygons
