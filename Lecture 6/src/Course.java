class Course {
    String courseName;
    int enrolledStudent;
    static int maxCapacity = 100;
    String[] student = new String[maxCapacity];


    Course(String courseName){
        this.courseName = courseName;
        enrolledStudent  = 0;
        student = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
//        this.maxCapacity =maxCapacity ; // Conflit when using static in static with same
        Course.maxCapacity = maxCapacity; // Right way
    }

    void enrollStudent(String studentName){
        student[enrolledStudent++] = studentName;
    }

    void deEnrollStudent( String studentName){
        int pos = -1;
        for( int i = 0; i < enrolledStudent; i++){
            if( student[i] == studentName){
                pos = i+1;
                break;
            }
        }
        if( pos != -1){
            for( int i = pos; i < enrolledStudent; i++){
                student[i-1] = student[i];
            }
            System.out.println("Student DeEnrolled");
            enrolledStudent--;
        }
        else{
            System.out.println("Student Not found");
        }
    }
}
