package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class WindowManager {

    ArrayList<Window> array1 = new ArrayList<Window>();

    public void add() {

        Random rand1 = new Random();
        int x = rand1.nextInt(1000);

        Random rand2 = new Random();
        int y = rand2.nextInt(400);

        Window window = new Window(x,y,400,400);

        array1.add(window);

    }

    public void drawWindows(Graphics g) {
        for (Window w : array1) {
            w.drawWindow(g);
        }
    }

    public void mouseManager(int x, int y) {
        for (int i = array1.size()-1; i>=0; i--) {
            Window w = array1.get(i);

            if (w.withinWindow(x, y)) {
                array1.remove(i);
                array1.add(w);
                return;
            }
        }
    }



}
