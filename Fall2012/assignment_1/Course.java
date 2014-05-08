public class Course{
    private String type;
    private String title;
    private int number;
    private int numCredits;
    private Instructor instructor;
    private GradStudent[] TAs;
    private Student[] students;
    private int capacity;
    private int currentEnrollment;

    public Course(String type, int number, String title, int numCredits){
        this.type = type;
        this.title = title;
        this.number = number;
        this.numCredits = numCredits;
    }

    public Course(String type, int number, String title, int numCredits,
        Instructor instructor, GradStudent[] TAs, int capacity){
        this.type = type;
        this.number = number;
        this.title = title;
        this.numCredits = numCredits;
        this.instructor = instructor;
        this.TAs = TAs;
        this.capacity = capacity;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumCredits(){
        return this.numCredits;
    }

    public void setNumCredits(int numCredits){
        this.numCredits = numCredits;
    }

    public int getCurrentEnrollment(){
        return this.currentEnrollment;
    }

    public void setCurrentEnrollment(int currentEnrollment){
        this.currentEnrollment = currentEnrollment;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public void setStudents(Student[] students){
        this.students = students;
    }

    public Instructor getInstructor(){
        return this.instructor;
    }

    public void setInstructor(Instructor instructor){
        this.instructor = instructor;
    }

    public GradStudent[] getTAs(){
        return this.TAs;
    }

    public void setTAs(GradStudent[] TAs){
        this.TAs = TAs;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public boolean addStudent(Student student){
        if(this.currentEnrollment < this.capacity){
            for(int i = 0; i < capacity; i++){
                if(this.students[i] == null){
                    this.students[i] = student;

                    return true;
                }
            }
        }

        return false;
    }

    public boolean removeStudent(Student student){
        for(int i = 0; i < students.length -1; i++){
            if(students[i].equals(student)){
                students[i] = null;
                this.currentEnrollment--;

                return true;
            }
        }

        return false;
    }

    public String toString(){
        String courseString =
            "Course Info: \n" +
            this.type + this.number + "\n" +
            "Title: " + this.title + "\n" +
            "Instructor: " + this.instructor + "\n" +
            "TAs: " + "\n";
            for(int i=0; i < this.TAs.length -1; i++){
                courseString.concat(TAs[i].name);
            }
            courseString += "Number of Students: " + currentEnrollment +"\n";
            courseString += "Capacity : " + capacity + "\n";

            return courseString;
    }
}