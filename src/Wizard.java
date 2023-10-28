public class Wizard extends unit{
    protected int mana = 100;

    public Wizard(String name) {
        super(name);
        power = 25;
        defence = 80;
    }

    @Override
    public void attack(unit unit) {
        mana-=10;
        if(mana!=0){
            super.attack(unit);
        }
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", health=" + health +
                ", defence=" + defence +
                '}';
    }
}
