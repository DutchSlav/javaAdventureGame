package io.vaclst.adventure.player;


import io.vaclst.adventure.IInventoryItem;
import io.vaclst.adventure.items.Rock;
import io.vaclst.adventure.items.Shovel;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private final List<IInventoryItem> inventory = new ArrayList<>();
    private final List<IInventoryItem> items = new ArrayList<>();
    private final Map<java.lang.String, IInventoryItem> itemsByName = new HashMap<>();
    private final Rock rock;
    private final Shovel shovel;

    public Inventory() {
        this.rock = new Rock();
        this.shovel = new Shovel();

        this.items.add(rock);
        this.items.add(shovel);
        this.itemsByName.put("rock", rock);
        this.itemsByName.put("shovel", shovel);
    }

    public void addItem(IInventoryItem item) {
        if (!this.inventory.contains(item)) {
            this.inventory.add(item);
        }
    }
    public void remItem(IInventoryItem item) { this.inventory.remove(item); }
    public List<IInventoryItem> getInv() { return this.inventory; }
    public void useItem(@NotNull IInventoryItem item) {
        item.use();
        if (item.consumeOnUse()) {
            this.remItem(item);
        }
    }
    public IInventoryItem getItemByName(String name) {
        if (!this.itemsByName.containsKey(name)) {
            return null;
        }
        return this.itemsByName.get(name);
    }
}
