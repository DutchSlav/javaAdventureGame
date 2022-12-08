package io.vaclst.adventure;

public class Wallet {
    private double money;

    public Wallet() {
        this.money = 0;
    }
    public double getCash() { return this.money; }
    public void addCash(double cash) { this.money = this.money + cash; }
    public void remCash(double cash) { this.money = this.money - cash; }
}
