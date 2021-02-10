package HomeworkAnswers;

public class GaussSum {
    public static void main(String[] args) {

        int sum = 0;
        for(int i = 81297; i <= 100899; i+= 198)
        {
            sum = sum + i;
            //System.out.println(i);
        }
        System.out.println(sum);
    }
}
