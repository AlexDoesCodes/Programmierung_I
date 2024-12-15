package de.fhdw.prg1.hoh.set.employee;

public class Employee {
    public Employee() {}
    private String mName;
    private int mAge;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }

    public int yearsToPansion(){
        return 65 - mAge;
    }
}
