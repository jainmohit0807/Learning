package LeetCode;

public class Question402 {
    public static void main(String[] args) {

        System.out.println(removeKdigits("10001",4));

    }

    public static String removeKdigits(String num, int k) {
        return getStringAfterRemoveKDigits(num,k);
    }

    public static String getStringAfterRemoveKDigits(String num, int k){
        if(k==0){
            if(num.length()==0)
                return "0";
            else
                return num;
        }

        if(k>=num.length()){
            return "0";
        }

        char temp = '0';
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)>=temp)
            {
                temp=num.charAt(i);
            }else{
                num = num.substring(0,i-1)+num.substring(i,num.length());
                num = getRemoveLeadingZeros(num);
                return getStringAfterRemoveKDigits(num,k-1);
            }
        }
        return getStringAfterRemoveKDigits(num.substring(0,num.length()-1),k-1);
    }

    public static String getRemoveLeadingZeros(String num){
        int k=0;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='0'){
                k++;
            }
            else{
                break;
            }
        }
        return num.substring(k,num.length());
    }
}
