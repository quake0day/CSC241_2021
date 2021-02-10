package HomeworkAnswers;

import java.util.ArrayList;

public class TestScores {
    private ArrayList<Double> testScores;

    public TestScores(ArrayList<Double> ts){
        testScores = ts;
        for(int i = 0; i < testScores.size(); i++)
        {
            if(testScores.get(i) < 0 || testScores.get(i) > 100){
                throw new IllegalArgumentException();
            }
        }
    }

    public double getAverage()
    {
        double sum = 0;
        for(int i = 0; i < testScores.size(); i++)
        {
            // i = 0, 1, 2
            sum += testScores.get(i);
        }
        double average = sum / testScores.size();
        return average;
    }

    public double getHighestScore()
    {
        double highest = 0.0;
        for(int i = 0; i < testScores.size(); i++)
        {
            if(highest < testScores.get(i)) {
                highest = testScores.get(i);
            }
        }
        return highest;
    }

    public double getLowestScore()
    {
        double lowest = 100;
        for(int i = 0; i < testScores.size(); i++)
        {
            if(lowest > testScores.get(i)) {
                lowest = testScores.get(i);
            }
        }
        return lowest;
    }

}
