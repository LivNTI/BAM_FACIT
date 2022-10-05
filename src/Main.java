import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("hej");
        Monster myMonster = new Monster("baddy", 100);
        myMonster.punched(20);
        System.out.print(myMonster.getName() + " now has " + myMonster.getHp() + " hp");

        //Paint
        JFrame frame = new JFrame("draw dot");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel myPanel = new MyPanel();
        frame.getContentPane().add(myPanel);
        frame.pack();
        frame.setVisible(true);

    }
}