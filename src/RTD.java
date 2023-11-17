public class RTD {
    private String a = "abcdefghijklmnopqrstuvwxyz";
    //lenght is 25
    public RTD(){}
    private int findValid(String input){
        input = input.substring(0, 1);
        if (a.contains(input)){
            return a.indexOf(input);
        } else {
            return -1;
        }
    }
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
        }
    }
}
