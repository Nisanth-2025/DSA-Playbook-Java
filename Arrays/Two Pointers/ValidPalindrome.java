public class ValidPalindrome 
{
    public static boolean validPalindrome(String s)
    {
        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch) || Character.isAlphabetic(ch))
            {
                str.append(Character.toLowerCase(ch));
            }
        }
        String res = str.toString();
        int left = 0;
        int right = res.length()-1;
        while(left<right)
        {
            if(res.charAt(left)!=res.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str1 = "M*al%ayal?:am+";
        String str2 = "mmkwwndw##$nkj";
        System.out.println(" The String is "+(validPalindrome(str1)?"a Plaindrome":"not a Palindrome"));
        System.out.println(" The String is "+(validPalindrome(str2)?"a Plaindrome":"not a Palindrome"));
    }    
}
