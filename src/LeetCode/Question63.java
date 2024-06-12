package LeetCode;

public class Question63 {

    public static void main(String[] args) {
        int[][] arr = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(arr));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return findCount(obstacleGrid,0,0);
    }

    public static int findCount(int[][] obstacleGrid,int i,int j){

        if(i==obstacleGrid.length-1 && j==obstacleGrid[0].length-1){
            return 1;
        }

        if(obstacleGrid[i][j]==1){
            return 0;
        }

        int left = 0;
        if(i+1<obstacleGrid.length){
            left = findCount(obstacleGrid,i+1,j);
        }

        int right=0;
        if(j+1<obstacleGrid[0].length){
            right = findCount(obstacleGrid,i,j+1);
        }

        return left+right;

    }

}
