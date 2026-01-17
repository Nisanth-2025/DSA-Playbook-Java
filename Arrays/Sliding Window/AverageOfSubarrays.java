import java.util.*;

public class AverageOfSubarrays
{
    public static List<Float> averageSubArrays(int[] arr,int k)
    {
        int n = arr.length;
        if(k>n)
        {
            return Arrays.asList(-1.0f);

        }
        List<Float> avg = new ArrayList<>();
        int k_sum = 0;
        for(int i=0;i<k;i++)
        {
            k_sum+=arr[i];
        }
        avg.add((float)k_sum/k);
        for(int j =k;j<n;j++)
        {
            k_sum -= arr[j-k];
            k_sum += arr[j];
            avg.add((float)k_sum/k);
        }
        return avg;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,1,4,6,5,3,5,6,4};
        System.out.println("Average of Sub-Array = "+averageSubArrays(arr,4));
        System.out.println("Average of Sub-Array = "+averageSubArrays(arr,12));
    }    
}
