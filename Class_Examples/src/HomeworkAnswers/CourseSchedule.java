package HomeworkAnswers;
import java.util.*;

public class CourseSchedule {
    enum Status {
        NOT_VISITED, VISITED, VISITING;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites == null || prerequisites.length == 0 || prerequisites[0].length == 0)
            return true;

        List<List<Integer>> list = new ArrayList<>(numCourses);
        for(int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<Integer>());
        }
        for(int[] p: prerequisites) {
            int prerequisite = p[1];
            int course = p[0];
            list.get(course).add(prerequisite);
        }

        Status[] visited = new Status[numCourses];
        for(int i = 0; i < numCourses; i++) {
            // if there is a cycle, return false
            if(dfs(list, visited, i))
                return false;
        }
        return true;
    }

    public boolean dfs(List<List<Integer>> list, Status[] visited, int cur) {
        if(visited[cur] == Status.VISITING)
            return true;
        if(visited[cur] == Status.VISITED)
            return false;
        visited[cur] = Status.VISITING;
        for(int next: list.get(cur)) {
            if(dfs(list, visited, next))
                return true;
        }
        visited[cur] = Status.VISITED;
        return false;
    }

    private static String booleanToString(boolean input) {
        return input ? "possible" : "impossible";
    }

    public static void main(String args[]){
        int numCourses = 2;
        int[][] prerequisites = { {1,0} , {0,1} };
        boolean ret = new CourseSchedule().canFinish(numCourses, prerequisites);
        String out = booleanToString(ret);
        System.out.print("Is it possible to finish all courses: " +out);
    }
}