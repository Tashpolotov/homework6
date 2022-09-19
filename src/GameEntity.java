public class GameEntity {
    private int hp;
    private int damage;

    private String weaponType;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String printlninfo() {
        return "Jizn': " + this.hp + " uron: " + this.damage;
    }

    }


