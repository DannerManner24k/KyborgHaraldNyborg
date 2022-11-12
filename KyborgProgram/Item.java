package KyborgProgram;

import java.util.ArrayList;

public class Item {
    private String name;
    private int id;

    public Item (String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString () {
        return "Item name: " + name +"\nItem ID: " + id;
    }
}
