public class ParseTools {
    public static double toDouble(String text) {
        double a = Double.parseDouble(text);
        return a;
    }

    public static String describeChar(char value) {
        if (Character.isDigit(value)) {
            return "digit";
        } else if (Character.isLetter(value)) {
            return "letter";
        } else {
            return "other";
        }
    }

    public static boolean isInteger(String text) {
        if (text == null) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (((i == 0) && (!Character.isDigit(current))) || ((i == 0) && !(current == '-'))) {
                return false;
            }
            if (!(Character.isDigit(current))) {
                return false;
            }
        }
        return true;
    }

    public static Integer parseOrNull(String text) {
        if (isInteger(text)) {
            return Integer.parseInt(text);
        } else {
            return null;
        }
    }

    public static int locate(String text, char target) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                return i;
            }
        }
        return 0;
    }
}
