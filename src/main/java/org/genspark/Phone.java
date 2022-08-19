package org.genspark;

import org.springframework.stereotype.Component;

@Component
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

    public Phone() {
        this.mob = "999-999-9999";
    }
}
