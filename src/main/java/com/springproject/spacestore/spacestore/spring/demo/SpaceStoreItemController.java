package com.springproject.spacestore.spacestore.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpaceStoreItemController {

    @Autowired
    private ItemDaoService service;

    @GetMapping("/items")
    public List<SpaceStoreItem> retrieveItemDetails() {
        return service.displayAll();
    }

    @GetMapping("/items/{itemSource}")
    public SpaceStoreItem retrieveItemDetails(@PathVariable String itemSource) {
        return service.findItemSource(itemSource);

    }
}
