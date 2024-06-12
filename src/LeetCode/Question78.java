package LeetCode;

import java.util.*;
public class Question78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr =new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        printSubSet(nums,0,curr,result);
        return result;
    }

    public static void printSubSet(int[] nums,int i,List<Integer> curr,List<List<Integer>> result){
        if(i==nums.length){
            List<Integer> copy = new ArrayList<>(curr);
            result.add(copy);
            System.out.println(curr);
            return;
        }
        curr.add(nums[i]);
        printSubSet(nums,i+1,curr,result);
        curr.remove(curr.size()-1);
        printSubSet(nums,i+1,curr,result);
    }

    public static void main(String[] args) {
        subsets(new int[]{1,2,3});
    }



}
