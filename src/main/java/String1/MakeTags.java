package String1;

public class MakeTags {
    public static void main(String[] args) {
        System.out.println(makeTags("i", "Yes"));
        System.out.println(makeTags("cite", "Helllo"));

    }
    public static  String makeTags(String tag, String word){
        return "<" +tag + ">" + word + "</" + tag + ">";
    }
}
