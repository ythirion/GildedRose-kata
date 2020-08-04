package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

public class GildedRoseTests {
    @Test
    public void updateQuality() {
        var name = "a common item";
        var sellIn = 0;
        var quality = 0;

        CombinationApprovals.verifyAllCombinations(
                this::callUpdateQuality,
                new String[]{name},
                new Integer[]{sellIn},
                new Integer[]{quality}
        );
    }

    private String callUpdateQuality(String name, int sellIn, int quality) {
        var items = new Item[]{new Item(name, sellIn, quality)};
        var gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        return gildedRose.items[0].toString();
    }
}
