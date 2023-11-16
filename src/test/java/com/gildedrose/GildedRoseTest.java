package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void normalItem() {
        Item[] items = new Item[] { new Item("foo", 10, 0) };
        GildedRose app = new GildedRose(items);
        int days = 50;

        for(int i = 0;i < days;i++){
        app.updateQuality();
        }

        assertEquals(0, app.items[0].quality);
        assertEquals(-40,app.items[0].sellIn);
    }

    @Test
    void AgedBrie(){
        Item[] items = new Item[] { new Item("Aged Brie", 2, 0) };
        GildedRose app = new GildedRose(items);
        int days = 50;

        for(int i = 0;i < days;i++){
            app.updateQuality();
        }

        assertEquals(50,app.items[0].quality);
        assertEquals(-48,app.items[0].sellIn);

    }

    @Test
    void Sulfuras(){
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 2, 10) };
        GildedRose app = new GildedRose(items);
        int days = 50;

        for(int i = 0;i < days;i++){
            app.updateQuality();
        }

        assertEquals(10,app.items[0].quality);
        assertEquals(2,app.items[0].sellIn);
    }
    @Test
    void backStagePasses(){
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 30, 0) };
        GildedRose app = new GildedRose(items);

        int days = 25;

        for(int i = 0;i < days;i++){
            app.updateQuality();
        }

        assertEquals(30,app.items[0].quality);
        assertEquals(5,app.items[0].sellIn);
    }
}
