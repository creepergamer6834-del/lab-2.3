/*
 * REQ 01: answer both questions before you write any other code.
 *
 * 1. What does Integer.parseInt("007") + 1 evaluate to? What does
 *    "007" + 1 evaluate to? Explain why the two answers differ.
 *    Answer: 8, 007 + 1 evaluates to 0071 since 007 is a string. These differ since 007 is parsed into an int so you can do math with it. 
 *
 * 2. After Integer points = null; runs, what happens when Java runs
 *    int total = points + 5; ? Explain why.
 *    Answer: it tries to add 5 points to a null value and still results in null since you are trying to add something to a void pretty much.
 */
public class QuizScoreTester {
    public static void main(String[] args) {
        System.out.println("toDouble(\"3.5\") (expect 3.5): " + ParseTools.toDouble("3.5"));
        System.out.println("toDouble(\"-12\") (expect -12.0): " + ParseTools.toDouble("-12"));

        QuizScore score = new QuizScore("7/8");
        System.out.println(score.getPoints());
        System.out.println(score.percent());
        System.out.println(new QuizScore("x/8").percent());
        System.out.println(ParseTools.isInteger("-15"));
    }
}
