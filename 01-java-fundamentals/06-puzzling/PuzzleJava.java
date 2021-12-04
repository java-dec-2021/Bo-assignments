import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    Random rn = new Random();

    public void getTenRolls() {
        for (int randNum = 0; randNum < 10; randNum++) {
            int num = rn.nextInt(20) + 1;
            System.out.println(num);
        }
    }

    public void getRandomLetter() {
        int randNum = rn.nextInt(27);
        ArrayList<Character> letter = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            letter.add(ch);
        }
        System.out.println(letter);
        System.out.println(letter.get(randNum));
    }

    public String generatePassword() {
        // int randNum = rn.nextInt(27);
        ArrayList<Character> letter = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            letter.add(ch);
        }
        String password = "";

        for(int i = 0; i < 8; i++) {
            int randNum = rn.nextInt(27);
            password += letter.get(randNum);
        }
        return password;
    }

    public String getNewPasswordSet(int i) {
        
        ArrayList<Character> letter = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            letter.add(ch);
        }
        String password = "";

        for(int j = 0; j < i; j++) {
            int randNum = rn.nextInt(27);
            password += letter.get(randNum);
        }
        return password;
    }


}











