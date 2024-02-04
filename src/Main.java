import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Leetcode75 leetcode75 = new Leetcode75();
        int[] nums = {2,0,2,1,1,0};
        leetcode75.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}