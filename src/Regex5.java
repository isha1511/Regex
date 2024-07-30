import java.util.regex.*;
public class Regex5 {

    public static void main(String[] args) {

        // \\d any digits [0-9]
        System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)
        System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)
        System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)
        System.out.println(Pattern.matches("\\d*", "4443"));//true (digit and comes more than once)
        System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)

        // \\D any non-digit[^0-9]
        System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)
        System.out.println(Pattern.matches("\\D", "1"));//false (digit)
        System.out.println(Pattern.matches("\\D", "4443"));//false (digit)
        System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)
        System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)
        System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)

        // \\W non-word no alphanumeric
        System.out.println(Pattern.matches("\\W","@"));//true
        System.out.println(Pattern.matches("\\W","#"));//true
        System.out.println(Pattern.matches("\\W","a"));//false
        System.out.println(Pattern.matches("\\W","1"));//false
        System.out.println(Pattern.matches("\\W*","@!#"));//true

        // \\w any word alphanumeric
        System.out.println(Pattern.matches("\\w","ab"));//false
        System.out.println(Pattern.matches("\\w","12"));//false
        System.out.println(Pattern.matches("\\w","a"));//true
        System.out.println(Pattern.matches("\\w","@"));//false
        System.out.println(Pattern.matches("\\w*","AB"));//true

        // \\s whitespace char
        System.out.println(Pattern.matches("\\s"," "));//true
        System.out.println(Pattern.matches("\\s","\t"));//true
        System.out.println(Pattern.matches("\\s","a"));//false
        System.out.println(Pattern.matches("\\s","\n"));//true
        System.out.println(Pattern.matches("\\s*","\t\n"));//true

        // \\S non-whitespace char
        System.out.println(Pattern.matches("\\S"," "));//false
        System.out.println(Pattern.matches("\\S","1"));//true
        System.out.println(Pattern.matches("\\S","a"));//true
        System.out.println(Pattern.matches("\\S","\n"));//false
        System.out.println(Pattern.matches("\\S*","Ab1"));//true

        // | or
        System.out.println(Pattern.matches("a|b|c","a"));//true
        System.out.println(Pattern.matches("a|c","e"));//false

        //




    }
}
