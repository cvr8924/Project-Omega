package entities;

abstract class Skill extends Ability {

    private int uses;

    public Skill(String name, int damage , int heal, Character user, int uses){
        super(name,damage,heal,user);
        this.uses = uses;
    }

    public void setUses(int uses) {
        this.uses = uses;
    }

    public int getUses() {
        return uses;
    }

    @Override
    boolean payPrice() {
        if (this.uses >= 0){
            this.uses--;
            return true;
        }
        else{
            return false
        }
    }

}
