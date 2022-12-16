package io.vaclst.adventure.money;

public class Wallet {
    private double cash;

    public Wallet() {
        this.cash = 0.0;
    }
    public double getCash() { return this.cash; }
    public void addCash(double cash) { this.cash = cash; }
    public void remCash(double cash) {
        if (this.cash > 0.0) {
            this.cash = this.cash - cash;
        }
    }
}
