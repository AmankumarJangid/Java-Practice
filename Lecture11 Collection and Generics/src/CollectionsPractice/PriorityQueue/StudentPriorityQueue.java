package CollectionsPractice.PriorityQueue;

import CollectionsPractice.Utility;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    private static class Student{

        final private String name;
        final private char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public char getGrade(){
            return grade;
        }
        public String getName(){
            return name;
        }

        public static Comparator<Student> compareWithGrade = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.getGrade() - o2.getGrade());
//                if (o1.getName().equals(o2.getName()) && o1.grade == o2.grade)
//                    return 0;
//                else if (o1.getGrade() > o2.getGrade())
//                    return -1;
//                else
//                    return 1;
            }
        };

        @Override
        public String toString() {
            return String.format("%s : %c", name, grade);
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Student> q = new PriorityQueue<>(Student.compareWithGrade);

        q.add(new Student("Aman" , 'A'));
        q.add(new Student("Bhavesh" , 'C'));
        q.add(new Student("Chancal" , 'B'));

        Utility.print(q);
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll()); // its only be seen sorted when the elements is selected or removed from the queue;

        System.out.println(q);


    }



}
