package HomeworkAnswers;

import java.util.ArrayList;

public class TestScoresDemo {
    public static void main(String[] args) {
        ArrayList<Double> scores = new ArrayList<>();
        scores.add(95.0);
        scores.add(5.0);
        scores.add(22.0);
        scores.add(11.0);
        scores.add(89.0);
        scores.add(95.5);
        // {100, 99, 95.5}
        //System.out.println(scores.get(0));
        //System.out.println(scores.get(1));
        TestScores ts1 = new TestScores(scores);
        System.out.println(ts1.getAverage());
        System.out.println(ts1.getHighestScore());
        System.out.println(ts1.getLowestScore());

        ArrayList<Integer> scoresInt = new ArrayList<>();
        scoresInt.add(100);
        scoresInt.add(99);
        scoresInt.add(98);
        TestScoresGeneric<Integer> tsg1 = new TestScoresGeneric<>(scoresInt);
        System.out.println(tsg1.getAverage());
        System.out.println(tsg1.getHighestScore());
        System.out.println(tsg1.getLowestScore());
    }
}
