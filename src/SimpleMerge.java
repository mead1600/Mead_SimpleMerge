/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++){
            temp[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            temp[i + arr1.length - 1] = arr2[i];
        }
        ArraySwap(temp);
        return temp;
    }

    public static void ArraySwap(int[] array){
        for(int a = 0; a < array.length; a++){
            for(int i = 0; i < array.length ; i++){
                if(array[i] > array[a]){
                    int temp = array[i];
                    array[i] = array[a];
                    array[a] = temp;
                }
            }
        }
    }
}