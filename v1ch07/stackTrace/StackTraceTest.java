package stackTrace;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * A program that displays a trace feature of a recursive method call.
 *
 * @author Cay Horstmann
 * @version 1.01 2004-05-10
 */
public class StackTraceTest {
    /**
     * Computes the factorial of a number 计算一个数的竭诚
     *
     * @param n a non-negative integer
     * @return n! = 1 * 2 * . . . * n
     */
    public static int factorial(int n) {
        System.out.println("factorial(" + n + "):");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for (StackTraceElement f : frames)
            System.out.println(f);
        int r;
        if (n <= 1) r = 1;
        else r = n * factorial(n - 1);
        System.out.println("return " + r);
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        factorial(n);

//        try {
////         access the database
//        } catch (SQLException e) {
//            Throwable se = new Exception("database error");
//            se.initCause(e);
//            throw se;
//
//        Throwable cause = se.getCause();//可以获取到 se.initCause(e);这样可以传递异常而不丢失
//        }
    }
}
