package old.Inheritance;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Aman" , 19 , "0021");
        Person person2 = new Person("Aman" , 19 , "0021");

        if( person1.equals(person2)) {
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        if( person1.equalsWithHash(person2)){
            System.out.println("Equals");
        }
    }
}
