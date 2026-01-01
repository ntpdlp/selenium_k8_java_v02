package lab_02_DataType;

public class CharacterRunner {
    private static char ch;

    public CharacterRunner(char ch){
        this.ch = ch;
    }

    public boolean isVowel(){
        char[] vowels = {'a','e','i','o','u', 'A','E','I','O','U'};
        boolean isVowelResult = false;
        for(int i = 0; i< vowels.length; i++){
            if(ch == vowels[i]){
                isVowelResult = true;
                break;
            }
        }
        return isVowelResult;
    }


    public boolean isNumber(){
        char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        boolean flag = false;
        for(int i = 0; i<numbers.length; i++){
            if(ch == numbers[i]){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void printUpperCaseAlphabet(){
        if((ch >= 97) && (ch <= 122)) {
            ch -= 32;
            System.out.println(ch + " upper case");
        }
        else if ((ch >=65) && (ch <= 90)){
            System.out.println(ch);
        }
    }


    public static void printUpperCaseAlphabets(){
        for(ch='A'; ch<='Z'; ch++){
            System.out.printf("%c\t",ch);
        }
        System.out.println();
    }


    public static void printLowerCaseAlphabets(){
        for(ch=97; ch<=122; ch++){
            System.out.printf("%c\t",ch);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "CharacterRunner{" +
                "ch=" + ch +
                '}';
    }

    public static void main(String[] args) {
        CharacterRunner myChari = new CharacterRunner('i');
        System.out.println(myChari.toString() + " is vowel: " + myChari.isVowel());

        CharacterRunner myCharc = new CharacterRunner('c');
        System.out.println(myCharc.toString() + " is vowel: " + myCharc.isVowel());

        CharacterRunner myChar2 = new CharacterRunner('2');
        System.out.println(myChar2.toString() + " is number: " + myChar2.isNumber());

        CharacterRunner myCharz = new CharacterRunner('z');
        printUpperCaseAlphabet();
        CharacterRunner myCharZ = new CharacterRunner('Z');
        printUpperCaseAlphabet();

        printUpperCaseAlphabets();
        printLowerCaseAlphabets();
    }
}
