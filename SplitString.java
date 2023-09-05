import java.util.HashMap;
import java.util.regex.*;

public class SplitString {
    public static void main(String[] args) {
        String input = "A1B12C11D2";
        String[] parts = input.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        HashMap<Integer, Character> character = new HashMap<>();
        for (int i = 0; i < parts.length-2; i = i + 2) {
            String a = parts[i];
            Character b = a.charAt(0);
            character.put(Integer.parseInt(parts[i+1]), b);
        }
        System.out.println(character);
    }
}