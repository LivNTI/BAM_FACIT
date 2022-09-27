public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Monster myMonster = new Monster("baddy",100);
        myMonster.punched(20);
        System.out.print(myMonster.getName()+" now has "+myMonster.getHp()+" hp");

    }
}