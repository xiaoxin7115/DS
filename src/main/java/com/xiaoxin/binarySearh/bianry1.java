package com.xiaoxin.binarySearh;

/**
 * @author xiaoxin
 * @version 1.0
 * @date 2023/3/6 10:58
 */
//二分查找
public class bianry1 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int target = 3;
        int binary = binary(arr1, target);
        System.out.println(binary);
    }

    //基础版二分查找
    private static int binary(int[] arr1 ,int target) {
        int low = 0;
        int high = arr1.length-1;
        while(low<=high){
            int m = (low+high)>>>1;
            if(arr1[m]<target){
                low = m+1;
            }
            else if (arr1[m]>target) {
                high = m-1;
            }
            else {
                return m;
            }
        }
        return  -(low+1);
    }
}
