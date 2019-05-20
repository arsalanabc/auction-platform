package com.auctionplatform.items;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemControllerTest {

    @Test
    public void shouldReturnAnItem() {
        ItemController itemController = new ItemController();
        Assert.assertEquals("item", itemController.getItem());
    }
}

