import java.util.*;
public class App {

    public static void BubbleSort(int[] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
            
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
  
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        try {
        //asks the user for the number of elements in the array
        System.out.print("Enter the size of the array: ");
        int ArraySize = scan.nextInt();
        int[] x = new int[ArraySize];

        //asks the user for the elements of the array
        for(int i = 0; i < x.length; i++){
            System.out.println("Enter the element at index " + i+ ": ");
            x[i] = scan.nextInt();
        }

        System.out.print("Original array: ");
        for (int i : x) {
            System.out.print(i+" ");
        }
        System.out.println();

        BubbleSort(x);
        // Display sorted array
        System.out.print("Sorted array: ");
        for (int i : x) {
            System.out.print(i + " ");
        }
        


        } catch (Exception e) {
            // TODO: handle exception   
        }
        
    }
}
