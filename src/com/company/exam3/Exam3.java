package com.company.exam3;

import java.util.ArrayList;
import java.util.List;

public class Exam3 {
    public static void main(String[] args) {
       ArrayList<Backpack> backpack1 = new ArrayList<>();
       ArrayList<Backpack> backpack2 = new ArrayList<>();
       ArrayList<Backpack> backpack3 = new ArrayList<>();
       for (int i = 0; i < 20;i++){
           backpack1.add(new Backpack(new Apple("Apple")));
       }
        backpack1.add(new Backpack(new CockaCola("Coca")));
        backpack1.add(new Backpack(new Book("Book")));

        for (int i = 0; i < 50;i++ ){
            backpack2.add(new Backpack(new TennisBall("Tennis ball")));
        }
        backpack2.add(new Backpack(new Book("Book")));
        backpack2.add(new Backpack(new BottleOfWater("BottleOfWater")))

        System.out.println(backpack1);
        System.out.println(backpack2);

    }
}
class Backpack {
   ArrayList<AbstractSomethingFlat> abstractSomethingFlat;
    AbstractSomethingHasForm abstractSomethingHasForm;
    AbstractSomethingCylindrical abstractSomethingCylindrical;

    public Backpack() {
    }

    public Backpack(ArrayList<AbstractSomethingFlat> abstractSomethingFlat) {
        this.abstractSomethingFlat = abstractSomethingFlat;
    }

    public Backpack(AbstractSomethingHasForm abstractSomethingHasForm) {
        this.abstractSomethingHasForm = abstractSomethingHasForm;
    }

    public Backpack(AbstractSomethingCylindrical abstractSomethingCylindrical) {
        this.abstractSomethingCylindrical = abstractSomethingCylindrical;
    }

    public Backpack(Book book) {
    }


    @Override
    public String toString() {
        return "Backpack{" +
                "abstractSomethingFlat=" + abstractSomethingFlat +
                ", abstractSomethingHasForm=" + abstractSomethingHasForm +
                ", abstractSomethingCylindrical=" + abstractSomethingCylindrical +
                '}';
    }
}
