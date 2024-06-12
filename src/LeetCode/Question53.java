package LeetCode;

public class Question53 {
    public static int maxSubArray(int[] nums) {
        Integer max = Integer.MIN_VALUE;
        return findMaxSum(nums,0,max);
    }

    public static int findMaxSum(int[] nums, int i,Integer max){

        if(i==nums.length){
            return 0;
        }
        int taken = nums[i]+findMaxSum(nums,i+1,max);

        int notTaken = nums[i];
        int result = Math.max(taken,notTaken);
        max=Math.max(max,result);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

}
