package arrays.array1;

public class KadaneTheorem {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int n = nums.length;
        int temp = nums[0];
        int max = temp;

        for(int i = 1; i < n; i++)
        {
            if( temp < 0 )
                temp = 0;

            temp += nums[i];
            max = Math.max(temp, max);
        }

        System.out.println(max);
    }
}
