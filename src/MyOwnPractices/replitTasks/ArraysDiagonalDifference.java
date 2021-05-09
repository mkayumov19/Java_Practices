package MyOwnPractices.replitTasks;

public class ArraysDiagonalDifference {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{9,8,9}};
        int result = 0;
        int diagonalOne = 0, diagonalTwo = 0;
        for (int i = 0; i < matrix.length; i++) {
            diagonalOne += matrix[i][i];}
        for (int i = matrix.length - 1, j = 0; i >= 0; i--, j++) {
            diagonalTwo += matrix[i][j];}
        result = diagonalOne - diagonalTwo;
        System.out.println(Math.abs(result));
    }
}
