// Problem title:- 53. Maximum Subarray 

// Problem link :- https://leetcode.com/problems/maximum-subarray/

import java.util.*;

public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(sum<0){
                sum=0;
            }
            sum += nums[i];
            if(max<sum){
                max = sum;
            }
        }
        return max;
    }
    public static void main(String argu[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Maximum_Subarray order = new Maximum_Subarray();
        int max = order.maxSubArray(a);
        System.out.println(max);

    }
}
