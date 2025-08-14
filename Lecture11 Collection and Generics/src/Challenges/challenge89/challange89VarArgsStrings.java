package Challenges.challenge89;

public class challange89VarArgsStrings {
    public static void main(String[] args) {
        String str = concateAll("This" , "is" , "my" ,"home" , "and" , "I" , "am" , "chilling");
        System.out.println(str);
    }

    public static String concateAll( String... elements){
        StringBuilder result = new StringBuilder();

        for( String element : elements){
            result.append(element);
            result.append(" ");
        }

        return result.toString();
    }
}
