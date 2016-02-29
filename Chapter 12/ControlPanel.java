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
    private JPanel panel;
    private JButton button;
    private JButton button2;
    private JButton button3;
    public ControlPanel(DrawingPanel canvas)
    {
        this.button = new JButton("Pick Color");
        this.add(this.button);

        Color background = this.getBackground();
        panel = new JPanel();
        panel.setBackground(background);
        this.add(this.panel);

        this.button2 = new JButton("Add Circle");
        this.add(this.button2);

        this.button3 = new JButton("Add Square");
        this.add(this.button3);

    }
    
}
