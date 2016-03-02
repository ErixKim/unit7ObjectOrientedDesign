import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.*;
public class DrawingEditor extends JFrame
{
    private DrawingPanel canvas;
    private ControlPanel controls;
    public DrawingEditor()
    {
        this.canvas = new DrawingPanel();
        controls = new ControlPanel(canvas);
        setLayout(new BorderLayout());
        this.add(controls,BorderLayout.SOUTH);
        this.add(canvas);
        this.setTitle("Drawing Editor");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        DrawingEditor scene = new DrawingEditor();
    }
}