import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
/**
 * Circle is a subclass of Shape and creates a circle by calling on its superclass' constructor
 * and using Ellipse2D.
 * 
 * @author Eric Kim
 * @version 3/4/2016
 */
public class Circle extends Shape
{
    //Declares instance variable circle to type Ellipse2D
    private Ellipse2D circle;
    //Declares instance variable center to type Point2D.Double
    private Point2D.Double center;
    //Declares instance variable radius to type Double
    private Double radius;
    //Declares instance variable color to type Color
    private Color color;
    /**
     * Constructor for objects of class Circle
     */
    public Circle(Point2D.Double center, double radius, Color color)
    {
        //Calls the superclass constructor
        super(center, radius, color);
        //Sets the instance variables to the respective parameter variables
        this.center = center;
        this.radius = radius;
        this.color = color;
        //Initializes the circle instance variable to a new Ellipse2D
        this.circle = new Ellipse2D.Double(center.getX() - radius, center.getY() - radius, radius * 2, radius * 2);
    }

    /**
     * isInside returns true if the points is within the shape and false if its not
     * 
     * @param  point   a point
     * @return     true/false
     */
    public boolean isInside(Point2D.Double point)
    {
        circle = new Ellipse2D.Double(this.getCenter().getX() - this.getRadius(), this.getCenter().getY() - this.getRadius(), 2*this.getRadius(), 2*this.getRadius());
        return circle.contains(point.getX(),point.getY());
    }

    /**
     * The draw method draws the shape and fills it depending on if filled is true or not
     * 
     * @param  g2 and filled
     */
    public void draw(Graphics2D g2, boolean filled)
    {
        circle = new Ellipse2D.Double(this.getCenter().getX() - this.getRadius(), this.getCenter().getY() - this.getRadius(), 2*this.getRadius(), 2*this.getRadius());
        //Draws the circle
        g2.setColor(this.getColor());
        if (filled == true)
        {
            g2.fill(circle);
        }
        g2.draw(circle);
    }
}
