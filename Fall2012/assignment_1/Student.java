// Tui Popenoe
// COP 3503 - Assignment 1
// Student.java
// ©2014

public abstract class Student extends Person{
    protected Course[] courses;
    protected final int maxCourses = 5;
    protected int numCoursesEnrolled;
    protected double gpa;

    public Student(String name, int UFID, String dob, double gpa){
        super(name, UFID, dob);
        this.gpa = gpa;
    }

    public Student(String name, int UFID, String dob, double gpa,
        Course[] courses){
        super(name, UFID, dob);
        this.gpa = gpa;
        this.courses = courses;
        this.numCoursesEnrolled = courses.length;
    }

    public Course[] getCourses(){
        return this.courses;
    }

    public void setCourses(Course[] courses){
        this.courses = courses;
    }

    public int getMaxCourses(){
        return this.maxCourses;
    }

    public int getNumCoursesEnrolled(){
        return this.numCoursesEnrolled;
    }

    public void setNumCoursesEnrolled(int numCoursesEnrolled){
        this.numCoursesEnrolled = numCoursesEnrolled;
    }

    public double getGpa(){
        return this.gpa;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public abstract boolean addCourse(Course course);

    public boolean dropCourse(Course course){
        if(course.removeStudent(this)){
            for(int i = 0; i < this.courses.length-1; i++){
                if(courses[i].equals(course)){
                    courses[i] = null;
                    this.numCoursesEnrolled--;

                    return true;
                }
            }
        }

        return false;
    }

    public String toString(){
        String studentString =
                "Name: " + this.name + "\n" +
                "D.O.B: " + this.dob + "\n" +
                "UFID: " + this.UFID + "\n" +
                "GPA: " + this.gpa + "\n";
                for(int i=0; i < courses.length-1; i++){
                    studentString.concat("Course " + i + ": " );
                    studentString.concat(courses[i].toString() + "\n");
                }

                return studentString;
    }
}