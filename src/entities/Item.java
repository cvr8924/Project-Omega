package entities;

abstract class Item {

    private String name;

    public Item(String name){
        this.name = name;
    }

    abstract void korUse();
    abstract void lyrUse();
    abstract void imeUse();
}
