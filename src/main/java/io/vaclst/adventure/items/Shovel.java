package io.vaclst.adventure.items;

import io.vaclst.adventure.IInventoryItem;

public class Shovel implements IInventoryItem {
    @Override
    public void use() {
        System.out.println("You killed someone with a shovel...");
        System.out.println("Congratulations I guess?");
        try {
            wait(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Oh yeah, the police took your shovel.");
    }

    @Override
    public boolean consumeOnUse() {
        return true;
    }
}
