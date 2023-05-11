package NO1;

abstract class Character {
    String name;
    int attackPower;

    public Character(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    abstract int attack();

    abstract int attack(String attackType);
}