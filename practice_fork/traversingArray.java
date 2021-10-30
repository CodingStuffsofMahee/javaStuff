package array;

import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int z=0;
        int[] arr2=new int[arr1.length];
        for (int i=arr1.length-1;i>=0;i--){
            arr2[z]=arr1[i];
            z++;
        }
        System.out.println("Original Array:-"+Arrays.toString(arr1));
        System.out.println("Reversed Array"+Arrays.toString(arr2));
    }
}
