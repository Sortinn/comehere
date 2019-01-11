package practice.swing.JFrameDemo;

import javax.swing.*;
import java.awt.*;

public class AlgsJFrame extends JFrame {

    private int canvasWidth;
    private int canvasHeight;

    public AlgsJFrame(String title, int canvasWidth, int canvasHeight) {
        super(title);
        this.canvasWidth = canvasWidth;
        this.canvasHeight = canvasHeight;
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        //创建画布
        AlgsCanvas canvas = new AlgsCanvas();
//        canvas.setPreferredSize(new Dimension(canvasWidth, canvasHeight)); //这行代码应该是画布的职责，所以应该在画布类中实现
        this.setContentPane(canvas);
        pack();
    }

    public AlgsJFrame(String title) {
        this(title, 1024, 768);
    }

    public int getCanvasWidth() {
        return canvasWidth;
    }

    public int getCanvasHeight() {
        return canvasHeight;
    }


    private class AlgsCanvas extends JPanel {


        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval(50,50,300,300);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(canvasWidth, canvasHeight);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {

            AlgsJFrame frame = new AlgsJFrame("Welcome", 500, 500);
        });


    }
}
