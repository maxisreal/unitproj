public class RTD {
    private final String a;
    private final String confirm;
    public RTD() {
        a = "abcdefghijklmnopqrstuvwxyz";
        confirm = "r";
        //lenght is 25
    }
    public RTD(String b){
        confirm = b;
        a = "abcdefghijklmnopqrstuvwxyz";
    }
    private int findValid(String input){
        input = input.substring(0, 1);
        if (a.contains(input)){
            return a.indexOf(input);
        } else {
            return (int)(Math.random()*a.length()+1);
        }
    }
    public boolean findValid(){
        return confirm.equals("r");
    }
    //initialize returns a different thing for each letter of the alphabet
    public void initialize(String input){
        if (findValid(input)==0){
            //if user inputs a
            for (int i = 1; i<a.length(); i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("a");
                }
                System.out.println("a ");
            }
        } else if (findValid(input)==10||findValid(input)==14){
            if (findValid(input)==14) {
                System.out.println("o");
                System.out.println("oj");
            }
            if (findValid(input)==10) {
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
            if (findValid(input)==14) {
                System.out.println("oh");
                System.out.println("o");
            }
        } else if (findValid(input)==17){
            System.out.println("Restarting...");
        } else if (findValid(input)==22){
            System.out.println("W");
        } else if (findValid(input)==25){
            for (int i = 1; i<a.length(); i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("z");
                }
                System.out.println("z ");
            }
        }
         else if (findValid(input)==23){
            System.out.println("xdddd");
        }
        else if (findValid(input)==5){
            System.out.println("Your flashlight sputters to life reluctantly. It doesn't");
            System.out.println("provide much illumination, but in this cave it's better than nothing.");
            System.out.println("In the dim light, you spy the bones of Bones Malone. You are rattled.");
            System.out.println("Then the skeleton appears.");
        }
        else if (findValid(input)==6){
            for (int i = 1; i<a.length(); i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("g");
                }
                System.out.println("g ");
            }
        } else if (findValid(input)==1){
            System.out.println("bubblegum, bubblegum, in a pot");
            System.out.println("let it flow and watch it pop");
            System.out.println("...");
        } else if (findValid(input)==7){
            System.out.println("damn im hungry. i could go for a barbeque bacon burger,");
            System.out.println("large order of fries, orange soda with no ice, and a piece");
            System.out.println("of hot apple pie.");
        } else if (findValid(input)==2){
            System.out.println("chicken");
        } else if (findValid(input)==12){
            System.out.println("This output is dedicated to Munim Ali,");
            System.out.println("because it's his favorite letter of the alphabet.");
            System.out.println("He told me.");
            System.out.println("also his name starts with an m and i thought that was funny");
        } else if (findValid(input)==4){
            System.out.println("It's time for egg delivery!");
            System.out.println("Can you deliver 60 eggs?");
        } else if (findValid(input)==3){
            System.out.println("now you fight dragon");
            Dragon dragon = new Dragon();
            dragon.dragonFight();
        }
    }
}
