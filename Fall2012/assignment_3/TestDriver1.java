// Test Driver for Project 1 (modified for Project 3)
// COP 3503 Fall 2012

public class TestDriver1 {

    public static void main(String[] args) {


        // Create some Undergrad Students
        UndergradStudent student1 = new UndergradStudent("John Smith", 871311, new String("1990/01/21"), 3.5);
        UndergradStudent student2 = new UndergradStudent("Peter Parker", 871312, new String("1989/02/03"), 4.0);
        UndergradStudent student3 = new UndergradStudent("Rachel Smith", 871320, new String("1990/10/01"), 3.8);
        UndergradStudent student4 = new UndergradStudent("Karen Hicks", 871322, new String("1991/12/31"), 3.6);

        // Create some grad Students
        GradStudent gs1 = new GradStudent("Alex Stark", 118491, new String("1984/05/05"), 3.8);
        GradStudent gs2 = new GradStudent("Mike Smith", 128191, new String("1986/01/02"), 3.7);
        GradStudent gs3 = new GradStudent("Nathan Rodriguez", 714133, new String("1984/04/04"), 3.7);
        GradStudent gs4 = new GradStudent("Katy Chu", 144211, new String("1987/08/03"), 3.9);
        GradStudent gs5 = new GradStudent("Jay Sanders", 144215, new String("1987/11/03"), 3.5);

        // Create some instructors
        Instructor i1 = new Instructor("Shayan Javed", 119042, new String("1985/01/01"));
        Instructor i2 = new Instructor("Jack Davis", 119043, new String("1975/10/11"));

        // Create an undergrad course
        GradStudent[] tas = {gs1, gs2};
        UndergradStudent[] students1 = {student1, student3};
        System.out.println("---Creating undergrad course1 with capacity 2---");
        Course course1 = new Course("COP", 3503, "Programming Fundamentals", 3, i1, tas, 2);
        System.out.println("--" + course1.getType() + course1.getNumber() + ": " + course1.getTitle());
        // Set the instructor for the course
        course1.setInstructor(i1);
        // Set the course TA for the grad students
        gs1.setCourseTA(course1);
        gs2.setCourseTA(course1);

        // Try enrolling some students
        System.out.println("Trying to add student1 to course1: " + student1.addCourse(course1));
        System.out.println("Trying to add gs1 to course1: " + gs1.addCourse(course1));
        System.out.println("Trying to add student3 to course1: " + student3.addCourse(course1));
        System.out.println("Trying to add student2 to course1: " + student2.addCourse(course1));

        // Increase capacity of course1
        System.out.println("-Increasing capacity of course1 to 3--");
        course1.setCapacity(3);
        System.out.println("Trying to add student2 to course1: " + student2.addCourse(course1));
        System.out.println("student4 trying to drop course1: " + student4.dropCourse(course1));
        System.out.println("student1 trying to drop course1: " + student1.dropCourse(course1));
        System.out.println("Trying to add student4 to course1: " + student4.addCourse(course1));

        // Create a grad course
        GradStudent[] tas2 = {gs3};
        System.out.println("\n---Creating grad course2 with capacity 2---");
        Course course2 = new Course("CAP", 5024, "Advanced Networking", 3, i2, tas2, 2);
        System.out.println("--" + course2.getType() + course2.getNumber() + ": " + course2.getTitle());
        // Set the instructor for the course
        course2.setInstructor(i2);
        // Set the course TA for the grad students
        gs3.setCourseTA(course2);

        // Try enrolling some students
        System.out.println("Trying to add student1 to course2: " + student1.addCourse(course2));
        System.out.println("Trying to add gs1 to course2: " + gs1.addCourse(course2));
        System.out.println("Trying to add gs2 to course2: " + gs2.addCourse(course2));
        System.out.println("Trying to add gs4 to course2: " + gs4.addCourse(course2));
        //System.out.println("\n--Printing out course2 info:--");
        //System.out.println(course2);

        // Increase capacity of course2
        System.out.println("-Increasing capacity of course2 to 4--");
        course2.setCapacity(4);
        System.out.println("Trying to add gs4 to course2: " + gs4.addCourse(course2));
        System.out.println("gs5 trying to drop course2: " + gs5.dropCourse(course2));
        System.out.println("gs1 trying to drop course2: " + gs1.dropCourse(course2));
        System.out.println("Trying to add gs5 to course2: " + gs5.addCourse(course2));
        //System.out.println("\n--Printing out course2 info:--");
        //System.out.println(course2);

        // Create another undergrad course
        Instructor i3 = new Instructor("Larry David", 119080, new String("1965/02/15"));
        Student[] students2 = {student1, student2, student3, student4, gs3};
        GradStudent[] tas3 = {gs4, gs5};

        System.out.println("\n---Creating undergrad course3 with capacity 10---");
        Course course3 = new Course("SOC", 1001, "Sociology 101", 3, i3, tas3, 10);
        System.out.println("--" + course3.getType() + course3.getNumber() + ": " + course3.getTitle());
        // Set the instructor for the course
        course3.setInstructor(i3);
        gs4.setCourseTA(course3);
        gs5.setCourseTA(course3);
        for (Student s : students2) {
            System.out.println("Trying to add " + s.getName() + " to " + course3.getType() + course3.getNumber() + ": " + s.addCourse(course3));
        }

        // Print out all the students info. (Test polymorphism)
        Student[] students = {student1, student2, student3, student4, gs1, gs2, gs3, gs4, gs5};

        System.out.println("\n--Printing out Students info--");
        for (Student s : students)
            System.out.println("\n" + s);

        // Create the University object
        Course[] courses = {course1, course2, course3};
        Instructor[] instructors = {i1, i2, i3};
        University ufl = new University("University of Florida", "Fall", 2012, students, instructors, courses);

        System.out.println("\n--Printing out University info--");
        System.out.println(ufl);

        // Write to file - added for project 3
        System.out.println(ufl.writeToFile("university.txt"));
    }

}