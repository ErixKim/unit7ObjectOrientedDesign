import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
import java.awt.event.MouseMotionListener;
public class DrawingPanel extends JPanel
{
    private ArrayList<Shape> shapeList = new ArrayList<Shape>();
    private Color activeColor;
    public DrawingPanel()
    {
        this.setBackground(Color.WHITE);
        activeColor = Color.BLUE;
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
        //         Circle circle = new Circle(new Point2D.Double(100,100),100,this.activeColor);
        //         Shape.addcircle;
    }

    public void addSquare()
    {
        //         Circle square = new Circle(new Point2D.Double(100,100),100,this.activeColor);
        //         Shape.add(square);
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g);
        for(Shape shapeList: this.shapeList)
        {
            shapeList.draw(g2,true);
        }
        repaint();
    }
    public class MyMouseListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
        }

        public void mouseReleased(MouseEvent event)
        {

        }

        public void mouseClicked(MouseEvent event) 
        {

        }

        public void mouseEntered(MouseEvent event) 
        {

        }

        public void mouseExited(MouseEvent event)
        {

        }
    }
    
    public class MyMouseMotionListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent event)
        {
            
        }
        
        public void mouseMoved(MouseEvent event)
        {
            
        }
    }
}
