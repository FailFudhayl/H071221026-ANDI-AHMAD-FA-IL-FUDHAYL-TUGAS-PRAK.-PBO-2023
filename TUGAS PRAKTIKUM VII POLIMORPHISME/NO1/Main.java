package NO1;

public class Main {
    public static void main(String[] args) {
        Fighter martis = new Fighter("Martis", 75);
        Mage cyclops = new Mage("Cyclops", 25);
        Fighter alucard = new Fighter("Alucard", 65);
        Fighter balmond = new Fighter("Balmond", 70);
        Mage odete = new Mage("Odette", 90);

        Character[] hero = new Character[5];
        hero[0] = martis;
        hero[1] = cyclops;
        hero[2] = alucard;
        hero[3] = balmond;
        hero[4] = odete;

        for (Character i : hero) {
            Main.printAttack(i);
            System.out.println(" ");
        }
    }

    public static void printAttack(Character character) {
        System.out.println("NAME : " + character.getName());
        System.out.println("ATTACK INFORMATION :");
        System.out.println("Attack Power = " + character.attack());
        if (character instanceof Fighter) {
            System.out.println("Melee = " + character.attack("melee"));
            System.out.println("Ranged = " + character.attack("ranged"));
        } else if (character instanceof Mage) {
            System.out.println("Frost = " + character.attack("frost"));
            System.out.println("Fire = " + character.attack("fire"));
        }
    }

}
