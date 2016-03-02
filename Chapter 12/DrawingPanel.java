import javax.swing.*;
import java.awt.Color;
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
    }
    public Color getColor()
    {
        return Color.WHITE;
    }
    public Dimension getPreferredSize()
    {
        Dimension asdf = new Dimension();
        return asdf;
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



