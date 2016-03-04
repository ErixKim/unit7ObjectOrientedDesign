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
import javax.swing.JColorChooser;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
public class DrawingPanel extends JPanel
{
    private ArrayList<Shape> shapeList = new ArrayList<Shape>();
    private Color activeColor;
    public DrawingPanel()
    {
        this.setBackground(Color.WHITE);
        activeColor = Color.BLUE;
        //         MouseListener listener = new MousePressListener();
    }

    public Color getColor()
    {
        return activeColor; 
    }

    public Dimension getPreferredSize()
    {
        Dimension dimension = new Dimension();
        return dimension;
    }

    public void pickColor()
    {
        activeColor = JColorChooser.showDialog(null, "Choose a Color", Color.WHITE);
    }

    public void addCircle()
    {
        Circle circle = new Circle(this.activeColor,new Point2D.Double(100,100),100);
        shape.add(circle);
    }

    public void addSquare()
    {
        Circle square = new Circle(this.activeColor,new Point2D.Double(100,100),100);
        shape.add(square);
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g);
        for(Shape shapes: this.shape)
        {
            shapes.draw(g2,true);
        }
        repaint();
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
    //     
}
