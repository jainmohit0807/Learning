package LeetCode;

public class Question678 {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(checkValidString("(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())"));

    }

    public static boolean checkValidString(String s) {
        int open = 0;
        int star = 0;
        int close = 0;
        int totalOpen = 0;
        int totalClose = 0;
        int totalStar = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
                totalOpen++;
            }

            if(s.charAt(i)=='*'){
                totalStar++;
                star++;
            }

            if(s.charAt(i)==')'){
                totalClose++;
                close++;
                if(open>0){
                    open--;
                }
                else if(star>0){
                    star--;
                }
                else{
                    return false;
                }
            }
        }



        if(open>=0 && star>=0){
            if(open>star) {
                return false;
            }
        }

        System.out.println("TotalOpen="+totalOpen);
        System.out.println("TotalClose="+totalClose);
        System.out.println("TotalStar="+totalStar);

        return true;

    }
}