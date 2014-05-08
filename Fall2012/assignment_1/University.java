public class University{
    private String name;
    private String currentTerm;
    private int year;
    private Course[] courses;
    private Student[] students;
    private Instructor[] instructors;

    public University(String name, String currentTerm, int year,
        Student[] students, Instructor[] instructors, Course[] courses){
        this.name = name;
        this.currentTerm = currentTerm;
        this.year = year;
        this.students = students;
        this.instructors = instructors;
        this.courses = courses;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCurrentTerm(){
        return this.currentTerm;
    }

    public void setCurrentTerm(String currentTerm){
        this.currentTerm = currentTerm;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public Course[] getCourses(){
        return this.courses;
    }

    public void setCourses(Course[] courses){
        this.courses = courses;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public void setStudents(Student[] students){
        this.students = students;
    }

    public Instructor[] getInstructors(){
        return this.instructors;
    }

    public void setInstructors(Instructor[] instructors){
        this.instructors = instructors;
    }

    public String toString(){
        return  "University Name: " + this.name + "\n" +
                "Current Term: " + this.currentTerm + "\n" +
                "Current Year: " + this.year + "\n" +
                "Number of Students: " + this.students.length + "\n" +
                "Number of Courses: " + this.courses.length + "\n" +
                "Number of Instructors: " + this.instructors.length + "\n";
    }
}