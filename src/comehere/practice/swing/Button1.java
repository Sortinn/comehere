package Swing;

import javax.swing.*;
import java.awt.*;

public class Button1 {
    public static void main(String[] args) {
        Button1 gui = new Button1();
        gui.go();
    }

    private void go() {
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("click me you mean it hello everyone I'm sortinn");
        Font font = new Font("serif", Font.BOLD, 20);

        jFrame.getContentPane().add(BorderLayout.NORTH, jButton);
        jFrame.setSize(600, 600);
        jFrame.setVisible(true);
    }
}
