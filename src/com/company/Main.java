package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame f = new JFrame("Aryan's Window Manager!!!");
        f.setSize(1520, 1150);
        MyJPanel myJPanel = new MyJPanel();
        f.setContentPane(myJPanel);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
