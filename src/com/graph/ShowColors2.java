package com.graph;
//Choosing colors with JColorChooser
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ShowColors2 extends JFrame{
    private JButton changeColorButton;
    private Color color = Color.LIGHT_GRAY;
    private Container container;

//    set up GUI
    public ShowColors2(){
        super("Using JColorChooser");
        container = getContentPane();
        container.setLayout(new FlowLayout());
        //    set up changeColorButton and register its event handler
        changeColorButton = new JButton("Change Color");
        changeColorButton.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent event){
                        color = JColorChooser.showDialog(
                                ShowColors2.this, "Choose a color", color
                        );
//                        set default color, if not color is returned
                        if(color == null)
                            color = Color.LIGHT_GRAY;
//                        change content pane's background color
                        container.setBackground(color);
                    }
                }// end anonymous inner class
        );//end call to addActionListener
        container.add(changeColorButton);
        setSize(400,130);
        setVisible(true);
    }
//    execute app
    public static void main(String args[]){
        ShowColors2 app = new ShowColors2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
