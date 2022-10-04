import javax.swing.*;
import java.awt.*;

public class Visual extends JPanel {
    public Visual() {
        setBackground(Color.GREEN.darker());
        setPreferredSize(new Dimension(200, 400));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Point center = new Point(this.getWidth() / 2, this.getHeight() / 2);
        int radius = Math.min(this.getWidth() / 2, this.getHeight() / 2) - 5;
        int diameter = radius * 2;
        int innerRadius = (int) ((double) radius * 0.9);
        int innerDiameter = innerRadius * 2;
        int barWidth = (int) ((double) innerRadius * 1.4);
        int barHeight = (int) ((double) innerRadius * 0.35);
        g.setColor(Color.WHITE);
        g.fillOval(center.x - radius, center.y - radius, diameter, diameter);
        g.setColor(Color.RED);
        g.fillOval(center.x - innerRadius, center.y - innerRadius, innerDiameter, innerDiameter);
        g.setColor(Color.WHITE);
        g.fillRect(center.x - barWidth / 2, center.y - barHeight / 2, barWidth, barHeight);
    }

    public static void createGraphics() {
        Visual panel = new Visual();

        JFrame frame = new JFrame("A simple graphics program");
        frame.setDefaultCloseOperation(3);
        frame.getContentPane().add(panel, "Center");
        frame.setVisible(true);
    }
}


