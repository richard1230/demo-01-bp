package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BurpGUI {
    public JPanel root;
    private JLabel text;
    private JButton button;

    public BurpGUI() {
        System.out.println("BurpGUI Constructor Called");

        root = new JPanel();
        root.setLayout(new BorderLayout());
        text = new JLabel();
        text.setText("Hello First GUI");
        root.add(text, BorderLayout.CENTER);

        button = new JButton("Click Me");
        root.add(button, BorderLayout.SOUTH);

//        添加按钮的点击事件监听
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("amazing! gui plug!!!");
            }
        });
    }



}
