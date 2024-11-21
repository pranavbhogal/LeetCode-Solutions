class Scratch {
    public static void main(String[] args) {
        
    }
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int midIndex = nums.length/2;
        while (midIndex >= 0 && midIndex < nums.length) {
            for(int i = midIndex+1; i < nums.length; i++) {
                rightSum = rightSum + nums[i];
            }
            for(int i = midIndex-1; i >=0; i--) {
                leftSum = leftSum + nums[i];
            }
            if(leftSum > rightSum) {
                midIndex = midIndex-1;
            }
            else if(leftSum < rightSum) {
                midIndex = midIndex + 1;
            }
            else {
                return midIndex;
            }
        }
        return -1;
    }
}