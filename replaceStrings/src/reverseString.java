import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        System.out.println(reverseString());
    }

    public static String reverseString() {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        String outputString = null;

        if (inputString == null) return null;
        char[] ch = inputString.toCharArray();
        char temp;
        int length = ch.length;
        for (int i = 0; i < (inputString.length()) / 2; i++, length--) {
            temp = ch[i];
            ch[i] = ch[length - 1];
            ch[length - 1] = temp;
        }
        outputString = String.valueOf(ch);
        return outputString;
    }
}