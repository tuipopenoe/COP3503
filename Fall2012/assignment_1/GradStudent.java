// Tui Popenoe
// COP 3503 - Assignment 1
// GradStudent.java
// ©2014

public class GradStudent extends Student{
    private Course courseTA;

    public GradStudent(String name, int UFID, String dob, double gpa){
        super(name, UFID, dob, gpa);
    }

    public GradStudent(String name, int UFID, String dob, double gpa,
        Course[] courses){
        super(name, UFID, dob, gpa, courses);
    }

    public GradStudent(String name, int UFID, String dob, double gpa,
        Course[] courses, Course courseTa){
        super(name, UFID, dob, gpa, courses);
        setCourseTA(courseTA);
    }

    public Course getCourseTA(){
        return this.courseTA;
    }

    public void setCourseTA(Course courseTA){
        this.courseTA = courseTA;
    }

    public boolean addCourse(Course course){
        if(course.getNumber() >= 5000){
            if(this.numCoursesEnrolled < this.maxCourses){
                boolean addCheck = course.addStudent(this);

                if(addCheck){
                    for(int i=0; i < this.courses.length; i++){
                        if(courses[i] == null){
                            courses[i] = course;
                            this.numCoursesEnrolled++;
                            break;
                        }
                    }
                }

                return addCheck;
            }
        }

        return false;
    }

    public String toString(){
        return  "Grad Student: " + "\n" +
                super.toString() + "\n" +
                "Course TA for: " + "\n" +
                this.courseTA;
    }
}