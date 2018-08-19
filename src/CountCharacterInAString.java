import java.util.Scanner;

public class CountCharacterInAString {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(countCharacter(s) + " letters.");
    }

    public static int countCharacter(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            Character.isLetter(s.charAt(i));
            count++;
        }
        return count;
    }
}
