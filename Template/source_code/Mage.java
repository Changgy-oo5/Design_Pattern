package pattern;

public class Mage extends Character{
    @Override
    protected void attack() {
        System.out.println("Mage attacks with magic");
    }

    @Override
    protected void useSkill() {
        System.out.println("Warrior uses Fireball");
    }
}
