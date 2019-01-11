package practice.swing.JFrameDemo;

import javax.swing.*;
import java.awt.*;

public class JFrameStart {
    public static void main(String[] args) {
        //事件分发线程 《那么大》
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("Welcome");
            frame.setSize(500, 500);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });

    }
}
