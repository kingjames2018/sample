/* Duplicate elements in array */
public class JavaExercise2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        System.out.println(hasDuplicates(arr));
    }

    public static boolean hasDuplicates(int arr[]) {
        boolean flag = false;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]==arr[i+1]) {
                flag = true;
            }
        }
        return flag;
    }
}
