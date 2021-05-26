package heirarchy;

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


    public Character(String name, int hp,int mana, int str, int wis, int speed){
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.speed = speed;
        this.str = str;
        this.wis = wis;
    }

    public abstract void use(Item item);



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

}
