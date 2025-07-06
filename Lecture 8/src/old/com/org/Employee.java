package old.com.org;

public class Employee {
    private String name;
    private int age;
    private long salary;

    public Employee(String name, int age, long salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void DisplayEmployeeDetails(){
        System.out.printf("Employe { Name : %s , Age : %d , Salary : %d }", name, age , salary);
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
