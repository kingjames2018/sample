/* Bubble Sort */
public class JavaExercise4 {
    public static void main(String[] args) {
        int arr[] = {15,20,78,89,66};
        int temp = 0;

        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j]<arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
