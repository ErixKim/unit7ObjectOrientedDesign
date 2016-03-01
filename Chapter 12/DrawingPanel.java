import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;
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
    }

    public Color getColor()
    {
        Color background = this.getBackground();
        return background;
    }

    public Dimension getPreferredSize()
    {
        Dimension dimension = new Dimension();
        return dimension;
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
