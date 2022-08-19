package com.springproject.spacestore.spacestore.spring.demo;

public class SpaceStoreItem {
    private String name;
    private String itemSource;
    private static int itemCode;
    private int uniqueItemCode;
    private int itemPrice;

    public SpaceStoreItem(String name, String itemSource, int itemPrice) {
        this.name = name;
        this.itemSource = itemSource;
        this.itemPrice = itemPrice;
        this.uniqueItemCode = ++itemCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemSource() {
        return itemSource;
    }

    public void setItemSource(String itemSource) {
        this.itemSource = itemSource;
    }

    public int getItemCode() {
        return uniqueItemCode;
    }

    public void setItemCode() {
        uniqueItemCode = ++itemCode;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "SpaceStoreItem{" +
                "name='" + name + '\'' +
                ", itemSource='" + itemSource + '\'' +
                ", itemCode=" + itemCode +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
