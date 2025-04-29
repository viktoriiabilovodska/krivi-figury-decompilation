
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class FigureFrame extends JFrame {
    public FigureFrame() {
        setTitle("Криві фігури");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new DrawPanel());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FigureFrame().setVisible(true);
        });
    }
}

class DrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    int[] xPoints = {200, 217, 270, 230, 245, 200, 155, 170, 130, 183};
    int[] yPoints = {120, 170, 170, 200, 250, 220, 250, 200, 170, 170};

    Polygon star = new Polygon(xPoints, yPoints, xPoints.length);

    // Градієнт: білий → сірий
    GradientPaint gradient = new GradientPaint(0, 0, Color.WHITE, getWidth(), getHeight(), Color.GRAY);
    g2.setPaint(gradient);
    g2.fill(star);
    }
}
