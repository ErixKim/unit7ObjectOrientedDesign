import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
/**
 * Drawing Panel class is a subclass of JPanel and its main purpose is to draw the shapes and change the
 * color
 * 
 * @author Eric Kim
 * @version 3/4/2016
 */
public class DrawingPanel extends JPanel
{
    //shapeList instance variable in order to keep track of the shapes made
    private ArrayList<Shape> shapeList;
    //currentColor instance variable in order to keep track of the currentColor the user chooses
    private Color currentColor;
    private Shape activeShape;
    private Random random;
    private Dimension dimension;
    /**
     * Constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        //Adds a new arrayList of shapes to shapeList
        this.shapeList = new ArrayList<Shape>();
        //Sets MyMouseListener and MyMouseMotionListener to this DrawingPanel obect
        this.addMouseListener(new MyMouseListener());
        this.addMouseMotionListener(new MyMouseMotionListener());
        //Sets the background color to white
        this.setBackground(Color.WHITE);
        random = new Random();
        currentColor = Color.BLUE;
        dimension = new Dimension(600,600);
    }

    /**
     * getColor() accessor method that gets the current color
     * 
     * @return     the current color
     */
    public Color getColor()
    {
        //Returns the currentColor the user chooses
        return currentColor; 
    }

    /**
     * getPreferredSize() overrides JComponent's getPreferredSize method to return a preferred size
     * canvas
     * 
     * @return     a new dimension size of 600x600
     */
    public Dimension getPreferredSize()
    {
        return new Dimension(600,600);
    }

    /**
     * pickColor() is called from the ControlPanel when the Pick Color button is clicked and it opens
     * a JColorChooser for the user to change the color
     * 
     */
    public void pickColor()
    {
        //Opens a JColorChooser and allows the user to change the color
        currentColor = JColorChooser.showDialog(null, "Choose a Color", Color.WHITE);
    }

    /**
     * addCircle() is called from the ControlPanel when the Add Circle button is clicked and it adds
     * a circle to shapeList
     * 
     */
    public void addCircle()
    {
        //Creates a new circle object
        Circle circle = new Circle(new Point2D.Double(300,300),random.nextInt(75),this.currentColor);
        //Adds the circle object to shapeList in the 0 index
        shapeList.add(0,circle);
    }

    /**
     * addSquare() is called from the ControlPanel when the Add Square button is clicked and it adds
     * a square to shapeList
     * 
     */
    public void addSquare()
    {
        //Creates a new square object
        Square square = new Square(new Point2D.Double(300,300),random.nextInt(75),this.currentColor);
        //Adds the square object to shapeList in the 0 index
        shapeList.add(0,square);
    }

    /**
     * paintComponent is where all the drawing of the shapes in shapeList occurs
     * 
     * @param  Graphics g
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g);
        for(Shape shapes: shapeList)
        {
            //A check for an active shape
            shapes.draw(g2, activeShape == null? true: (!(activeShape == shapes)));
        }
        repaint();
    }

    /**
     * MyMouseListener class implements MouseListener and its main purpose is to keep track of when
     * the mouse is pressed by using events
     * 
     * @author Eric Kim
     * @version 3/4/2016
     */
    public class MyMouseListener implements MouseListener
    {
        private boolean isFound;
        /**
         * mousePressed gets called when the user presses the mouse on the frame
         * 
         * @param  MouseEvent event 
         */
        public void mousePressed(MouseEvent event)
        {
            isFound = false;
            //Obtaining the x and y coordinates
            int x = event.getX();
            int y = event.getY();
            // Checks to see if there is a shape at the mouse click location
            for (Shape shapes: shapeList)
            {
                if (shapes.isInside(new Point2D.Double(x,y)))
                {
                    isFound = true;
                    activeShape = shapes;
                }
            }
            if (!isFound)
            {
                activeShape = null;
            }
            repaint();
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
    /**
     * MyMouseMotionListener class implements the MouseMotionListener and its main purpose is to keep 
     * track of when the mouse is dragged by using events
     * 
     * @author Eric Kim
     * @version 3/4/2016
     */
    public class MyMouseMotionListener implements MouseMotionListener
    {
        /**
         * mouseDragged keeps track of the mouse's movement
         * 
         * @param  MouseEvent event
         */
        public void mouseDragged(MouseEvent event)
        {
            if (activeShape != null)
            {
                activeShape.move(event.getX(),event.getY());
                repaint();
            }
        }

        public void mouseMoved(MouseEvent event)
        {

        }
    }
}
