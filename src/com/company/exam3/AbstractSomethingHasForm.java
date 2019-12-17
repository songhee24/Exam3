package com.company.exam3;

public abstract   class AbstractSomethingHasForm {
    String name;

    public AbstractSomethingHasForm(String name) {
        this.name = name;
    }
}

class CockaCola extends AbstractSomethingHasForm {
    public CockaCola(String name) {
        super(name);
    }
}

class BottleOfWater extends AbstractSomethingHasForm  {
    public BottleOfWater(String name) {
        super(name);
    }
}