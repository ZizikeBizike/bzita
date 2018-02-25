import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuaters {
    public static void mainDraw(Graphics graphics) {

        int smallCanvasX = WIDTH/2;
        int smallCanvasY = WIDTH/2;
        int startPointX = 0;
        int startPointY = 0;
        int x;
        int y;

        for(int j = 0; j < 2; j++){

            for (int i = 0; i < WIDTH/2; i = i + WIDTH/2/20) {
                x = i;
                y = i;
                graphics.setColor(Color.green);
                graphics.drawLine(startPointX, y, x, smallCanvasY);
                graphics.setColor(Color.magenta);
                graphics.drawLine(x, startPointY, smallCanvasX, y);


                //graphics.drawLine(0+WIDTH/2, startY, endX+WIDTH/2, heightNew);
                //graphics.drawLine(startX + WIDTH/2, 0, widthNew + WIDTH/2, endY);
            }
            startPointX = startPointX + WIDTH/2;
            x = WIDTH/2;
            smallCanvasX = smallCanvasX + WIDTH/2;
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
