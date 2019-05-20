package com.auctionplatform.item;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class ItemServiceTest {

    private ObjectMapper objectMapper = new ObjectMapper();
    private String jsonItem;

    @Test
    public void shouldConvertJSONItem() {

        ItemService itemService = new ItemService();
        String item = itemService.getJSONItems();
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