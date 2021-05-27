package entities;

abstract class Ability {
    protected Character user;
    protected String name;
    protected int damage;
    protected int heal;

    public Ability(String name, int damage , int heal, Character user){
        this.name = name;
        this.damage = damage;
        this.heal = heal;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHeal() {
        return heal;
    }

    abstract boolean payPrice();
}
