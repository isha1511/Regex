import java.util.regex.*;
public class Regex3 {

    public static void main(String[] args) {

        System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)
        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)
        System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)


        System.out.println(Pattern.matches("[^abc]","e"));//true (char other than abc)
        System.out.println(Pattern.matches("[^abc]","ef"));//false(more than one char)

        System.out.println(Pattern.matches("[a-zA-Z]","a"));//true
        System.out.println(Pattern.matches("[a-zA-Z]","abA"));//false(work on only char)
        System.out.println(Pattern.matches("'[a-zA-Z]+","aBz"));//false(first lowercase then uppercase)
        System.out.println(Pattern.matches("[a-zA-Z]+", "abA")); //true

        System.out.println(Pattern.matches("[a-d[m-p]]","p"));//true
        System.out.println(Pattern.matches("[a-d[m-p]]+","ap"));//true

        System.out.println(Pattern.matches("[a-z &&[def]]","d"));//true(char must d e or f)
        System.out.println(Pattern.matches("[a-z &&[def]]","a"));//false
        System.out.println(Pattern.matches("[a-z &&[def]]+","ad"));//true


        System.out.println(Pattern.matches("[a-z &&[^bc]]","d"));//true
        System.out.println(Pattern.matches("[a-z &&[^bc]]","b"));//false
        System.out.println(Pattern.matches("[a-z &&[^bc]]+","ad"));//true

        System.out.println(Pattern.matches("[a-z && [^m-p]]","e"));//true
        System.out.println(Pattern.matches("[a-z && [^m-p]]","m"));//false
        System.out.println(Pattern.matches("[a-z && [^m-p]]+","ab"));//true

    }
}
