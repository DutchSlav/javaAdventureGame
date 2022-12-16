package io.vaclst.adventure;


import io.vaclst.adventure.player.Health;
import io.vaclst.adventure.player.Inventory;
import io.vaclst.adventure.money.Job;
import io.vaclst.adventure.money.Wallet;

public class Adventure {


    public static void main(String[] args) {
        Health medSys = new Health();
        Job jobSys = new Job();
        Wallet walletSys = new Wallet();
        Inventory invSys = new Inventory();

        while (true) {
            Adventure adventure = new Adventure(medSys, jobSys, walletSys, invSys);
        }
    }

    public Adventure(Health health, Job job, Wallet wallet, Inventory inventory) {}
}
