import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
/**
 * The control panel class is a subclass of JPanel and creates the buttons and panels
 * 
 * @author Eric Kim
 * @version 3/4/2016
 */
public class ControlPanel extends JPanel
{
    //Creates a canvas instance variable
    private DrawingPanel canvas;
    private JPanel panel;
    //Creates instance variables for 3 buttons
    private JButton button;
    private JButton button2;
    private JButton button3;
    /**
     * Constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel canvas)
    {
        //Sets the instance variable canvas to the parameter variable canvas
        this.canvas = canvas;
        
        //Sets the 1st button labeled as "Pick Color" and adds it to this ControlPanel object
        this.button = new JButton("Pick Color");
        this.button.setPreferredSize(new Dimension(150,50));
        this.add(this.button);
        
        //Adds the panel with the color of blue to this ControlPanel object
        panel = new JPanel();
        panel.setBackground(canvas.getColor());
        panel.setPreferredSize(new Dimension(50,50));
        this.add(this.panel);

        //Sets the second button labeled as "Add Circle" and adds it to this ControlPanel object
        this.button2 = new JButton("Add Circle");
        this.button2.setPreferredSize(new Dimension(150,50));
        this.add(this.button2);

        //Sets the third button labeled as "Add Square" and adds it to this ControlPanel object
        this.button3 = new JButton("Add Square");
        this.button3.setPreferredSize(new Dimension(150,50));
        this.add(this.button3);
        
        //Adds a listener to their respective button
        this.button.addActionListener(new ColorListener());
        this.button2.addActionListener(new CircleListener());
        this.button3.addActionListener(new SquareListener());
    }

    /**
     * ColorListener class implements ActionListener and its main purpose is to keep track of when
     * the color panel is clicked by using events
     * 
     * @author Eric Kim
     * @version 3/4/2016
     */
    public class ColorListener implements ActionListener
    {
        /**
         * actionPerformed method that is called when the color button is clicked
         * 
         * @param  ActionEvent event
         */
        public void actionPerformed(ActionEvent event)
        {
            //Calls the pickColor method on the canvas object
            canvas.pickColor();
            //Changes the color of the panel to the color the user chose
            panel.setBackground(canvas.getColor());
        }
    }

    /**
     * CircleListener implements ActionListener and its main purpose is to keep track of when the circle
     * button is pressed by using events
     * 
     * @author Eric Kim
     * @version 3/4/2016
     */
    public class CircleListener implements ActionListener
    {
        /**
         * actionPerformed method that is called when the circle button is clicked
         * 
         * @param  ActionEvent event
         */
        public void actionPerformed(ActionEvent event)
        {
            //Calls the addCircle method on the canvas object
            canvas.addCircle();
        }
    }

    /**
     * SquareListener implements ActionListener and its main purpose is to keep track of when the square
     * button is pressed by using events
     * 
     * @author Eric Kim
     * @version 3/4/2016
     */
    public class SquareListener implements ActionListener
    {
        /**
         * actionPerformed method is called when the square button is clicked
         * 
         * @param  ActionEvent event
         */
        public void actionPerformed(ActionEvent event)
        {
            //Calls the addSquare method on the canvas object
            canvas.addSquare();
        }
    }
}
