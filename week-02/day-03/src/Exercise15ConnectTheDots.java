import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise15ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int[][] coordinates = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        pointConnector (graphics, coordinates);

        int[][] coordinates2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
            {120, 100}, {85, 130}, {50, 100}};
        pointConnector (graphics, coordinates);
    }

    public static void pointConnector (Graphics graphics, int[][] coordinates1){
        graphics.setColor(Color.green);
        for (int i = 0; i < coordinates1.length; i++) {
            int xStart = coordinates1[i][0];
            int yStart = coordinates1[i][1];
            int xEnd;
            int yEnd;

            if (i == coordinates1.length - 1){
                xEnd = coordinates1[0][0];
                yEnd = coordinates1[0][1];
            } else {
                xEnd = coordinates1[i + 1][0];
                yEnd = coordinates1[i + 1][1];
            }
            graphics.drawLine(xStart, yStart, xEnd, yEnd);
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


// create a 300x300 canvas.
