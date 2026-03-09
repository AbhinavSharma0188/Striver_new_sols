import java.util.HashMap;

public class q130_IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        if (s.length() != t.length()) {
            System.out.println("false");
            return;
        }
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverse = new HashMap<>();
        for (int i = 0; i <= s.length() - 1; i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i);
            if (map.containsKey(ch1)) {
                if (map.get(ch1) != ch2) {
                    System.out.println("false");
                    return;
                }

            } else {
                map.put(ch1, ch2);
            }
            if (reverse.containsKey(ch2)) {
                if (reverse.get(ch2) != ch1) {
                    System.out.println("false");
                    return;
                }

            } else {
                reverse.put(ch2, ch1);
            }

        }
        System.out.println("true");

    }

}
