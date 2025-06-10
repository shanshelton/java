import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class EmojiGraphics extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Face
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);

        // Eyes
        g.setColor(Color.BLACK);
        g.fillOval(90, 100, 20, 30); // Left eye
        g.fillOval(190, 100, 20, 30); // Right eye

        // Smile
        g.drawArc(100, 130, 100, 50, 0, -180); // Smile arc
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiley Emoji");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 320);
        frame.add(new EmojiGraphics());
        frame.setVisible(true);
    }
}
