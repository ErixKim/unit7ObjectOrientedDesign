import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
/**
 * Square is a subclass of Shape and creates a square by calling on its superclass' constructor
 * and using Rectangle2D.
 * 
 * @author Eric Kim
 * @version 3/4/2016
 */
public class Square extends Shape
{
    //Declares instance variable center to type Point2D.Double
    private Point2D.Double center;
    //Declares instance variable radius to type Double
    private Double radius;
    //Declares instance variable color to type Color
    private Color color;
    //Declares instance variable square to type Rectangle2D
    private Rectangle2D square;
    /**
     * Constructor for objects of class Square
     */
    public Square(Point2D.Double center, double radius, Color color)
    {
        //Calls the superclass constructor
        super(center, radius, color);
        //Sets the instance variables to the respective parameter variables
        this.center = center;
        this.radius = radius;
        this.color = color;
        //Initializes the square instance variable to a new Rectangle2D
        square = new Rectangle2D.Double(center.getX() - radius, center.getY() - radius, radius *2, radius * 2);
    }

    /**
     * isInside returns true if the points is within the shape and false if its not
     * 
     * @param  point   a point
     * @return     true/false
     */
    public boolean isInside(Point2D.Double point)
    {
        square = new Rectangle2D.Double(this.getCenter().getX() - this.getRadius(), this.getCenter().getY() - this.getRadius(), 2*this.getRadius(), 2*this.getRadius());
        return square.contains(point.getX(), point.getY());
    }

    /**
     * The draw method draws the shape and fills it depending on if filled is true or not
     * 
     * @param  g2 and filled
     */
    public void draw(Graphics2D g2, boolean filled)
    {
        square = new Rectangle2D.Double(this.getCenter().getX() - this.getRadius(), this.getCenter().getY() - this.getRadius(), 2*this.getRadius(), 2*this.getRadius());
        //Draws the square
        g2.setColor(this.getColor());
        if (filled == true)
        {
            g2.fill(square);
        }
        g2.draw(square);
    }
}