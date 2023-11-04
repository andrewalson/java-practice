package codewars_katas.grey;

public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...
        
        //First idea/attempt - refactor
        int sum = 0;
        
        for (int item : arr1) {
          sum = sum + item;
        }
        
        for (int item : arr2) {
          sum = sum + item;
        }
        return sum;
      }
}
