package entities;

public class Lyr extends Character {

    public Lyr(){
        super("Lyr",10,15,5,15,10,10,1);
    }

    @Override
    public void use(Item item) {
        item.lyrUse();
    }
}
