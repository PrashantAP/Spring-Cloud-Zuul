package com.example.springboot.rest.api.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class ItemController {

    @GetMapping("/fetchItem")
    public String getItem() {
        return "Calling fetchItem service...";
    }

    @GetMapping("/addItem")
    public String addItem() { return "Calling addItem service..."; }

    @GetMapping("/deleteItem")
    public String deleteItem() { return "Calling deleteItem service..."; }

}
