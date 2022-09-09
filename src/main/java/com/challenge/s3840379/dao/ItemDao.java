package com.challenge.s3840379.dao;

import com.challenge.s3840379.model.Item;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ItemDao {

    ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void deleteItem(String id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                items.remove(i);
                return;
            }
        }
    }

    public Item getItem(String id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                return items.get(i);
            }
        }
        return null;
    }

    public void updateItem(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(item.getId())) {
                items.set(i, item);
            }
        }
    }

    public String toString() {
        return items.stream().map(Object::toString)
                .collect(Collectors.joining("\n "));
    }

}
