package io.vaclst.adventure.money;

import io.vaclst.adventure.IShop;
import io.vaclst.adventure.IInventoryItem;
import io.vaclst.adventure.player.Inventory;

import java.util.HashMap;
import java.util.Map;

public class GeneralStore implements IShop {
    private Map<java.lang.String, Double> buyables;

    @Override
    public Map<java.lang.String, Double> buyable() {
        Map<java.lang.String, Double> tempMap = new HashMap<>();

        tempMap.put("shovel", 10.0);
        this.buyables = tempMap;

        return tempMap;
    }

    @Override
    public void buy(IInventoryItem item, Inventory inventory, Wallet wallet) {
        if (this.buyables.containsKey(item)) {
            if (this.buyables.get(item) >= wallet.getCash()) {
                wallet.remCash(this.buyables.get(item));
                inventory.addItem(item);
            }
        }
    }
}
