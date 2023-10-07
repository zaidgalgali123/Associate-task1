import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        boolean isPangram = isPangram(sentence);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetSet.add(c);
        }

        for (char c : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.remove(c);
            }
        }

        return alphabetSet.isEmpty();
    }
}
