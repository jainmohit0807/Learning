package LeetCode;

import java.util.Arrays;

public class Question1218 {

    public static void main(String[] args) {
        longestSubsequence(new int[]{4,12,10,0,-2,7,-8,9,-9,-12,-12,8,8},0);
    }

    public static int longestSubsequence(int[] arr, int difference) {
        int[][] matrix = new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(matrix[i], -1);
        }

        //int result = findLongestSubsequence(arr,0,1,difference,matrix);
        //System.out.println(matrix[0][3]);
        return 0;
    }

    public static int findLongestSubsequence(int[] arr, int i,int j, int d,int[][] matrix, int maxSum){
        if(i>=arr.length || j>=arr.length){
            return 1;
        }

        if(matrix[i][j]!=-1){
            return matrix[i][j];
        }

        int include = 0;
        if(arr[j]-arr[i]==d){
            include = findLongestSubsequence(arr,j,j+1,d,matrix,maxSum+1);
        }
        int notInclude = findLongestSubsequence(arr,i,j+1,d,matrix,maxSum);

        int max = Math.max(include,notInclude);

        return matrix[i][j] = Math.max(max,findLongestSubsequence(arr,i+1,i+2,d,matrix,maxSum));

    }

}
