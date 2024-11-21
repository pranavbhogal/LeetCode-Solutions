class Scratch {
    public static void main(String[] args) {
        
    }
    public int[] productExceptSelf(int[] nums) { //current solution is not O(n). Fails by exceeding time limit.
        int N = nums.length;
        int[] output_arr = new int[N];
        int[] left_arr = new int[N];
        int[] right_arr = new int[N];

        left_arr[0] = 1;
        right_arr[N-1] = 1;

        for(int i = 1; i < N; i++) {
            left_arr[i] = left_arr[i-1] * nums[i-1];
        }

        for(int i = N-2; i >= 0; i--) {
            right_arr[i] = right_arr[i+1] * nums[i+1];
        }

        for(int i = 0; i < N; i++) {
            output_arr[i] = left_arr[i] * right_arr[i];
        }

        return output_arr;

    }
}