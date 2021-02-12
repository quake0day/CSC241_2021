package Recursion;

public class RecursionDemo {
    public static void main(String[] args) {
        //EndlessRecursion.message();
        EndRecursion.message(5);
    }

    public static class EndlessRecursion
    {
        static int i = 1;
        public  static void message()
        {
            System.out.println("This is a recursive method:" + i);
            i++;
            message();
        }
    }

    public static class EndRecursion
    {
        public static void message(int n) {
            if (n > 0) {
                System.out.println("This is a recursive method:" + n);
                message(n-1); // message(0)
            }
        }
    }
}

