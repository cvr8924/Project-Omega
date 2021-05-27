package entities;

public class Ime extends Character{

    public Ime(){
        super("Ime",15,5,15,10,15,5,1);
    }

    @Override
    public void use(Item item) {
        item.imeUse();
    }
}
