public class QuizScore {
    private String typed;

    public QuizScore(String typed) {
        this.typed = typed;
    }

    public String getTyped() {
        return typed;
    }

    public Integer getPoints() {
        int slashIndex = typed.indexOf('/');
        if (slashIndex == -1) {
            return null;
        }
        return ParseTools.parseOrNull(typed.substring(0, slashIndex));
    }

    public Integer getOutOf() {
        int slashIndex = typed.indexOf('/');
        if (slashIndex == -1 || slashIndex == typed.length() - 1) {
            return null;
        }
        return ParseTools.parseOrNull(typed.substring(slashIndex + 1));
    }

    public Double percent() {
        Integer points = getPoints();
        Integer outOf = getOutOf();
        if (points == null || outOf == null || outOf == 0) {
            return null;
        }
        return (double) points * 100.0 / outOf;
    }

    public boolean isPerfect() {
        Double p = percent();
        if (p == null) {
            return false;
        }
        return p == 100.0;
    }

    public boolean sameScoreAs(QuizScore other) {
        if (other == null) {
            return false;
        }
        Integer p1 = this.getPoints();
        Integer t1 = this.getOutOf();
        Integer p2 = other.getPoints();
        Integer t2 = other.getOutOf();

        if (p1 == null || t1 == null || p2 == null || t2 == null) {
            return false;
        }
        return p1.equals(p2) && t1.equals(t2);
    }
}