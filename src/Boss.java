public class Boss extends GameEntity {

    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printlninfo() {
        return super.printlninfo() + " nameWeapon: " + weapon.getWeaponName() + " typeWeapon: " +
                weapon.getWeaponType();
    }
}
