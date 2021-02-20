package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial2(5));
        System.out.println(f(5));
    }

    // f(5) ==> 11 + 2 * 4 + 3*2
    // f(4) ==> 4 + 2 * 2 + 3*1 =-
    // f(3 for f(5)) ==> 2 + 2 * 1 + 3 * 0 = 4
    // f(3 for f(4)) ==> 2 + 2 * 1 + 3 * 0 =4

    public static int f(int n)
    {// 2 + 2 * 1 + 3 * 0 = 4
        if(n >= 3) return f(n-1) + 2 * f(n-2) + 3*f(n-3);
        return n;
    }
    // array = {0, 1, 2, 4, 11}
    // 4 + 2 * 2 + 3 * 1 = 4 + 4 + 3 = 11
    // f(4)

    public static int factorial1(int n)
    {

        //n!= 1*2*3*..*n
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
