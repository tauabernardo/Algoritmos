
public class Main {
    public static void main(String[] args) {

        int[] array = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 }; // Array ordenado
        int target = 23;

        int result = BinarySearchRecursive.binarySearchRecursive(array, target, 0, array.length - 1);


        if (result == -1) {
            System.out.println("Elemento não encontrado no array.");
        } else {
            System.out.println("Elemento encontrado no índice: " + result);
        }
    }

}
