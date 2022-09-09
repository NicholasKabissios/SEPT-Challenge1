package com.challenge.s3840379.controller;

import com.challenge.s3840379.dao.ItemDao;
import com.challenge.s3840379.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {

    ItemDao dao = new ItemDao();

    @PostMapping("/addItem")
    public void addItem(@RequestBody Item newItem) {
        dao.addItem(newItem);
    }

    @GetMapping("/getItem")
    public String getItem(@RequestParam(value = "id", defaultValue = "asd") String id) {
        return dao.getItem(id).toString();
    }

    @GetMapping("/getItems")
    public String getItems() {
        return dao.toString();
    }

    @DeleteMapping("/deleteItem")
    public void deleteItem(@RequestParam(value = "id") String id) {
        dao.deleteItem(id);
    }

    @PutMapping("/update")
    public void updateItem(@RequestBody Item newItem) {
        dao.updateItem(newItem);
    }

}
