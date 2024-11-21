import java.util.HashMap;

class Scratch {
    public static void main(String[] args) {

    }


    public int[] twoSum(int[] nums, int target) {
        int answer[];
        answer = new int[2];
        for(int i = 0; i< nums.length; i++) {
            for(int j = i+1; j< nums.length; j++) {
                if(nums[j]+nums[i] == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }

    public int[] twoSumOp(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            }
            else {
                map.put(nums[i], i); //The key is the value at index i because it is the one that is searched, value is i because it is what we need for the resutl.
            }
        }
        return new int[0];
    }
}