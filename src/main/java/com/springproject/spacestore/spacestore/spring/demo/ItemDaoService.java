package com.springproject.spacestore.spacestore.spring.demo;
import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class ItemDaoService {
    private static List<SpaceStoreItem> allItems = new ArrayList<>();

    private static int itemCount = allItems.size();

    static {
        allItems.add(new SpaceStoreItem("Martian Mangos", "mars", 500));
        allItems.add(new SpaceStoreItem("Jupiter Jackfruit", "jupiter", 900));
        allItems.add(new SpaceStoreItem("Venus Vanilla Extract", "venus", 1200));
        allItems.add(new SpaceStoreItem("Pluto Pears", "pluto", 5000));
    }

    public List<SpaceStoreItem> displayAll() {
        return allItems;
    }

    public SpaceStoreItem addItem (SpaceStoreItem newItem){
        if (SpaceStoreItem.getItemCode() == 0){
                SpaceStoreItem.setItemCode();
        }
        allItems.add(newItem);
        return  newItem;
    }

    public SpaceStoreItem findItemSource(String itemSource){
        for (SpaceStoreItem item: allItems){
            if (item.getItemSource().equals(itemSource)){
                return item;
            }
        }
        return null;
    }

}
