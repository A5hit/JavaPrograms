package String;

public class RemoveDuplicates {
    public static String main(String[] args) {
        String str = "bcabc";
        StringBuilder withoutDuplicate = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (withoutDuplicate.indexOf(String.valueOf(str.charAt(i))) == -1) {
                withoutDuplicate.append(str.charAt(i));
            }
        }
        return withoutDuplicate.toString();
    }

}


