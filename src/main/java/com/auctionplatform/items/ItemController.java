package com.auctionplatform.items;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

    @GetMapping("/items")
    @ResponseBody
    public String getItem() {
        return "item";
    }


}

