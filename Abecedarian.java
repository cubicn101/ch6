public class Abecedarian {

    public static boolean isAbecedarian(String word) {
        int i = 0;

        while (i < word.length() - 1) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false;
            }
            i++;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAbecedarian("almost"));
        System.out.println(isAbecedarian("apple"));
    }
}
