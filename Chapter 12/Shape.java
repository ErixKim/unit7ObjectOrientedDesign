import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
/**
     * Shape is an abstract class that contains abstract methods and instance variables for the
     * subclasses of shape to use
     * 
     * @author Eric Kim
     * @version 3/4/2016
     */
public abstract class Shape
{
    //Instance variable center is declared type Point2D.double
    private Point2D.Double center;
    //Instance variable radius is declared type Double
    private Double radius;
    //Instance variable color is declared type Color
    private Color color;
    /**
     * Constructor for objects of class Shape
     */
    public Shape(Point2D.Double center, double radius, Color color)
    {
        //Sets the instance variables to the parameter variables
        this.center = center;
        this.radius = radius;
        this.color = color;
    }
    
    /**
     * getCenter is an accessor method that gets the center of a point
     *
     * @return     the center of a point
     */
    public Point2D.Double getCenter()
    {
        //Returns the center of the point
        return center;
    }
    
    public Color getColor()
    {
        return color;
    }
    
    /**
     * getRadius is an accessor method that gets the radius
     * 
     * @return     the radius
     */
    public double getRadius()
    {
        //Returns the radius
        return radius;
    }
    
    /**
     * move displaces the center of the shape
     * 
     * @param  x and y
     */
    public void move(double x, double y)
    {
        center = new Point2D.Double(x,y);
    }
    
    /**
     * SetRadius is a mutator method that sets the radius to r
     * 
     * @param  r is the radius
     */
    public void setRadius(double r)
    {
        //Sets the radius to r
        radius = r;
    }
    
    abstract boolean isInside(Point2D.Double point);
    
    abstract void draw(Graphics2D g2, boolean filled);
}
