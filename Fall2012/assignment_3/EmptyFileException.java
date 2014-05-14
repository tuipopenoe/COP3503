// Tui Popenoe
// COP 3503 - Assignment 1
// EmptyFileException.java
// ©2014


public class EmptyFileException extends Exception{
    public String filename;

    public EmptyFileException(){}

    public EmptyFileException(String filename){
        this.filename = filename;
    }

    public String toString(){
        return "The file " + this.filename + " is empty.";
    }

}