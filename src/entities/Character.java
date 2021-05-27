package entities;

import java.util.ArrayList;

abstract class Character {

    private String name;
    private int hp;
    private int mana;
    private int speed;
    private int str;
    private int wis;

    //Implement with abilities
    private ArrayList<Ability> abilities;
    private ArrayList<Item> equipedItems;

    public Character(String name, int hp,int mana, int str, int wis, int speed){
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.speed = speed;
        this.str = str;
        this.wis = wis;
    }

    public abstract void use(Item item);



    //getters
    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStr() {
        return str;
    }

    public int getWis() {
        return wis;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public ArrayList<Item> getEquipedItems() {
        return equipedItems;
    }


    //Setters
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }


    //utility
    public void depleteMana(int cost){ //kor should override this
        this.mana -= cost;
    }

    public void depleteHP(int damage){
        this.hp -= damage;
    }

}
