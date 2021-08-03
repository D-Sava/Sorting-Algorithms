public class BubbleSort{

    private static BubbleSort instance;

    private BubbleSort(){
    }

    public static BubbleSort getInstance(){

        if(instance == null)
            return new BubbleSort();

        else
            return instance;
    }

    public void sort(int[] array, SortingDirection direction) {

        //BubbleSort Sort Implementation
        for(int i = 0; i < array.length-1; i++){

            for(int k = i+1; k < array.length; k++){

                if(direction == SortingDirection.ASCENDING_ORDER && array[k] < array[i])
                    swapValues(i, k, array);

                if(direction == SortingDirection.DESCENDING_ORDER && array[k] > array[i])
                    swapValues(i, k, array);

            }
        }
    }

    public void swapValues(int i, int k, int[] array){
        int temp = array[i];
        array[i] = array[k];
        array[k] = temp;
    }

    public static void print(int[] numbers){

        System.out.println("\nSorted array: \n");

        for(int number : numbers){
            System.out.print(number + "   ");
        }

        System.out.println("\n");
    }

}