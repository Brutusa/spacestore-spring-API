package com.springproject.spacestore.spacestore.spring.demo;
import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class ItemDaoService {

    //Create an array to store space items
    private static List<SpaceStoreItem> allItems = new ArrayList<>();

    //Create items to add to allItems array
    static {
        allItems.add(new SpaceStoreItem("Martian Mangos", "mars", 500));
        allItems.add(new SpaceStoreItem("Jupiter Jackfruit", "jupiter", 900));
        allItems.add(new SpaceStoreItem("Venus Vanilla Extract", "venus", 1200));
        allItems.add(new SpaceStoreItem("Pluto Pears", "pluto", 5000));
    }

    //Method to return all items in array to be displayed
    public List<SpaceStoreItem> displayAll() {
        return allItems;
    }

    //Retrieve item count
    public int getItemCount() {
        return allItems.size();
    }

    //Add an item to the array
    public SpaceStoreItem addItem (SpaceStoreItem newItem){
        if (newItem.getItemCode() == 0){
                newItem.setItemCode();
        }
        allItems.add(newItem);
        return  newItem;
    }

    //Method to look through array of items to return single item
    public SpaceStoreItem findItemSource(String itemSource){
        for (SpaceStoreItem item: allItems){
            if (item.getItemSource().equals(itemSource)){
                return item;
            }
        }
        return null;
    }

    public SpaceStoreItem removeItemByCode(int itemCode){
        Iterator<SpaceStoreItem> iterator = allItems.iterator();
            while (iterator.hasNext()){
                SpaceStoreItem item = iterator.next();
                if (item.getItemCode() == itemCode){
                    iterator.remove();
                    return item;
                }
            }
        return null;
    }

}
