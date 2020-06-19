/* Division by recursion */
public class JavaExercise1 {
    public static void main(String[] args) {
        System.out.print(divide(20,6));
    }

    public static int divide(int dividend, int divisor) {
       if(divisor==0) {
           return 0;
       } else if(dividend-divisor==0) {
           return 1;
       } else if(dividend < divisor) {
           return 0;
       } else {
           return (1 + divide(dividend-divisor, divisor));
       }


    }
}
