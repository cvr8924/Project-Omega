package entities;

abstract class PlayerCharacter extends Character {

    public PlayerCharacter(String name, int hp,int mana, int str, int wis, int def, int speed, int level){
        super(name,hp,mana,str,wis,def,speed,level);
    }

    public abstract void use(Item item);
}
