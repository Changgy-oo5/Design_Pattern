package pattern;

public abstract class Character {
    public final void takeTurn(){
        startTurn();
        attack();
        useSkill();
        endTurn();
    }

    private void startTurn(){
        System.out.println("start");
    }

    private void endTurn(){
        System.out.println("end");
    }

    protected abstract void attack();
    protected abstract void useSkill();
}
