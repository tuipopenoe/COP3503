// Tui Popenoe
// COP 3503 - Assignment 2
// Date.java
// ©2014

public class Date implements Comparable<Date>, Cloneable{
    private int day;
    private int month;
    private int year;

    public Date(){}

    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth(){
        return this.month;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getDay(){
        return this.day;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int compareTo(Date date){
        if(this.year < date.getYear()){
            return 1;
        }
        else if(this.year > date.getYear()){
            return -1;
        }
        else{
            if(this.month < date.getMonth()){
                return 1;
            }
            else if(this.month > date.getMonth()){
                return -1;
            }
            else{
                if(this.day < date.getDay()){
                    return 1;
                }
                else if(this.day > date.getDay()){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        }
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public String toString(){
        return month + "/" + day + "/" + year;
    }
}