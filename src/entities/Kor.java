package entities;

public class Kor extends PlayerCharacter{


    public Kor(){
        super("Kor",10,0,10,20,5, 15,1);
    }


    @Override
    public void use(Item item) {
        item.korUse();
    }

    @Override
    public void setMana(int mana) {
        super.setHp(mana);
    }

    @Override
    public void depleteMana(int cost) {
        super.depleteHP(cost);
    }

    @Override
    public void consolePrint() {
        System.out.println(getName() + ", Level " + getLevel());
        System.out.println("______________");
        System.out.println("HP: "+getHp());
        System.out.println("Mana: N/A");
        System.out.println("Strength: " + getStr());
        System.out.println("Magic: " +getWis());
        System.out.println("Speed: "+ getSpeed());
        System.out.println("Defense: " + getDef());
    }
}
