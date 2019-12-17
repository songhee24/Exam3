package com.company.exam3;

public  abstract  class AbstractSomethingCylindrical {
    String name;

    public AbstractSomethingCylindrical(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AbstractSomethingCylindrical{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Apple extends AbstractSomethingCylindrical {
    public Apple(String name) {
        super(name);
    }


}

class TennisBall extends AbstractSomethingCylindrical {
    public TennisBall(String name) {
        super(name);
    }


}
