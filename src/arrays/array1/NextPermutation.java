package arrays.array1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
    author: Sanket Kutumbe

https://leetcode.com/problems/next-permutation/
 */
public class NextPermutation {

    public static void main(String[] args) {

        int[] arr = {2,1,4,3,0};
        nextPermutation(arr);
        arr = new int[]{3,2,1};
        nextPermutation(arr);
    }

    public static void nextPermutation(int[] nums) {

        int n = nums.length;
        boolean flag = false;
        List<Integer> list = new ArrayList<>();

        int i = n-1;

        while( i > 0 )
        {


            if( nums[i-1] < nums[i] )
            {
                flag = true;
                break;
            }
            i--;
        }

        if( i != 0 )
        {

            for(int j = n-1; j > 0; j--)
            {
                if( nums[j] > nums[i-1] )
                {
                    int temp = nums[j];
                    nums[j] = nums[i-1];
                    nums[i-1] = temp;
                    break;
                }
            }

            for(int j = i; j < n; j++)
            {
                list.add(nums[j]);
            }

            Collections.sort(list);

            for(int j = 0; j < list.size(); j++ )
            {
                nums[i++] = list.get(j);
            }
        }
        else
        {
            Arrays.sort(nums);
        }


    }
}
