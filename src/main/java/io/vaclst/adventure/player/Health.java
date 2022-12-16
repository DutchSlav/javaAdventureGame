package io.vaclst.adventure.player;

public class Health {
    private double hp;
    private double maxHP;

    public Health() {
        this.maxHP = 100.0;
        this.hp = this.maxHP;
    }
    public double getHP() { return this.hp; }
    public void addHP(double hp) {
        if (this.hp > 0.0) {
            this.hp = this.hp + hp;
        } else {
            this.die();
        }
    }
    public void remHP(double hp) { this.hp = this.hp - hp; }
    public void die() {
        System.out.println("You died!");
        System.exit(0);
    }
}
