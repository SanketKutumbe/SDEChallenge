package arrays.array1;

import java.util.ArrayList;
import java.util.List;

/*
    author: Sanket Kutumbe

    https://leetcode.com/problems/pascals-triangle/submissions/
 */

public class PascalTriangle {

    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();
        list = generate(5);
        System.out.println(list);
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        resultList.add(temp);

        if(numRows == 1) return resultList;

        temp = new ArrayList<>();
        temp.add(1);
        temp.add(1);

        resultList.add(temp);

        if(numRows == 2) return resultList;

        for(int i = 2; i < numRows; i++)
        {
            temp = new ArrayList<>();
            temp.add(1);
            int j = 0;

            while( i != temp.size() )
            {
                temp.add(resultList.get(i-1).get(j) + resultList.get(i-1).get(j+1));
                j++;
            }

            temp.add(1);
            resultList.add(temp);
        }

        return resultList;
    }
}
