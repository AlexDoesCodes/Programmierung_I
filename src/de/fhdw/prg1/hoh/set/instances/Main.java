package de.fhdw.prg1.hoh.set.instances;

public class Main {

    public static void main(String[] args) {
        DemoInstanceVariables di;
        DemoInstanceVariables v1;

        di = new DemoInstanceVariables();
        v1 = new DemoInstanceVariables();
        // di.setMyInstanceVar(555);
        // di.setMyString("FHDW");
        System.out.println(di.getMyInstanceVar());
        System.out.println(di.getMyString());
        System.out.println(v1.getMyInstanceVar());

    }
}
