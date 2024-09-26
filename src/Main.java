import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println();
        System.out.println("Let's get ready to rumble!");
        System.out.println();

        Characters p1 = new Characters();
        p1.hp = 100;
        p1.attackPoint = -10;


        Characters p2 = new Characters();
        p2.hp = 100;
        p2.attackPoint = -10;

        while (p1.hp > 0 && p2.hp > 0) {
            System.out.println("Player 1 har " + p1.hp + " hp");
            System.out.println("Player 2 har " + p2.hp + " hp");
            System.out.println("Vad vill du göra?");
            System.out.println("1. Attackera");
            System.out.println("2. Vänta(öka skada)");
            System.out.println("3. Heala");
            System.out.println();
            int choice = sc.nextInt();
            if (choice == 1) {
                p2.changeHP(p1.attackPoint);
                System.out.println("Player 1 gör " + p1.attackPoint * -1 + " skada");
                System.out.println();
            } else if (choice == 2) {
                p1.attackPoint -= 3;
                System.out.println("Player 1 ökade sin skada till " + p1.attackPoint * -1);
                System.out.println();
            } else if (choice == 3) {
                p1.changeHP(20);
                System.out.println("Player 1 återhämtade sig med 20 hp");
                System.out.println();
            } else {
                continue;
            }
            choice = rand.nextInt(3);
            choice++;
            if (choice == 1) {
                p1.changeHP(p2.attackPoint);
                System.out.println("Player 2 gör " + p2.attackPoint * -1 + " skada");
                System.out.println();
            } else if (choice == 2) {
                p2.attackPoint -= 3;
                System.out.println("Player 2 ökade sin skada till " + p2.attackPoint * -1);
                System.out.println();
            } else if (choice == 3) {
                p2.changeHP(20);
                System.out.println("Player 2 återhämtade sig med 20 hp");
                System.out.println();
            }
        }

        if (p1.hp > 0){
            System.out.println("Player 1 vinner med " + p1.hp + " hp kvar!");
        }

        else if (p2.hp > 0){
            System.out.println("Player 2 vinner med " + p2.hp + " hp kvar!");
        }

        else{
            System.out.println("Båda spelarna begick sepuku och det blev lika.");
        }
    }
}