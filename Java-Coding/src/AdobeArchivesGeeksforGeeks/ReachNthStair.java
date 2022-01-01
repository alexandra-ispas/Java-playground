package AdobeArchivesGeeksforGeeks;

/**
 * There are n stairs, a person standing at the bottom wants to reach the top. The person can climb
 * either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top.
 */
public class ReachNthStair {

    public static int climb (int n) {
        if(n == 1 || n == 2) return n;
        return climb ( n - 1 ) + climb ( n - 2 );
    }

    /* the equivalent of fib(n + 1)
      because fib(0) = 0 => fib(2) = 1
     */
}