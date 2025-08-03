package String;

public class StringCompression {

    public static void main(String[] args) {

        String str = "aaabbccdee";

        StringBuilder compress = new StringBuilder();

        int count = 1;
        for(int i = 1; i < str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            } else {
                compress.append(str.charAt(i-1)).append(count);
            }
        }

        System.out.println(compress);
    }
}
