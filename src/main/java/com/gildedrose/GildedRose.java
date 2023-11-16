package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void checkIfSpecial(Item item){
        switch (item.name){
            case "Aged Brie": if(item.sellIn < 0){item.quality +=2;}else {item.quality++;} if(item.quality > 50){item.quality = 50;} item.sellIn--;break;

            case "Backstage passes to a TAFKAL80ETC concert": if (item.sellIn <= 10 && item.sellIn > 5){item.quality += 2;}else if (item.sellIn <= 5){item.quality += 3;}else {item.quality += 1;}
                if(item.quality > 50){item.quality = 50;} item.sellIn--;break;

            case "Conjured Mana Cake": if(item.sellIn < 0){item.quality -=4;}else {item.quality-=2;} if(item.quality < 0){item.quality = 0;} item.sellIn--;break;

            case "Sulfuras, Hand of Ragnaros": break;

            default: if(item.sellIn < 0){item.quality -=2;}else {item.quality-=1;} if(item.quality < 0){item.quality = 0;} item.sellIn--;break;
        }
    }

    public void updateQuality() {

        for(Item item: items){
            checkIfSpecial(item);
        }
    }
}
