import java.util.*;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int sum=0;
        int sum2=0;
        //System.out.println(nums.size());
        for (int i=0;i<nums.size()-1;i++){
         
              for (int k=i+1;k<nums.size();k++){
         
                  sum2 = nums.get(i)+nums.get(k); 
                   if (sum2>sum){
                   sum = sum2;
                    }
                } 
            }
        
        
        return sum;
    }

}

