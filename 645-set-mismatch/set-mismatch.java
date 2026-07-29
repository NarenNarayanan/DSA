class Solution {
    public int[] findErrorNums(int[] nums) {
        int rep=0,miss=0;
        int not1=0,not2=0,not3=0;
        for(int i=0;i<nums.length;i++){
            not1+=nums[i];
            not1-=(i+1);
        }
        for(int i=0;i<nums.length;i++){
            not2+=nums[i]*nums[i];
            not2-=(i+1)*(i+1);
        }
        not3=not2/not1;
        rep=(not1+not3)/2;
        miss=(not3-not1)/2;
        return new int[] {rep,miss};
    }
}