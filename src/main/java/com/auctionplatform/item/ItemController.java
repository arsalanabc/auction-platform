package com.auctionplatform.item;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {
    private ItemService itemService = new ItemService();

    @GetMapping("/items")
    @ResponseBody
    public String getItem() {
        return itemService.getJSONItems();
    }


}


