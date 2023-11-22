import java.util.Scanner;
public class Dragon {
    private boolean isDead;
    private boolean urDead;
    private int atkdmg;
    private int lvl;
    private int hp;
    private int power;
    private int myhp;
    private int myatk;
    Scanner scan = new Scanner(System.in);
    public Dragon(int atk) {
        isDead = false;
        hp = atk*11;
        lvl = 1;
        power = 1;
        atkdmg = 0;
        urDead = false;
        myhp = (int)(Math.pow(atk,2)*Math.random()*atk+1);
        myatk = atk;
    }
    public void dragonFight() {
        state();
        while (!isDead&&!urDead) {
            takeDamage(myatk);
            attack();
        }
        if (urDead){
            System.out.println("----------------------------------------------");
            System.out.println("The dragonslayer has become the dragonslayed.");
            System.out.println("u dead boi");
            System.out.println("----------------------------------------------");
        }
    }
    private void takeDamage ( int atkAmount){
        if (!isDead) {
            hp -= atkAmount;
            System.out.println("You attack for " + myatk + " hp");
            if (hp <= 0) {
                isDead = true;
                hp = 0;
                System.out.println("The dragon now has " + hp + " health");
                System.out.println("------------------------------");
                System.out.println("The dragon has been slayed!");
                System.out.println("what a stupid nerd");
                System.out.println("------------------------------");
            } else {
                System.out.println("The dragon now has " + hp + " health");
            }
        } else {
           System.out.println("The dragon is already dead!");
        }
    }
    private int attack() {
           if (!isDead){
               System.out.println("the dragon attacks for " + (power * lvl) + " hp");

            atkdmg += power * lvl;
            myhp -= power * lvl;
            if (myhp <= 0) {
                urDead = true;
            }
            if ((int) (Math.random() * 7) == 2) {
                powerUp(1);
            }
            if ((int) (Math.random() * 10) == 5) {
                powerUp(2);
            }
            if (atkdmg >= 50) {
                lvl++;
                atkdmg = 0;
                System.out.println("the dragon is now level " + lvl);
                return power * (lvl - 1);
            }
            return atkdmg;
        } else {
               return 0;
           }
    }

    private void powerUp ( int pwr){
        if (pwr == 1) {
            hp *= 2;
            System.out.println("the dragon's hp is now " + hp);
        }
        if (pwr == 2) {
            power *= 2;
            System.out.println("the dragon's strength is now " + power);
        }
    }
    private void state(){
        System.out.println("-----------------------");
        System.out.println("Dragon Health: " + hp);
        System.out.println("Dragon Attack Power: " + power*lvl);
        System.out.println("Your Health: " + myhp);
        System.out.println("Your Attack Power: " + myatk);
        System.out.println("good luck man");
        System.out.println("-----------------------");
    }
}
