public class StringLoops {
    public StringLoops() { }
    public int countCharacters(String character, String searchString) {
        int bl = 0;
        for (int i = 0; i<searchString.length(); i++){
            String a = searchString.substring(i, i+1);
            a = a.toLowerCase();
            character = character.toLowerCase();
            if (a.compareTo(character)==0){
                bl++;
            }
        }
        return bl;
    }
    public String reverseString(String origString) {
        String str = "";
        for (int i = origString.length(); i!=0; i--){
            str+=origString.substring(i-1, i);
        }
        return str;
    }
    public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
        String str = "";
        int i = 0;
        while (i<origStr.length()){
            if (origStr.substring(i, i+1).compareTo(searchChar)!=0) {
                str += origStr.substring(i, i+1);
            } else {
                str += replaceChar;
            }
            i++;
        }
        return str;
    }
    public int countString(String searchString, String origString) {
        int num = 0;
        int a = origString.length();
        for (int i = 0; i<a; i++) {
            if (origString.contains(searchString)){
                num++;
                origString = origString.substring(origString.indexOf(searchString)+1);
            }
        }
        return num;
    }
    public String removeString(String searchString, String origString) {
        int idx = origString.indexOf(searchString);
        while (idx != -1) {
            origString = origString.substring(0, idx) + origString.substring(idx + searchString.length());
            idx = origString.indexOf(searchString);
        }
        return origString;
    }
    public boolean isPalindrome(String myString) {
        myString = removeString(" ", myString);
        return reverseString(myString).equals(myString);
    }
    //prints palindrome w/ user input num of times back to front with the last letters bledning
    public void multiPrint(String toPrint, int num) {
        System.out.print("[");
        String orig = toPrint.substring(0, 1);
        if (num>1&&toPrint.length()>1) {
            toPrint = reverseString(toPrint.substring(1));
        }
        for (int i = 1; i <= num; i++) {
            System.out.print(toPrint);
        }
        if (num>1&&toPrint.length()>1) {
            System.out.print(orig);
        }
        System.out.println("]");
    }
}


