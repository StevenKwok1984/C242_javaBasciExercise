package org.ran.intro;

public class StaticsIntro {
    private int i;
    private static double d;
    private static final String s = setVal();

    static {
        System.out.println("Initializing StaticsIntro class; s=" + s);
    }

    public static void main(String[] args) {
        System.out.println("Hello (from main())");
    }

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

    public static String getS() {
        return s;
    }

    private static String setVal () {
        return "class C242";
    }

    public String doSomething(boolean b) {
        int v = 1;
        if (b) v += d;
        return s + " " + v;
    }


}
