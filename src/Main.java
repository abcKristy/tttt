
public class Main {
    public static void main(String[] args) {
        unit unit1 =new unit("Slava");
        unit unit2 =new unit("Kosty");
        unit1.print();
        unit1.print("value og gg: ");

        Wizard wizard1 =new Wizard("Oleggga");
        Wizard wizard2 = new Wizard("Kkkirucha");
        wizard1.attack(wizard2);
        System.out.println(wizard1);
        wizard2.attack(wizard1);
        System.out.println(wizard1);
        System.out.println(Game.CountOfPlayers);
    }
}
