import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class DrawPoint {
    int x, y;
    Color color;
    public DrawPoint(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
}

public class MiniPaintApp extends JPanel implements MouseMotionListener, ActionListener {

    private final ArrayList<DrawPoint> points = new ArrayList<>();
    private Color currentColor = Color.BLACK;

    public MiniPaintApp() {
        addMouseMotionListener(this);
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (DrawPoint p : points) {
            g.setColor(p.color);
            g.fillOval(p.x, p.y, 6, 6);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        points.add(new DrawPoint(e.getX(), e.getY(), currentColor));
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {}

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Red": currentColor = Color.RED; break;
            case "Green": currentColor = Color.GREEN; break;
            case "Blue": currentColor = Color.BLUE; break;
            case "Black": currentColor = Color.BLACK; break;
            case "Clear":
                points.clear();
                repaint();
                break;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mini Paint Application");
        MiniPaintApp paintPanel = new MiniPaintApp();

        // Create buttons for color selection
        JPanel buttonsPanel = new JPanel();
        String[] colors = {"Black", "Red", "Green", "Blue", "Clear"};
        for (String color : colors) {
            JButton btn = new JButton(color);
            btn.setActionCommand(color);
            btn.addActionListener(paintPanel);
            buttonsPanel.add(btn);
        }

        frame.setLayout(new BorderLayout());
        frame.add(paintPanel, BorderLayout.CENTER);
        frame.add(buttonsPanel, BorderLayout.SOUTH);
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
