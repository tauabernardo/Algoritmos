import static java.util.Arrays.binarySearch;

public class Main {
    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};

        int target = 22;

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Elemento estava no inserido no índice " + result);
        } else {
            System.out.println("Elemento não pode ser encontrado");
        }
        

    }

}