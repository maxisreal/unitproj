import java.util.Scanner;
public class RTD {
    Scanner scan = new Scanner(System.in);
    private final String a;
    private final String confirm;

    public RTD() {
        a = "abcdefghijklmnopqrstuvwxyz";
        confirm = "r";
        //lenght is 25
    }

    public RTD(String b) {
        confirm = b;
        a = "abcdefghijklmnopqrstuvwxyz";
    }

    private int findValid(String input) {
        input = input.substring(0, 1);
        if (a.contains(input)) {
            return a.indexOf(input) + 1;
        } else {
            return (int) (Math.random() * a.length() + 1);
        }
    }

    public boolean findValid() {
        return confirm.equals("r");
    }

    //initialize returns a different thing for each letter of the alphabet
    public void initialize(String input) {
        if (findValid(input) == 1) {
            //if user inputs a
            for (int i = 1; i < a.length(); i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("a");
                }
                System.out.println("a ");
            }
        }
        if (findValid(input) == 2) {
            System.out.println("bubblegum, bubblegum, in a pot");
            System.out.println("let it flow and watch it pop");
            System.out.println("...");
        }
        if (findValid(input) == 3) {
            System.out.println("chicken");
        }
        if (findValid(input) == 4) {
            System.out.println("now you fight dragon");
            System.out.print("Enter your attack power: ");
            Dragon dragon = new Dragon(scan.nextInt());
            dragon.dragonFight();
        }
        if (findValid(input) == 5) {
            StringLoops str = new StringLoops();
            System.out.print("Enter a palindrome: ");
            String palin = scan.nextLine();
            while (!str.isPalindrome(palin)) {
                System.out.print("No, a palindrome: ");
                palin = scan.nextLine();
                scan.nextLine();
            }
            System.out.println("nice");
            System.out.print("now put how many times it prints: ");
            str.multiPrint(palin, scan.nextInt());
        }
        if (findValid(input) == 6) {
            System.out.println("Your flashlight sputters to life reluctantly. It doesn't");
            System.out.println("provide much illumination, but in this cave it's better than nothing.");
            System.out.println("In the dim light, you spy the bones of Bones Malone. You are rattled.");
            System.out.println("Then the skeleton appears.");
        }
        if (findValid(input) == 7) {
            for (int i = 1; i < a.length(); i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("g");
                }
                System.out.println("g ");
            }
        }
        if (findValid(input) == 8) {
            System.out.println("damn im hungry. i could go for a barbeque bacon burger,");
            System.out.println("large order of fries, orange soda with no ice, and a piece");
            System.out.println("of hot apple pie.");
        }
        if (findValid(input) == 9) {
            System.out.println("i've got my i on u");
            System.out.println("that was horrible i'm sorry");
        }
        if (findValid(input) == 10) {
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
            System.out.println("& _______________________ &");
            System.out.println("& | AMPERSAND JUMPSCARE | &");
            System.out.println("& |_____________________| &");
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        }
        if (findValid(input) == 11 || findValid(input) == 15) {
            if (findValid(input) == 15) {
                System.out.println("o");
                System.out.println("oj");
            }
            if (findValid(input) == 11) {
                System.out.println("k");
            }
            System.out.println("ok");
            System.out.println("okay");
            System.out.println("olright");
            System.out.println("olrighty");
            System.out.println("olmighty");
            System.out.println("affirmation");
            System.out.println("olives ok?");
            System.out.println("oak");
            System.out.println("ogey");
            if (findValid(input) == 15) {
                System.out.println("oh");
                System.out.println("o");
            }
        }
        if (findValid(input) == 12) {
            for (int i = 1; i < a.length(); i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("l");
                }
                System.out.println("l ");
            }
        }
        if (findValid(input) == 13) {
            System.out.println("This output is dedicated to Munim Ali,");
            System.out.println("because it's his favorite letter of the alphabet.");
            System.out.println("He told me.");
            System.out.println("also his name starts with an m and i thought that was funny");
        }
        if (findValid(input) == 14) {
            System.out.println("NINE NINE!");
        }
        if (findValid(input) == 16) {
            for (int i = 1; i < a.length(); i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("p");
                }
                System.out.println("p ");
            }
        }
        if (findValid(input) == 17) {
            System.out.print("you're happy, right? ");
            if (scan.nextLine().substring(0, 1).toLowerCase().equals("y")) {
                System.out.println("alright.");
            } else {
                System.out.println("okay.");
            }
        }
        if (findValid(input) == 18) {
            System.out.println("Restarting...");
        }
        if (findValid(input) == 19) {
            System.out.println("ssssssssss");
            System.out.println("immmm a ssssnssaaakkeeeee");
            System.out.println("howww many dice triesssss until sssnake eyesssss?");
            System.out.print("youuuu guesssss... ");
            int a = scan.nextInt();
            scan.nextLine();
            int dice1 = 0;
            int dice2 = 1;
            int roll = 1;
            while (dice1 != 1 || dice2 != 1) {
                dice1 = (int) (Math.random() * 6) + 1;
                dice2 = (int) (Math.random() * 6) + 1;
                System.out.println(dice1 + " & " + dice2);
                roll++;
            }
            System.out.println("finally, sssssssnake eyessssssss!");
            System.out.println("it took " + roll + " triesssss");
            if (roll == a) {
                System.out.println("ssssseemsssss you were right");
            } else {
                System.out.println("hahah you guessssed wrong looossssseeer");
            }
        }
        if (findValid(input) == 20) {
            System.out.println("terrible terry ties his toes");
        }
        if (findValid(input) == 23) {
            System.out.println("W");
        }
        if (findValid(input) == 24) {
            System.out.println("xdddd");
        }
        if (findValid(input) == 26) {
            for (int i = 1; i < a.length(); i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("z");
                }
                System.out.println("z ");
            }
        }
    }
}



