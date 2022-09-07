package com.company;

import java.awt.*;
import java.util.Random;

public class Window {

    public int x;
    public int y;
    public int width;
    public int height;
    private static final Random rand = new Random();
    public Color color = new Color(rand.nextInt(0xffffff));

    public Window(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void drawWindow(Graphics g) {
        g.setColor(color);
        g.fillRect(x,y,width,height);
    }

    public boolean withinWindow(int x, int y) {
        return x>=this.x && x<=this.x + width && y>= this.y && y<= this.y + width;
    }

}
