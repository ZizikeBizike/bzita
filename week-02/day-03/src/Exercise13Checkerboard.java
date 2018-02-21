import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise13Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int size = WIDTH / 8;
        int x = 0;
        int y = 0;
        for (int i = 0; i < 8; i++){

            for (int j = 0; j < 8; j++){
                if ((j + i) % 2 == 1){
                    graphics.setColor(Color.black);
                } else if ((j + i) % 2 == 0){
                    graphics.setColor(Color.white);
                }
                graphics.fillRect(x, y, size, size);
                x = x + size;
            }
            y = y + size;
            x = 0;
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

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
