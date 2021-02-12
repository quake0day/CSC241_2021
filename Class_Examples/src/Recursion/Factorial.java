package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial2(5));
    }

    public static int factorial1(int n)
    {
        //1*2*3*..*n
        int result = 1;
        for(int i = 1; i <= n; i++)
        {
            result = result * i;
        }
        return result;
    }
    public static int factorial2(int n)
    {
        int result = 1;
        if(n == 0) return result;
        if(n > 0){
            result = n * factorial2(n-1);
        }
        return result;
    }
}
