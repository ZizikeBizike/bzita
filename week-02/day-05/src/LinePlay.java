import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        for (int i = 0; i < WIDTH; i = i + WIDTH/20) {
            int endX = i;
            int startY = i;
            int startX = i;
            int endY = i;
            graphics.setColor(Color.green);
            graphics.drawLine(0, startY, endX, HEIGHT);
            graphics.setColor(Color.magenta);
            graphics.drawLine(startX, 0, WIDTH, endY);
        }
    }
    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}