import java.util.Scanner;

public class Scenary {
    public static void sc() {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello! Whats your name?");
        String name = in.nextLine();
        Player pl1 = new Player(name);
        System.out.println("What character do you prefer? w-wisard or k-knigth?");
        String chc = in.nextLine();
        Player choice = new Player(chc);
        System.out.println("Your characteristic:"+);
    }
    public static void sc1(String[] args) {
        /*unit unit1 =new unit("Slava");
        unit unit2 =new unit("Kosty");
        unit1.pstat();
        unit1.pstat("value og gg: ");

        Wizard wizard1 =new Wizard("Oleggga");
        Wizard wizard2 = new Wizard("Kkkirucha");
        wizard1.attack(wizard2);
        System.out.println(wizard1);
        wizard2.attack(wizard1);
        System.out.println(wizard1);
        System.out.println(Game.CountOfPlayers);*/
    }
}
