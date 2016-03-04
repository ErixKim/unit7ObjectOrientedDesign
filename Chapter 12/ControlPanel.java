import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;
public class ControlPanel extends JPanel
{
    private DrawingPanel canvas;
    private JPanel panel;
    private JButton button;
    private JButton button2;
    private JButton button3;
    public ControlPanel(DrawingPanel canvas)
    {
        this.canvas = canvas;

        this.button = new JButton("Pick Color");
        this.add(this.button);

        panel = new JPanel();
        panel.setBackground(canvas.getColor());
        this.add(this.panel);

        this.button2 = new JButton("Add Circle");
        this.add(this.button2);

        this.button2.addActionListener(new CircleListener());

        this.button3 = new JButton("Add Square");
        this.add(this.button3);

        this.button3.addActionListener(new SquareListener());

        button.addActionListener(new ColorListener());
    }
    public class ColorListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            canvas.pickColor();
            panel.setBackground(canvas.getColor());
        }
    }

    public class CircleListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            canvas.addCircle();
            System.out.println("You made a circle");
            //         canvas.requestFocusInWindow();
        }
    }

    public class SquareListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            canvas.addSquare();
            System.out.println("You made a square");
            //         canvas.requestFocusInWindow();
        }
    }
}
