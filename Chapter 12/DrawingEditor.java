import javax.swing.*;
import java.awt.BorderLayout;
<<<<<<< HEAD
/**
 * Write a description of class DrawingEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
=======
import javax.swing.*;
>>>>>>> origin/master
public class DrawingEditor extends JFrame
{
    private DrawingPanel canvas;
    private ControlPanel controls;
    public DrawingEditor()
    {
        this.canvas = new DrawingPanel();
        controls = new ControlPanel(canvas);
<<<<<<< HEAD
=======
        setLayout(new BorderLayout());
        this.add(controls,BorderLayout.SOUTH);
        this.add(canvas);
>>>>>>> origin/master
        this.setTitle("Drawing Editor");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(canvas,BorderLayout.CENTER);
        this.add(controls,BorderLayout.SOUTH);
    }
    public static void main(String[] args)
    {
         DrawingEditor scene = new DrawingEditor();
    }
}
