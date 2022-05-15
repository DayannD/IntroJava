package fr.m2i;

public abstract class AbstractBrawlerCharacter {
    private String name;
    private int healtPoint;
    private int moveSpeed;

    public void setName(String name) {
        this.name = name;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public abstract void attack();

    public void speak(String talk){
        System.out.println("Bonjour je suis un personnage");
    }

    public void move(){

    }

    public void setHealtPoint(int healtPoint) {
        this.healtPoint = healtPoint;
    }

    public String getName() {
        return name;
    }

    public int getHealtPoint() {
        return healtPoint;
    }
}
