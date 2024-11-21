class Scratch {
    public static void main(String[] args) {
        
    }

    public int maxProduct(int[] nums) {
        int prod = 1;
        int maxProd = nums[0];
        for(int num: nums) {
            prod = prod * num;
            if(maxProd < prod){
                maxProd = prod;
            }
            if(prod < 0) {
                prod = 1;
            }
        }
        return maxProd;
    }
}