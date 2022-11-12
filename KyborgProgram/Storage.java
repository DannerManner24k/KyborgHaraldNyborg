package KyborgProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Storage {
    private ArrayList<Item> itemArrayList = new ArrayList<Item>();


    public Storage () {
        this.itemArrayList = new ArrayList<Item>();
    }

    public ArrayList<Item> addStorage () {
        Scanner itemId = new Scanner(System.in);
        Scanner itemName = new Scanner(System.in);
        System.out.println("Enter item ID:");
        System.out.print("> ");
        int inputItemId = Integer.parseInt(itemId.next());

        System.out.println("Enter item name:");
        System.out.print("> ");
        String inputItemName = itemName.next();



        Item items = new Item(inputItemId, inputItemName);
        itemArrayList.add(items);
        System.out.println();
        System.out.println(toString());
        return itemArrayList;

    }
    @Override
    public String toString () {
        Iterator itr =itemArrayList.iterator();
        Item it = (Item)itr.next();
        return it.toString();
    }
}

