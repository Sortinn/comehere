package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button2 implements ActionListener {
    JButton button = new JButton("click me");

    public static void main(String[] args) {
        Button2 button2 = new Button2();
        button2.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        frame.getContentPane().add( button);
        button.addActionListener(this);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("you've clicked me");
    }
}
