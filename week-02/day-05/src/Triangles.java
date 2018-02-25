import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        graphics.drawLine(0, 600, 600, 600);
        graphics.drawLine(600, 600, 300, 600-520);
        graphics.drawLine(300, 600-520, 0, 600);
        int startX = 0;
        int startY = 600;
        int endX = 600;
        int endY = 80;
        for(int i = 0; i < 21; i++){
            startX = startX + 300/21;
            endX = endX - 300/21;
            startY = startY - 520/21;

            graphics.drawLine(startX, startY, endX, startY);
        }
        int startX2 = 600;
        int endX2 = 300;
        int endY2  = 520;

        for (int i = 0; i < 21; i++) {
            startX2 = startX2 - startX2/21;
            endX2 = endX2 - endX2/21;
            endY2 = endY2 - 520/21;
            graphics.drawLine(startX2, 600, endX2, endY2);
        }


        /*double startX = 0;
        double endX = WIDTH;
        double startY = HEIGHT;          //Math.sqrt(3) - a három gyöke
        double endY = 0;

        for (int i = 0; i < HEIGHT; i = i + HEIGHT/21){
            startX = startX + WIDTH/42;
            endX = endX - WIDTH/42;
            startY = startY - (HEIGHT/21)* Math.sqrt(3)/2;


            graphics.drawLine((int) startX, (int) startY, (int) endX, (int) startY);
        }*/
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
