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
        if (text == null || text.isEmpty()) {
            return false;
        }
        int start = 0;
        if (text.charAt(0) == '-') {
            if (text.length() == 1) {
                return false;
            }
            start = 1;
        }
        for (int i = start; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
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
        return -1;
    }

    public static boolean isDecimal(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        int i = 0;
        if (text.charAt(0) == '-') {
            i++;
        }

        if (i >= text.length() || !Character.isDigit(text.charAt(i))) {
            return false;
        }

        int dotCount = 0;
        for (; i < text.length(); i++) {
            char current = text.charAt(i);
            if (Character.isDigit(current)) {
                continue;
            } else if (current == '.') {
                dotCount++;
                if (dotCount > 1) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}