// Problem title:- 11. Container With Most Water

// Problem link:- https://leetcode.com/problems/container-with-most-water/

import java.util.*;
public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int area = 0, maxArea = 0;
        int start = 0, end = height.length-1;
        while(start<=end){
            // Area = length * width 
            //width = Math.min(height[start],height[end]);
            //length = end - start;
            area = (end - start) * (Math.min(height[start],height[end]));
            if(maxArea<area){
                maxArea=area;
            }
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxArea;
    }
    public static void main(String argu[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int area;
        Container_With_Most_Water order = new Container_With_Most_Water();
        area = order.maxArea(arr);
        System.out.print(area);
    }
}

