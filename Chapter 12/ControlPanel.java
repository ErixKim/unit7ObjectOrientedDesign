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

        //         CircleListener circleListener = new CircleListener();
        //         this.button2.addActionListener(CircleListener);

        this.button3 = new JButton("Add Square");
        this.add(this.button3);

        //         SquareListener squareListener = new SquareListener();
        //         this.button3.addActionListener(SquareListener);
        //         
    }
    public class ColorListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            canvas.pickColor();
            Color currentColor = canvas.getColor();
            getColorPanel.setBackground(currentColor);
        }
    }
    //     public class CircleListener implements ActionListener
    //     {
    //         canvas.addCircle();
    //         canvas.requestFocusInWindow();
    //     }
    //     public class SquareListener implements SquareListener
    //     {
    //         canvas.addSquare();
    //         canvas.requestFocusInWindow();
    //     }
}
