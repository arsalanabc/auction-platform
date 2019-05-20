package com.auctionplatform;

import com.auctionplatform.item.Item;
import com.auctionplatform.item.ItemController;
import org.junit.Assert;
import org.junit.Test;

public class ItemControllerTest {

    @Test
    public void shouldReturnAnItem() {
        ItemController itemController = new ItemController();
        Assert.assertEquals("item", itemController.getItem());
    }


}

