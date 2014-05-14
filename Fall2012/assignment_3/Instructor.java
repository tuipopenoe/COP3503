// Tui Popenoe
// COP 3503 - Assignment 1
// Instructor.java
// ©2014

public class Instructor extends Person{
    private Course course;

    public Instructor(String name, int UFID, String dob){
        super(name, UFID, dob);
    }

    public Instructor(String name, int UFID, String dob, Course course){
        super(name, UFID, dob);
        this.course = course;
    }

    public Course getCourse(){
        return this.course;
    }

    public void setCourse(Course course){
        this.course = course;
    }

    public String toString(){
        return "Instructor: " + "\n" +
                super.toString() +
                "Course Being Taught: \n" +
                this.course.toString();
    }
}