package NO1;

public class Fighter extends Character {

    public Fighter(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    int attack() {
        return attackPower;
    }

    @Override
    int attack(String attackType) {
        int atk = attackPower;
        if (attackType.equals("melee")) {
            atk = attackPower * 2;
        } else if (attackType.equals("ranged")) {
            atk = attackPower;
        }
        return atk;
    }
}
