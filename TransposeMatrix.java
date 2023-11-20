class TransposeMatrix{
 static int n = 3;
public static int[][] transpose(int matrix1[][], int matrix2[][]){
int len1 = matrix1.length;
int len2 = matrix2.length;

for(int i = 0 ; i < len1 ; i++){
for(int j = 0 ; j < len2 ; j++){
matrix2[j][i] = matrix1[i][j];
}
}
return matrix2;
}
public static void main(String args[]){
int matrix1 [][] = {
                   {1,2,3},
                   {4,5,6},
                   {7,8,9}
                   };
int matrix2 [][] = new int [n][n];
transpose(matrix1, matrix2);
System.out.println("Transpose Matrix ");
for(int i = 0 ; i < matrix2.length; i++){
for(int j = 0 ; j < matrix2.length ; j++){
System.out.print(matrix2[i][j] + " " );
}
System.out.println();
}
}
}