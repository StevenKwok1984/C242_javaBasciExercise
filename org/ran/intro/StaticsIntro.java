package org.ran.intro;

public class StaticsIntro {
    private int i;
    private double d;
    private String s = "1234";

    public StaticsIntro() {
        i = 1;
        d = 2;
        // s = "c242";
    }

    public int getI(){
        return i;
    }

    public void setI(int newVal) {
        i = newVal;
    }

    public String doSomething(boolean b) {
        int v = 1;
        if (b) v += d;
        return s + " " + v;
    }
}
