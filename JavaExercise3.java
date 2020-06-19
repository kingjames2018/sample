/* Selection Sort */
public class JavaExercise3 {
    public static void main(String[] args) {
        int arr[] = {56,22,33,76,25};
        int temp = 0;

        for(int i=0; i<arr.length-1; i++) {
            int min = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }

        for(int i=0; i<arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
