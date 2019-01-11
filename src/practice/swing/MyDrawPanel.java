package Swing;

import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel {

    int x = 10;
    int y = 200;

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 255);      //三原色RGB
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradientPaint = new GradientPaint(70, 70, startColor, 150, 150, endColor);

        g2d.setPaint(gradientPaint);
        g2d.fillOval(x, y, 100, 100);
    }
}
