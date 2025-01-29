public class Main {
    public static void main(String[] args) {

        int[] arr = {5,12,8,3,19,7,23};

        int target = 19;

        int result = LinearSearch.linearSearch(arr, target);


        if(result == -1){
            System.out.println("Elemento n encontrado");
        } else {
            System.out.println("Elemento encontrado no índice " + result);
        }



    }
}