package fr.m2i;

public class Wizard extends AbstractBrawlerCharacter{
    private int mana;

    public Wizard(String name){
        setName(name);
        setHealtPoint(80);
        setMoveSpeed(350);
        this.mana = 500;
    }


    @Override
    public void attack() {
        System.out.println(String.format("Le wizard %s à %d de point de mana",this.getName(),this.mana));
    }
}
