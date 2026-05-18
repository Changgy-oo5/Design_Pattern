package pattern;

public class Archer extends Character{
    @Override
    protected void attack() {
        System.out.println("Archer attacks with bow and arrows");
    }

    @Override
    protected void useSkill() {
        System.out.println("Warrior uses Rain of Arrows");
    }
}
