package Assignment;
import java.util.*;

public class pangram {
    public static boolean isPangram(String str) {
        Set<Character> hs = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            hs.add(c);
        }
        return hs.size() == 26;
    }    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase(); // convert to lower case
        System.out.println(isPangram(str));
    }
}
