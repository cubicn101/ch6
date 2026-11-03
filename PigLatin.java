public class PigLatin{
 public static String piglatin(String msg){
    String suffix ="ay";
    
    if(msg.length()>2){
        String end= msg.substring(0,1);
        String body= msg.substring(1);
        return body+end+ suffix;
        }else{
        return msg;
    }
}
   public static String sentence(String x) {
        String result = "";
        int start = 0;

        for (int i = 0; i < x.length(); i++) {
            if (x.substring(i, i + 1).equals(" ")) {
                String word = x.substring(start, i);
                result += piglatin(word) + " ";
                start = i + 1;
            }
        }

        String word = x.substring(start);
        result += piglatin(word);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(sentence("jellyfish"));
        System.out.println(sentence("hamster"));
        System.out.println(sentence("I love math so much"));
    }
}
