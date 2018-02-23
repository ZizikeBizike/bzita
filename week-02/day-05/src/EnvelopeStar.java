import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.green);

        for (int i = 0; i < WIDTH/2 + 1 ; i = i + WIDTH/30) {

            graphics.drawLine(WIDTH/2, i, WIDTH/2 - i, HEIGHT/2);
            graphics.drawLine(WIDTH/2, i, WIDTH/2 + i, HEIGHT/2);
            graphics.drawLine(WIDTH/2, HEIGHT/2 + i, i, HEIGHT/2);
            graphics.drawLine(WIDTH/2, HEIGHT/2 + i, WIDTH - i, HEIGHT/2);
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
