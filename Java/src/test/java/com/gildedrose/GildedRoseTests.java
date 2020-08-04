package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTests {
    @Test
    public void updateQuality() {
        var items = new Item[]{new Item("a common item", 0, 0)};
        var gildedRose = new GildedRose(items);

        gildedRose.updateQuality();
        assertEquals("a common item", gildedRose.items[0].name);
        assertEquals(-1, gildedRose.items[0].sellIn);
        assertEquals(0, gildedRose.items[0].quality);
    }
}
