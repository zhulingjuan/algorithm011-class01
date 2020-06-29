import java.lang.reflect.Array;
import java.util.Arrays;

public class 有效的字母异位词 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

        boolean isAnagram = isAnagram(s, t);
        System.out.println(isAnagram);
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() !=  t.length()){
            return false;
        }
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();
        Arrays.sort(s_array);
        Arrays.sort(t_array);

        String s1 = Arrays.toString(s_array);
        String s2 = Arrays.toString(t_array);
        if (s1.equals(s2)){
            return true;
        }else {
            return false;
        }
    }
}
