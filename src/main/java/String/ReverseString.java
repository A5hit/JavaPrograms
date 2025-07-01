package String;

public class ReverseString {
    public static void main(String[] args){
        String str = "Hello";
        String reverseStr = reverseStr(str);
//        for(int i = str.length()-1;i>=0;i--){
//            reverseStr += str.charAt(i);
//        }
        System.out.println("Reversed string is :"+reverseStr.toLowerCase());
    }

    //using String builder

    public static String reverseStr(String inputStr){
        StringBuilder reverse = new StringBuilder();
        for (int i = inputStr.length()-1;i>=0;i--){
            reverse.append(inputStr.charAt(i));
        }
        return reverse.toString();
    }
}




