public class BinarySearchRecursive {

    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (array[mid] == target) return mid;
        if (array[mid] < target) return binarySearchRecursive(array, target, mid + 1, right);
        else return binarySearchRecursive(array, target, left, mid - 1);
    }

}
