public class Main {
    public static void main(String[] args) {
        System.out.println("---Boss---");
        Boss boss = new Boss();
        boss.setHp(50);
        boss.setDamage(25);
        boss.weapon.setWeaponName("kalash");
        boss.weapon.setWeaponType("Boevoi");

                System.out.println(boss.printlninfo());
        System.out.println("----Skeleton1------");
                Skeleton skeleton = new Skeleton();
                skeleton.setDamage(20);
                skeleton.setHp(50);
                skeleton.weapon.setWeaponName("makarov");
                skeleton.weapon.setWeaponType("boeboi");
        System.out.println(skeleton.printlninfo());
        System.out.println("-----Skeleton2------");
                Skeleton skeleton1 = new Skeleton();
                skeleton1.setDamage(38);
                skeleton1.setHp(80);
                skeleton1.weapon.setWeaponType("Xolodnoe");
                skeleton1.weapon.setWeaponName("Noj");
        System.out.println(skeleton1.printlninfo());

    }
}