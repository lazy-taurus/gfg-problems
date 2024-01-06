/**
 * day35
 */
public class day35 {

    
}
class Solution {
    
    public long maxSumWithK(long a[], long n, long k)
    {
        long currentSum = 0;
        long maxSum = Integer.MIN_VALUE;
        long accumulatedNegative = 0;
    
        for (int start = 0, end = 0; end < n;) 
        {
            currentSum += a[end];
    
            if (end - start + 1 < k) 
            {
                ++end;
            } 
            
            else if (end - start + 1 == k) 
            {
                maxSum = Math.max(maxSum, currentSum);
                ++end;
            } 
            
            else 
            {
                maxSum = Math.max(maxSum, currentSum);
                accumulatedNegative += a[start++];
    
                if (accumulatedNegative < 0) 
                {
                    currentSum -= accumulatedNegative;
                    maxSum = Math.max(maxSum, currentSum);
                    accumulatedNegative = 0;
                }
    
                ++end;
            }
        }
        return maxSum;
    }
}