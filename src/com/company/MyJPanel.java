package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJPanel extends JPanel implements MouseListener{

    private WindowManager wm = new WindowManager();

    public MyJPanel() {
        super();
        addMouseListener(this);
        for (int i = 0; i<10; i++) {
            wm.add();
        }
        repaint();
    }

    public void mouseClicked(MouseEvent mouseEvent) {}

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        wm.mouseManager(x, y);
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        wm.drawWindows(g);
    }
}
