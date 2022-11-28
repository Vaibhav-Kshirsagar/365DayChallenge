import java.util.*;

class SpiralMatrix{

    public  List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> L = new ArrayList<>();
             int er = matrix.length - 1, sr = 0, sc = 0; 
             int ec = matrix[0].length - 1; 
             // sr=starting row(top) as like column sc and ec
             // er=ending row(bottom)
     
             while (sr <= er && sc <= ec) {
     
                 // top row
                 for (int j = sr; j <= ec; j++) {
                     L.add(matrix[sr][j]);
                 }
     
                 // right column
                 for (int i = sr + 1; i <= er; i++) {
                     L.add(matrix[i][ec]);
                 }
     
                 // bottom row
                 for (int j = ec - 1; j >= sr; j--) {
                     if (sr == er) {
                         break;
                     }
                     L.add(matrix[er][j]);
                 }
     
                 // left column
                 for (int i = er - 1; i > sr; i--) {
                     if (sc == ec) {
                         break;
                     }
                     L.add(matrix[i][sc]);
                 }
     
                 sr++;
                 ec--;
                 er--;
                 sc++;
     
             }
             return L;
     }
    public static void main(String argu[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        List<Integer> L = new ArrayList<>();
        SpiralMatrix order=new SpiralMatrix();
        L=order.spiralOrder(matrix);
        System.out.print(L);
    }
}