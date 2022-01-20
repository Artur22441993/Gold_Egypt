package com.gold.egypy.g2epi;

import android.widget.Button;

public class Cell {


    private Button button;
    private  char c;
    private  int x;
    private  int y;

    public Cell(Button button, char c, int x, int y) {
        this.button = button;
        this.c = c;
        this.x = x;
        this.y = y;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
