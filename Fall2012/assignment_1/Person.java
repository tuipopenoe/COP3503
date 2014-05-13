// Tui Popenoe
// COP 3503 - Assignment 1
// Person.java
// ©2014

public class Person{
    protected String name;
    protected int UFID;
    // Format = month/day/year
    protected String dob;

    public Person(String name, int UFID, String dob){
        this.name = name;
        this.UFID = UFID;
        this.dob = dob;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getUFID(){
        return this.UFID;
    }

    public void setUFID(int UFID){
        this.UFID = UFID;
    }

    public String getDob(){
        return this.dob;
    }

    public void setDob(String dob){
        this.dob = dob;
    }

    public String toString(){
        return  "Name: " + this.name + "\n" +
                "D.O.B: " + this.dob + "\n" +
                "UFID: " + this.UFID;
    }

    public boolean equals(Object ob){
        Person p = (Person) ob;
        if(p.getName().equals(this.name)){
            if(p.getUFID() == this.UFID){
                if(p.getDob().equals(this.dob)){
                    return true;
                }
            }
        }

        return false;
    }
}