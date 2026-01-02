import java.util.Scanner;
public class FrequencyOfNumber 
{
    public static int frequencyNumber(int[] arr,int num)
    {
        int count = 0;
        for(int x : arr)
        {
            if(x==num)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] arr = {23,99,19,46,76,32,27,14,9,204,5,39,56,88,55,86,99};
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a Number : ");
        num = sc.nextInt();
        System.out.println("NO of times "+num+" Occured is "+frequencyNumber(arr,num));
        sc.close();
    }    
}
