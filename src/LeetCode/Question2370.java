package LeetCode;

public class Question2370 {

    static int max=0;
    public static int longestIdealString(String s, int k) {
        int[][] arr=new int[s.length()+1][s.length()+1];
        for(int i=0;i<s.length()+1;i++){
            for(int j=0;j<s.length()+1;j++){
                arr[i][j]=-1;
            }
        }
        return getLongestString(s,k,0,1,arr);
    }

    public static int getLongestString(String s,int k,int i,int j,int[][] arr){

        if(i>=s.length() || j>=s.length()){
            return 0;
        }


        if(arr[i][j]!=-1){
            return arr[i][j];
        }
        if(Math.abs(s.charAt(j)-s.charAt(i))<=k){
            max = Math.max(getLongestString(s,k,i,j+1,arr),1+getLongestString(s,k,j,j+1,arr));
        }else{
            max = Math.max(max,getLongestString(s,k,i,j+1,arr));
        }

        int result = Math.max(max,getLongestString(s,k,i+1,i+2,arr));
        arr[i][j]=result;
        return result;
    }

    public static void main(String args[]){
        System.out.println(longestIdealString("acfgbd",2));
    }
}