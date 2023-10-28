public class unit {
    protected String name;
    protected int health =100;
    protected int defence =100;
    protected int power =10;

    protected float critchance =0.1f;
    protected float parrychance =0.1f;

    public unit(String name) {
        Game.CountOfPlayers++;
        this.name=name;
    }

    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health=health;
    }

    public int getDefence() {
        return defence;
    }
    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public float getCritchance() {
        return critchance;
    }
    public void setCritchance(float critchance) {
        this.critchance = critchance;
    }

    public float getParrychance() {
        return parrychance;
    }
    public void setParrychance(float parrychance) {
        this.parrychance = parrychance;
    }

    public void attack(unit unit){
        unit.getDamage(power);
    }
    public void getDamage(int damage){
        this.health-=damage;
    }

    @Override
    public String toString() {
        return "unit{" +
                "health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }
    public void print(){
        System.out.println(this);
    }
    public void print(String str){
        System.out.println(str+this);
    }


}
