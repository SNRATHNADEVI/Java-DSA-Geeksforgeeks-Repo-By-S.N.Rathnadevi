class Solution {
    static boolean isEven(int n) {
        // code here
        if(n>=0 && n<=10000){
         return(n & 1)== 0;
        }
        return false;
    }
}
