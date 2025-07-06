package old.Inheritance;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj); // when want call something from the parent

        // here instanceof is checking if the obj is a Object of Person class
        if( !(obj instanceof Person)){ // instanceof is used to check if the given object is the object of the required class or not

            return false;
        }
        Person per = (Person) obj; // now that we know it's the obj of Person class then we cast it into Person class object from Object class object.

        return (
                this.name.equals(per.name) &&
                this.age == per.age &&
                this.id.equals(per.id)
        );
    }

    public boolean equalsWithHash(Object obj){
        if( !(obj instanceof Person)){ // instanceof is used to check if the given object is the object of the required class or not

            return false;
        }
        Person per = (Person) obj;

        return per.hashCode() == this.hashCode();
    }

    //hashCode() is used to equate and find the same object easily without changing much properties
    //so we will create a hashCode() which has same hashCode for the same value of the object
    //which help us find and equat objects easily


    @Override
    public int hashCode() {
        return Objects.hash(name, age, id); // here .hash creates a unique but equal hashcode for same values
        //which has been calculated old.in background

        // but its not necessary that if hashCode are same so the object will be same , that not completely necessary

    }
}
