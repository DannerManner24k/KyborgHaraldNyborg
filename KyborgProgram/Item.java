package KyborgProgram;

import java.util.ArrayList;

public class Item {
    private int id;
    private String name;


    public Item (int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString () {
        return "Item ID: " + id +"\nItem name: " + name;
    }
}
