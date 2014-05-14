// Test Driver for Project 3
// COP 3503 Fall 2012

public class TestDriver2 {

    public static void main(String[] args) {

        University ufl = University.readFromFile("university.txt");

                if (ufl != null) {
                    System.out.println("\n--Printing out University info--");
                    System.out.println(ufl);

                    System.out.println("\n--Printing out Students info--");
                    Student[] students = ufl.getStudents();
                    for (Student s : students)
                            System.out.println("\n" + s);
                }
    }

}