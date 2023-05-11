package NO1;

public class Mage extends Character {

    public Mage(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    int attack() {
        return attackPower;
    }

    @Override
    int attack(String attackType) {
        int atk = attackPower;
        if (attackType.equals("frost")) {
            atk = attackPower * 2;
        } else if (attackType.equals("fire")) {
            atk = attackPower * 3;
        }

        return atk;
    }

}
