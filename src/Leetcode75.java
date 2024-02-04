public class Leetcode75 {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for(int i = 0; i < nums.length; i++){
            count[nums[i]]++;
        }
        int i = 0, j = 0;
        while(j < nums.length){
            if(count[i] == 0){
                i++;
            }else{
                nums[j++] = i;
                count[i]--;
            }
        }
    }
}
