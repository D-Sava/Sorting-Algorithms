public class Main {

    public static void main(String[] args){

        int[] array = { 3, 8, 1, 2, 0, 7, 5, 5, 1, 1, 9, 8, 6, 2, 2};

        BubbleSort.getInstance().sort(array, SortingDirection.DESCENDING_ORDER);
        BubbleSort.getInstance().print(array);

    }
}