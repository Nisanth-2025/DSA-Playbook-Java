import java.util.*;

public class FirstNegativeInEveryWindow
{
    public static List<Integer> firstNegative(int[] arr,int k)
    {
        int n = arr.length;
        if(k>n)
        {
            return Arrays.asList(-1);
        }
        Queue<Integer> neg = new LinkedList<>();    
        List<Integer> res = new ArrayList<>();
        List<Integer> calc = new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            calc
        }
        max_sum = k_sum;
        for(int j =k;j<n;j++)
        {
            k_sum -= arr[j-k];
            k_sum += arr[j];
            max_sum = Math.max(k_sum,max_sum);
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,1,4,6,5,3,5,6,4};
        System.out.println("First Negative = " + firstNegative(arr,4));
        System.out.println("First Negative = " + firstNegative(arr,12));
    }   
}
