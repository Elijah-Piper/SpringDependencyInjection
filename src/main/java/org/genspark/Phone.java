package org.genspark;

public class Phone {

    private String mob;

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }

    public Phone(String mob) {
        this.mob = mob;
    }
}
