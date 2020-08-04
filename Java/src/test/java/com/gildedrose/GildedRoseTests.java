package com.gildedrose;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

public class GildedRoseTests {
    @Test
    public void updateQuality() {
        var items = new Item[]{new Item("a common item", 0, 0)};
        var gildedRose = new GildedRose(items);

        gildedRose.updateQuality();
        Approvals.verify(gildedRose.items[0]);
    }
}
