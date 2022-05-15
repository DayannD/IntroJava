package fr.m2i;

public class Soldier extends AbstractBrawlerCharacter{
    private int attackDommage;

    public Soldier(String name){
        setName(name);
        setHealtPoint(120);
        setMoveSpeed(400);
        this.attackDommage = 70;
    }

    @Override
    public void attack() {
        System.out.println(String.format("Le soldat %s à %d de dommage",this.getName(),this.attackDommage));
    }
}
