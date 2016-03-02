import javax.swing.*;
import java.awt.Color;
<<<<<<< HEAD
import java.awt.Dimension;
import java.awt.Graphics;
/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    public DrawingPanel()
    {
        this.setBackground(Color.WHITE);
=======
import java.util.ArrayList;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.util.Random;
public class DrawingPanel extends JPanel
{
    //     private ArrayList<Shape> shapeList = new ArrayList<Shape>();
    public DrawingPanel()
    {
        //         MouseListener listener = new MousePressListener();
>>>>>>> origin/master
    }

    public Color getColor()
    {
        return Color.WHITE;
    }

    public Dimension getPreferredSize()
    {
<<<<<<< HEAD
        Dimension asdf = new Dimension();
        return asdf;
=======
        Dimension dimension = new Dimension();
        return dimension;
>>>>>>> origin/master
    }

    public void pickColor()
    {

    }

    public void addCircle()
    {

    }

    public void addSquare()
    {

    }
<<<<<<< HEAD
    public void paintComponent(Graphics g)      
    {
        
    }

//     class ClickListener implements MouseListener
//     {
//         public void mouseClicked(MouseEvent event) 
//         {
//             int x = event.getX();
//             int y = event.getY();
//             this.drawDot(x,y);
//         }
//     }
}



=======

    public void paintComponent(Graphics g)
    {

    }
//     public class MyMouseListener implements MouseListener
//     {
//         public void mousePressed(MouseEvent event)
//         {
//             int x = event.getX();
//             int y = event.getY();
//         }
// 
//         public void mouseReleased(MouseEvent event)
//         {
// 
//         }
// 
//         public void mouseClicked(MouseEvent event) 
//         {
// 
//         }
// 
//         public void mouseEntered(MouseEvent event) 
//         {
// 
//         }
// 
//         public void mouseExited(MouseEvent event)
//         {
// 
//         }
//     }
}
>>>>>>> origin/master
