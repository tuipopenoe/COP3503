// Tui Popenoe
// COP 3503 - Assignment 1
// University.java
// ©2014

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

    public boolean writeToFile(String filename){
        PrintWriter writer = new PrintWriter(filename, "UTF-8");

        writer.println(this.getName());
        writer.println(this.getCurrentTerm());
        writer.println(this.getYear());
        writer.println(this.getStudents().length);
        writer.println(this.getCourses().length);
        writer.println(this.getInstructors().length);

        for(int i = 0; i < this.students.length; i++){
            writer.println(this.students[i].getName());
            writer.println(this.students[i].getDob());
            writer.println(this.students[i].getUFID());
            writer.println(this.students[i].getGpa());
            writer.println(this.students[i].getCourses().length);
        }

        for(int i = 0; i < this.instructors.length; i++){
            writer.println(this.instructors[i].getName());
            writer.println(this.instructors[i].getDob());
            writer.println(this.instructors[i].getUFID());
        }

        for(int i = 0; i < this.courses.length; i++){
            writer.println(this.courses[i].getTitle());
            writer.println(this.courses[i].getNumber());
            writer.println(this.courses[i].getNumCredits());
            writer.println(this.courses[i].getInstructor().getUFID());
            writer.println(this.courses[i].getTAs().length);
            GradStudent[] tempTAs = this.courses[i].getTAs();
            for(int j = 0; j < tempTAs.length; j++){
                writer.println(tempTAs[j].getUFID());
            }
            writer.println(this.courses[i].getCapacity
            Student[] tempStudents = this.courses[i].getStudents();
            for(int j = 0; j < tempStudents.length; j++){
                writer.println(tempStudents[j].getUFID());
            }
        }
        writer.close();
    }
}