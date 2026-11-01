public class PPAP{

public static String ppap(String str) {
    String prefix = "I have a ";

    int firstStart = str.indexOf(prefix) + prefix.length();
    int comma = str.indexOf(',');
    int secondStart = str.indexOf(prefix, comma + 1) + prefix.length();

    String object1 = str.substring(firstStart, comma);
    String object2 = str.substring(secondStart);

    object2 = object2.substring(0, 1).toUpperCase()
            + object2.substring(1);

    return "Uh! " + object2 + " " + object1;
}
	  
	public static void main(String[]args){
	System.out.println(ppap( "I have a pointer, I have a null"));
}
}
