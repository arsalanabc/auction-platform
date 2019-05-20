package com.auctionplatform.item;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest {
    private static final String ITEM_NAME = "item-name";


    @Test
    public void shouldHaveItemDetails (){

        Item item = new Item(10, ITEM_NAME);
        int itemPrice = item.getPrice();
        String name = item.getName();

        Assert.assertEquals(10, itemPrice);
        Assert.assertEquals(ITEM_NAME, item.getName());

        item.setPrice(100);
        Assert.assertEquals(100, item.getPrice());



    }
}