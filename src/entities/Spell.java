package entities;

abstract class Spell extends Ability {

    private int cost;

    public Spell(String name, int damage , int heal, Character user, int cost){
        super(name,damage,heal,user);
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    @Override
    boolean payPrice() {
        if (this.user.getMana() > 0) {
            this.user.depleteMana(this.cost);
            return true;
        }
        else {
            return false;
        }
    }
}
