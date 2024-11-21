class Scratch {
    public static void main(String[] args) {
        
    }
    //Kadane's algorithm;
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = Integer.MAX_VALUE;
        for(int num: nums) {
            sum = sum + num;
            if(maxsum < sum) {
                maxsum = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxsum;
    }

}