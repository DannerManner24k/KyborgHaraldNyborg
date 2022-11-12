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
        System.out.println("> ");
        String inputItemName = itemName.nextLine();
        System.out.println("> ");
        int inputItemId = Integer.parseInt(itemId.nextLine());


        Item items = new Item(inputItemName, inputItemId);
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

