package org.example;

// Weapon enum'ı
public enum Weapon {
    SWORD(10, 1.5), // Örnek bir silah
    AXE(15, 1.2),   // Başka bir silah
    BOW(8, 2.0);    // Bir ok

    private final int damage;
    private final double attackSpeed;

    // Weapon enum constructor
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    // Getter metodları
    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
