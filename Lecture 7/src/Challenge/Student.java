package Challenge;

public class Student {
    String name = "";
    int age ;

    Student( String name , int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + " name : " + name +
                " , age : " + age + "}";
    }

    public static void main(String[] args) {
        Student S1 = new Student("Aman" , 20);
        System.out.println( S1);
    }
}
