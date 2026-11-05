/*
 * REQ 01: answer both questions before you write any other code.
 *
 * 1. What does Integer.parseInt("007") + 1 evaluate to? What does
 *    "007" + 1 evaluate to? Explain why the two answers differ.
 *    Answer: 8, 
 *
 * 2. After Integer points = null; runs, what happens when Java runs
 *    int total = points + 5; ? Explain why.
 *    Answer:
 */
public class QuizScoreTester {
    public static void main(String[] args) {
        System.out.println("toDouble(\"3.5\") (expect 3.5): " + ParseTools.toDouble("3.5"));
        System.out.println("toDouble(\"-12\") (expect -12.0): " + ParseTools.toDouble("-12"));
    }
}
