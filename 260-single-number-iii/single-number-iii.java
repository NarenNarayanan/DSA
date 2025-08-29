class Solution {
    public int[] singleNumber(int[] nums) {
        int ov=0;
        for(int num:nums){
            ov^=num;
        }
        int pos=0;
        while(((ov>>pos)&1)!=1){
            pos++;
        }
        int fir=0,sec=0;
        for(int num:nums){
            if(((num>>pos)&1)==1){
                fir^=num;
            }
            else{
                sec^=num;
            }
        }
        return new int[] {fir,sec};
    }
}