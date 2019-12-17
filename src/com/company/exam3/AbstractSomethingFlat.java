package com.company.exam3;

public abstract class AbstractSomethingFlat {
   private String name;


    public AbstractSomethingFlat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AbstractSomethingFlat{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Book extends AbstractSomethingFlat {
    public Book(String name) {
        super(name);
    }
}
