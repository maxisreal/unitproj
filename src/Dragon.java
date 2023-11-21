public class Dragon {
    private boolean isDead;
    private int atkdmg;
    private int lvl;
    private int hp;
    private int power;
    private int myhp;
    private int myatk;

    public Dragon() {
        isDead = false;
        hp = 100;
        lvl = 1;
        power = 1;
        atkdmg = 0;
        myhp = 20;
        myatk = 3;
    }
    public void dragonFight() {
        state();
        while (!isDead) {
            takeDamage(myatk);
            attack();
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
                System.out.println("The dragon has been slayed!");
            } else {
                System.out.println("The dragon now has " + hp + " health");
            }
        } else {
            System.out.println("The dragon is already dead!");
        }
    }
    private int attack () {
        System.out.println("the dragon attacks for " + (power * lvl) + " hp");
        atkdmg += power * lvl;
        if ((int)(Math.random()*7)==2) {
            powerUp(1);
        }
        if ((int)(Math.random()*10)==5) {
            powerUp(2);
        }
        if (atkdmg >= 50) {
            lvl++;
            atkdmg = 0;
            System.out.println("the dragon is now level " + lvl);
            return power * (lvl - 1);
        }
        return atkdmg;

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
        System.out.println("Dragon Health: " + hp);
        System.out.println("Dragon Attack Power: " + atkdmg);
        System.out.println("Your Health: " + myhp);
        System.out.println("Your Attack Power: " + myatk);
        System.out.println("good luck man");
    }
}
