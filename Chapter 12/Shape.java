import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
public abstract class Shape
{
    private Point2D.Double center;
    private Double radius;
    private Color color;
    public Shape(Point2D.Double center, double radius, Color color)
    {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }
    
    public Point2D.Double getCenter()
    {
        return center;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public void move(double x, double y)
    {
        
    }
    
    public void setRadius(double r)
    {
        
    }
    
    public boolean isInside(Point2D.Double point)
    {
        return true;
    }
    
    public boolean isOnBorder(Point2D.Double point)
    {
        return true;
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        
    }
}
