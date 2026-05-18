package pattern;

public class Varrior extends Character{
    @Override
    protected void attack() {
        System.out.println("Varrior attacks with sword");
    }

    @Override
    protected void useSkill() {
        System.out.println("Warrior uses Acceleration");
    }
}
