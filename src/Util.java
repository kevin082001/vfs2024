public class Util {
    public static boolean isNumber(String s) {
        if (s == null || s.trim().isEmpty()) {
            return false;
        }

        for (char c : s.toCharArray()) {
            if (c < 48 || c > 57) {
                return false;
            }
        }

        return true;
    }
}
