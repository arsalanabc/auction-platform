package com.auctionplatform.item;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ItemService {

    public String getJSONItems(){
        Item item = new Item(0, "item name");
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = null;
        try {
            jsonString = mapper.writeValueAsString(item);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonString;
    }
}
