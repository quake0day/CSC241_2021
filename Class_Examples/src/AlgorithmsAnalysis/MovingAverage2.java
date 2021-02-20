package AlgorithmsAnalysis;

import java.util.ArrayList;

public class MovingAverage2 {

    public static void main(String[] args) {
        ArrayList<Double> Dataset = new ArrayList<>();
        ArrayList<Double> result = new ArrayList<>();
        Dataset.add(101.1); // 0
        Dataset.add(120.2); // 1
        Dataset.add(130.3); // 2
        Dataset.add(120.5); // 3
        Dataset.add(150.9); // 4
        int N = Dataset.size();
        int M = 3;
        // Total Time complexity: O(N)
        double partialSum = 0;
        for(int j = 0; j < M - 1; j++)
            partialSum += Dataset.get(j); // ==> 101.1 + 120.2  ==> A
        for(int i = M - 1; i < N; i++){
            partialSum += Dataset.get(i); // ==> A + 130.3
            result.add(partialSum / M);  // ==> (A + 130.3) / 3
            partialSum -= Dataset.get(i - (M - 1)); // ==> A + 130.3 - 101.1
        }
        System.out.println(result);
    }
}

