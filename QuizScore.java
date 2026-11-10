public class QuizScore {
    private String typed;

    public QuizScore(String typed) {
        this.typed = typed;
    }

    public String getTyped() {
        return typed;
    }

    public Integer getPoints() {
        char look = '/';
        String text = "";
        for (int i = 0; i < typed.length(); i++) {
            if (typed.charAt(i) == look) {
                text = typed.substring(0, i - 1);
            }
        }
        return ParseTools.parseOrNull(text);
    }

    public Integer getOutOf() {
        int a = ParseTools.locate(typed, '/');
        int b = typed.length() - 1;
        String c = typed.substring(a + 1, b);
        return ParseTools.parseOrNull(c);
    }

    public Double percent() {
        int a = ParseTools.locate(typed, '/');
        int b = typed.length() - 1;
        String c = typed.substring(a + 1, b);
        String d = typed.substring(0, a - 1);
        Double ans = 0.0;
        if ((ParseTools.parseOrNull(c).equals(null)) || (ParseTools.parseOrNull(d).equals(null))) {
            return null;
        } else {
            double e = Double.parseDouble(c);
            double f = Double.parseDouble(d);
            ans = e / f;
        }
        return ans;
    }

    public boolean isPerfect() {
        if ((percent() == null)) {
            return false;
        } else if (percent() != 1) {
            return false;
        } else {
            return true;
        }
    }
}
