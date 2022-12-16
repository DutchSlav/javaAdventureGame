package io.vaclst.adventure;

import io.vaclst.adventure.money.Wallet;
import io.vaclst.adventure.player.Inventory;

import java.util.Map;

public interface IShop {
    Map<java.lang.String, Double> buyable();
    void buy(IInventoryItem item, Inventory inventory, Wallet wallet);
}
