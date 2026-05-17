class Solution {
    public int[] plusOne(int[] digits) {
        
        int n= digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){ // last digit less than 9
                digits[i]++;
                return digits;

            }
            digits[i]=0; //if digit is 9 make it 0
        }
        int[]res=new int[n+1];//if all digit were 9 like 99999 therefore 99999+1=100000
        res[0]=1;
        return res;
    }
}
