class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        
        int start = 0, end = 0;
        int sum = 0;
        while(end < n) {
            sum += arr[end];
            
            while(start <= end && sum > s) {
                sum -= arr[start++];
            }
            if (sum == s) {
                return new ArrayList<Integer>(Arrays.asList(start+1, end+1));
            }
            end++;
        }
        
        return new ArrayList<Integer>(Arrays.asList(-1));
        
        
    }
}
