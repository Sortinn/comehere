package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChangeColor {
    JFrame jFrame;
    JLabel jLabel;

    MyDrawPanel myDrawPanel = new MyDrawPanel(); //创建我的绘图组件

    private void changeIt() {
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton colorButton = new JButton("click me to change color");
        JButton labelButton = new JButton("click me to change label");

        jLabel = new JLabel("I'm a label");


        colorButton.addActionListener(new ColorChange());        //向按钮注册事件
        labelButton.addActionListener(new LableChange());


        jFrame.getContentPane().add(BorderLayout.SOUTH, colorButton);  //将按钮放置在界面的下部（南部）
        jFrame.getContentPane().add(BorderLayout.CENTER, myDrawPanel); //将绘图组件放在界面中心
        jFrame.getContentPane().add(BorderLayout.WEST, jLabel);
        jFrame.getContentPane().add(BorderLayout.EAST, labelButton);

        jFrame.setSize(600, 600);
        jFrame.setVisible(true);          //设置frame可见

        for (int i = 0; i < 150; i++) {
            //
            // myDrawPanel.x++;
            myDrawPanel.y++;
            jFrame.repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }

    }

    class ColorChange implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            jFrame.repaint();
        }
    }


    class LableChange implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            jLabel.setText("changed!");
        }
    }

    public static void main(String[] args) {
        ChangeColor changeColor = new ChangeColor();

        changeColor.changeIt();

    }


}

