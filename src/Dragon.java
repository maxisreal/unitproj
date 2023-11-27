/**
 * This class makes you fight a dragon
 *
 * @author maxwilliamson
 */
public class Dragon {
    /** if dragon is dead */
    private boolean isDead;
    /** if u is dead */
    private boolean urDead;
    /** dragon attack */
    private int atkdmg;
    /** dragon level */
    private int lvl;
    /** dragon health */
    private int hp;
    /** dragon strength */
    private int power;
    /** player health */
    private int myhp;
    /** player attack */
    private int myatk;
/**
 * Instantiates a dragon.
 *
 * @param atk the attack
 */
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
    /**
     * void method that keeps the fight going until someone dies
     * <p>
     * PRECONDITION: neither side is dead when the fight starts
     *
     */
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
    /**
     * private void method that damages the dragon and prints a death message if it's dead
     *
     * @param atkAmount atkamount
     */
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
    /**
     * private int method that returns the dragon's attack and levels it up randomly
     * @return dragon's attack damage
     */
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
    /**
     * private helper method that powers up the dragon if attack() outputs powerUp()
     *
     * @param pwr whether the hp or power of dragon should increase (1 or 2)
     */

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
    /**
     * private helper method that prints the dragon and your stats
     */
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
