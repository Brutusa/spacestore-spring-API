package com.springproject.spacestore.spacestore.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class SpaceStoreItemController {

    @Autowired
    private ItemDaoService service;

    //Get full list of items
    @GetMapping("/items")
    public List<SpaceStoreItem> retrieveItemDetails() {
        return service.displayAll();
    }

    //Get single item source detail
    @GetMapping("/items/{itemSource}")
    public SpaceStoreItem retrieveItemDetails(@PathVariable String itemSource) {
        return service.findItemSource(itemSource);
    }

    @GetMapping("/items/count")
    public int retrieveItemCount() {
        return service.getItemCount();
    }

    //Create new item to and add to collection
    @PostMapping("/items")
    public ResponseEntity<Object> createItem(@RequestBody SpaceStoreItem item){
        SpaceStoreItem newItem = service.addItem(item);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{itemSource}").buildAndExpand(newItem.getItemSource()).toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/items/{itemCode}")
    public void deleteByCode(@PathVariable int itemCode){
        SpaceStoreItem item = service.removeItemByCode(itemCode);

        //Add in exception for if code does not exist
    }

}
