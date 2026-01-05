public class ContainerWithMostWater 
{
    public static int mostWater(int[] arr)
    {
        int left = 0;
        int right = arr.length-1;
        int max_area = 0;
        while(left<right)
        {
            int area = Math.min(arr[left],arr[right])*Math.abs(right-left);
            if(area>max_area)
            {
                max_area = area;
            }
            if(arr[left]<arr[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max_area;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,1,4,6,5,3,5,6,4};
        System.out.println("Most Water = "+(mostWater(arr)));
    }    
}
