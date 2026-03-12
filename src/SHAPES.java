import javax.swing.*;
import java.awt.*;
public class SHAPES extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Rectangle
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 60);

        // Circle (Oval)
        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 80, 80);

        // Line
        g.setColor(Color.GREEN);
        g.drawLine(50, 150, 250, 150);

        // Oval outline
        g.setColor(Color.BLACK);
        g.drawOval(300, 50, 100, 60);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Shapes Example");
        SHAPES panel = new SHAPES();

        frame.add(panel);
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}