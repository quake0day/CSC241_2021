package HomeworkAnswers;

import java.util.ArrayList;

public class TestScoresGeneric <T extends Number> {
    private ArrayList<T> testScores;

    public TestScoresGeneric(ArrayList<T> ts){
        testScores = ts;
        for(int i = 0; i < testScores.size(); i++)
        {
            if(testScores.get(i).doubleValue() < 0 || testScores.get(i).doubleValue() > 100){
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
            sum += testScores.get(i).doubleValue();
        }
        double average = sum / testScores.size();
        return average;
    }

    public double getHighestScore()
    {
        double highest = 0.0;
        for(int i = 0; i < testScores.size(); i++)
        {
            if(highest < testScores.get(i).doubleValue()) {
                highest = testScores.get(i).doubleValue();
            }
        }
        return highest;
    }

    public double getLowestScore()
    {
        double lowest = 100;
        for(int i = 0; i < testScores.size(); i++)
        {
            if(lowest > testScores.get(i).doubleValue()) {
                lowest = testScores.get(i).doubleValue();
            }
        }
        return lowest;
    }

}
