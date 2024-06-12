package LeetCode;

public class Question64 {

    public static void main(String args[]){
        //int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        int[][] arr = {{1,2,3},{4,5,6}};
        System.out.println(minPathSum(arr));
    }

    public static int minPathSum(int[][] grid) {
        return findMinPath(grid,grid.length-1,grid[0].length-1,grid[0][0]);
    }

    public static int findMinPath(int[][] grid,int x,int y,int sum){
        if(x==0 && y==0){
            return sum;
        }

        /*if(arr[x][y]!=-1){
            return arr[x][y];
        }*/

        int right = Integer.MAX_VALUE;

        if(x-1>-1){
            right=findMinPath(grid,x-1,y,sum+grid[x-1][y]);
        }

        int bottom = Integer.MAX_VALUE;
        if(y-1>-1){
            bottom = findMinPath(grid,x,y-1,sum+grid[x][y-1]);
        }

        return Math.min(right,bottom);
        //return arr[x][y];

    }
}
