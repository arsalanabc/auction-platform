package com.auctionplatform;


import com.auctionplatform.item.Item;
import com.auctionplatform.item.ItemController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class ItemControllerTest {

    private ObjectMapper objectMapper = new ObjectMapper();
    private String jsonItem;

    @Test
    public void shouldReturnJSONItem() {

        ItemController itemController = new ItemController();
        String item = itemController.getItem();
        Item testItem = new Item(0, "item name");

        try {
            jsonItem = objectMapper.writeValueAsString(testItem);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        Assert.assertThat(item, instanceOf(String.class));
        Assert.assertEquals(jsonItem, item);


    }




}

