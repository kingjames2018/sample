/* Check Prime Number */
public class JavaExercise6 {
    public static void main(String[] args) {
        System.out.println(checkPrime(2));
    }

    public static boolean checkPrime(int n) {
        boolean flag = true;
        int m = n/2;
        if(n==0 || n==1) {
            flag = false;
        } else {
            for(int i=2; i<=m; i++) {
                if(n%i==0) {
                    flag = false;
                }
            }
        }
        return flag;
    }
}
