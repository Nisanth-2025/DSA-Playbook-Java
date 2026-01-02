import java.util.*;

public class LeaderElement
{
    public static List<Integer> leaderElement(int[] arr)
    {
        List<Integer> leaders = new ArrayList<>();
        int len = arr.length;
        int right = arr[len-1];
        leaders.add(right);
        for(int i =len-2;i>=0;i--)
        {
            if(arr[i]>right)
            {
                right = arr[i];
                leaders.add(right);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
    public static void main(String[] args)
    {
        int[] arr = {23,99,19,46,76,32,27,14,9,204,5,39,100,88,55,86,99};
        System.out.println("Leaders = "+leaderElement(arr));
    }    
}
