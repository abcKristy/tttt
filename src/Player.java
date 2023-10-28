public class Player extends unit{

    protected String choice;
    public Player(String name) {
        super(name);
        char choice;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name=" + name +
                ", choice='" + choice + '\'' +
                '}';
    }
}
