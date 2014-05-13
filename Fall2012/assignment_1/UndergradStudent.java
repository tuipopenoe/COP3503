// Tui Popenoe
// COP 3503 - Assignment 1
// UndergradStudent.java
// ©2014

public class UndergradStudent extends Student{
    public UndergradStudent(String name, int UFID, String dob, double gpa){
        super(name, UFID, dob, gpa);
    }

    public UndergradStudent(String name, int UFID, String dob, double gpa,
        Course[] courses){
        super(name, UFID, dob, gpa, courses);
    }

    public boolean addCourse(Course course){
        if(course.getNumber() < 5000){
            if(this.numCoursesEnrolled < this.maxCourses){
                if(course.addStudent(this)){
                    for(int i=0; i < this.courses.length-1; i++){
                        if(courses[i] == null){
                            courses[i] = course;
                            this.numCoursesEnrolled++;

                            return true;
                        }
                    }
                }
            }
        }

        return true;
    }

    public String toString(){
        return  "Undergrad Student: " + "\n" +
                super.toString();
    }
}