package neet_code;

import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        System.out.println(isAnagram("pratyay", "yayprat"));
    }

    public static boolean isAnagram(String s, String t) {

        Set<String> str1 = new HashSet<>();
        Set<String> str2 = new HashSet<>();

        char[] c1 = s.toCharArray();

        Arrays.sort(s.toCharArray());

        str1 = Collections.singleton(s);
        char[] c2 = t.toCharArray();
        Arrays.sort(c2);

        if (String.valueOf(c1).equals(String.valueOf(c2))) {
            return true;
        }
        return false;
    }
}
