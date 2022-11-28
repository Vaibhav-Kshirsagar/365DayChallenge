// Problem title:- 59. Spiral Matrix II 

// Problem link :- https://leetcode.com/problems/spiral-matrix-ii/description/

import java.util.*;

class SpiralMatrix_ll{

    public int[][] generateMatrix(int n) {

        /*  our input is in spiral order so we add numbers in spiral order */
         int matrix[][] = new int [n][n];
         int sum = 0;
         int sc=0,ec=n-1,sr=0,er=n-1;
         while(sr<=er && sc<=ec){

             // top row
             for(int i=sc;i<=ec;i++){
                //  sum++;
                 matrix[sr][i] = ++sum;
             }

             // right column
             for(int i=sr+1;i<=er;i++){
                //  sum++;
                 matrix[i][ec] = ++sum;
             }

             // bottom row
             for(int i=ec-1;i>=sc;i--){
                 // we go through row by changing column so... ending condition
                 if(sc==ec){
                     break;
                 }
                //  sum++;
                 matrix[er][i] = ++sum;
             }
             
             //left column
             for(int i=er-1;i>sr;i--){
                // we go through column by changing row so... ending condition
                if(sr==er){
                     break;
                 }
                //  sum++;
                 matrix[i][sc] = ++sum;
             }
             sr++;
             ec--;
             er--;
             sc++;

         }
         return matrix;
    }
    public static void main(String argu[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // not need of define but this code is rum also n*m...
        int m = sc.nextInt(); 
        int matrix[][] = new int [n][m];
        // To make spiralmatrix class non static following two line code ...
        
        SpiralMatrix_ll order=new SpiralMatrix_ll();
        matrix=order.generateMatrix(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
    }
}