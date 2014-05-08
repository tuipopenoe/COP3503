public class GradStudent extends Student{
    private Course courseTa;

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
        this.courseTa = courseTa;
    }

    public boolean addCourse(Course course){
        if(course.getNumber() >= 5000){
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
        return  "Grad Student: " + "\n" +
                super.toString();
    }
}