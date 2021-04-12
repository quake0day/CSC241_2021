package HomeworkAnswers;
import java.util.Stack;
public class FindPatterns
{
    // a+b ==>
    //             /   b   /
    //             /   +   /
    //             /   a   /

    // ==>  b+a

    // 1+3 ==>
    //             /   3   /
    //             /   +   /
    //             /   1  /

    // ==> 3+1
    public static boolean containPattern(String s)
    {
        Stack<Character> seq1 = new Stack<Character>();
        boolean containPattern = false;
        int i = 0;
        while( i < s.length() && s.charAt(i) != '&')
        {
            seq1.push(s.charAt(i));
            i += 1;
        }
        i ++;
        while(i < s.length() && (seq1.pop() == s.charAt(i)))
        {
            i ++;
        }
        if(i == s.length() && seq1.empty())
            containPattern = true;
        return containPattern;
    }

    public static void main(String[] args)
    {
        String s = "a+b&b+a";
        boolean res = containPattern(s);
        System.out.println("Input :'a+b&b+a'" );
        System.out.println(res);
        String seq2 = "1+3&3-1";
        boolean res2 = containPattern(seq2);
        System.out.println("Input :'1+3&3-1'" );
        System.out.println(res2);

    }
}
