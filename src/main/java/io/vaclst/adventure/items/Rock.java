package io.vaclst.adventure.items;

import io.vaclst.adventure.IInventoryItem;

public class Rock implements IInventoryItem {
    public void use() {
        System.out.println("What are you gonna do with that rock?\nKill someone?");
    }

    @Override
    public boolean consumeOnUse() {
        return true;
    }
}
