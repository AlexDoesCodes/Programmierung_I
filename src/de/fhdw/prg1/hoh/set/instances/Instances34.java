package de.fhdw.prg1.hoh.set.instances;

public class Instances34 {
    int mInstance1;
    String mInstance2;


    Instances34(int instance1, String instance2) {
        this.mInstance1 = instance1;
        this.mInstance2 = instance2;
    }

    public void setInstance1(int mInstance1) {
        this.mInstance1 = mInstance1;

    }

    public void setInstance2(String mInstance2) {
        this.mInstance2 = mInstance2;
    }

    public int getInstance1() {
        return mInstance1;
    }

    public String getInstance2() {
        return mInstance2;
    }

    public static void main(String[] args) {
        Instances34 obj = new Instances34(30, "Max");

        System.out.println(obj.getInstance1() + " " + obj.getInstance2());

        obj.setInstance1(40);

        System.out.println(obj.getInstance1() + " " + obj.getInstance2());

        obj.setInstance2("Serbast");

        System.out.println(obj.getInstance1() + " " + obj.getInstance2());
    }


}
