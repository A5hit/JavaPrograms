package String;

public class PalindromeCheck {
    public static void main(String[] args){
        String input = "madam";
        boolean isPalindrome = isPalindrome(input);
        System.out.println("The Given String is "+isPalindrome+" Palindrome");
    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        for(int i =0;i<str.length()-1;i++){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
