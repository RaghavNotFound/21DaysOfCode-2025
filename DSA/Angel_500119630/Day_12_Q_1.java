public class Day_12_Q_1 {
    public static void main(String[] args) {
        System.out.println(isRotated("abcde", "cdeab"));
    }
    public static boolean isRotated(String s, String t){
        if(s.length() != t.length())return false;

        String concatenated = s + t;
        return concatenated.contains(t);
    }
}
