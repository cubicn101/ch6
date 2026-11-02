public class Palindrome{
public static boolean isPalindrome(String str) {
    String nonLetters = ".,:;()[]{}!@#$%^&* ?";
    String cleaned = "";

    str = str.toLowerCase();

    for (int i = 0; i < str.length(); i++) {
        String ch = str.substring(i, i + 1);

        if (!nonLetters.contains(ch)) {
            cleaned += ch;
        }
    }
    int len = cleaned.length();
for (int i = 0; i < len / 2; i++) {
    if (cleaned.charAt(i) != cleaned.charAt(len - 1 - i)) {
        return false;
    }
}

return true;
}

public static void main(String []args){
System.out.println(isPalindrome("tacocat"));
System.out.println(isPalindrome("Amy, must I jujitsu my ma?"));
System.out.println(isPalindrome("hello"));

}
}
