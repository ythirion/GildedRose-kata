package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

public class GildedRoseTests {
    @Test
    public void updateQuality() {
        CombinationApprovals.verifyAllCombinations(
                this::callUpdateQuality,
                new String[]{"a common item"},
                new Integer[]{0},
                new Integer[]{0}
        );
    }

    private String callUpdateQuality(String name, int sellIn, int quality) {
        var items = new Item[]{new Item(name, sellIn, quality)};
        var gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        return gildedRose.items[0].toString();
    }
}
