package HomeworkAnswers;
import java.util.*;
public class DecrptString
{
    public static String decrpt(String s)
    {
        Queue<Character> q = new LinkedList<>();
        for(int i = 0; i < s.length(); i++)
        {
            q.add(s.charAt(i));
        }
        int step = 0;
        String result = "";
        while(q.size() != 0)
        {
            if (step == 0)
            {
                result += q.remove();
                step ++;
            }
            else
            {
                q.add(q.remove());
                step = 0;
            }
        }

        return result;
    }
    public static void main(String[] args)
    {
        String s = "253";
        System.out.println(decrpt(s));
        String s2 = "631758924";
        System.out.println(decrpt(s2));
    }
}
