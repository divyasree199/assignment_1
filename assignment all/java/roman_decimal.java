package Assignment;
import java.util.*;
public class roman_decimal {
    public static int roman_Decimal(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int output = 0;
        int before_value = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int cur_Value = romanValues.get(s.charAt(i));

            if (cur_Value < before_value) {
                output -= cur_Value;
            } 
            else {
                output += cur_Value;
            }
            before_value = cur_Value;
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String r_num = scanner.nextLine().toUpperCase(); // Convert input to uppercase
        System.out.println(roman_Decimal(r_num));
    }
    
}

