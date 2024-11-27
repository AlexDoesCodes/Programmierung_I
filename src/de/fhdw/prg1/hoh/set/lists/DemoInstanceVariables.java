package de.fhdw.prg1.hoh.set.lists;

public class DemoInstanceVariables {

    int mMyInstanceVar;
    String mMyString;

    DemoInstanceVariables() {
        this.setMyInstanceVar(555);   // mMyInstanceVar = 555;
        this.setMyString("FHDW");     // mMyString = "FHDW";
    }

    public String getMyString() {
        return mMyString;
    }

    public void setMyString(String newValue) {
        mMyString = newValue;
    }

    int getMyInstanceVar() {
        return mMyInstanceVar;
    }

    void setMyInstanceVar(int newValue) {
        mMyInstanceVar = newValue;
    }

    static void staticMethod(int f) {
        boolean b;
        DemoInstanceVariables di;

        di = new DemoInstanceVariables();
        di.mMyInstanceVar = 42;
        // this.instanceMethod2();  doesn`t work
        di.instanceMethod2();
        System.out.println(di.mMyInstanceVar);
        System.out.println(di.getMyInstanceVar());
    }

    static void staticMethod2() {
        DemoInstanceVariables v1, v2;

        v1 = new DemoInstanceVariables();
        v1.setMyInstanceVar(123);

        v2 = new DemoInstanceVariables();
        v2.mMyInstanceVar = 124;


    }

    void instanceMethod(double d, String s) {
        boolean b;
        mMyInstanceVar = 456;

        this.instanceMethod2();

    }

    void instanceMethod2() {
        System.out.println("HAllo");
    }


}
