import java.util.*;
public class Solution {
       
    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;
 
        if (low >= high)
            return;
 
        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
 
        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
 
            while (arr[j] > pivot) {
                j--;
            }
 
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
 
        // recursively sort two sub parts
        printArray(arr);
        if (low < j)
            quickSort(arr, low, j);
        printArray(arr);
        if (high > i)
            quickSort(arr, i, high);
    }

  static void printArray(int[] ar) {
     for(int n: ar){
        System.out.print(n+" ");
     }
    System.out.println("");
  }
   
  public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int[] ar = new int[n];
       for(int i=0;i<n;i++){
          ar[i]=in.nextInt(); 
       }
       quickSort(ar, 0, ar.length-1);
       printArray(ar);
  }    
}
