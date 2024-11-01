// package BubbleSort;

public class BubbleSort {
    static void Sort(int array[]){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length -i -1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};
        Sort(array);
        for(int i : array){
            System.out.println(i);
        }
    }
}
