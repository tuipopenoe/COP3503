// Tui Popenoe
// COP 3503 - Assignment 2
// Customer.java
// ©2014

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Rental> checkedOut;
    private ArrayList<Rental> checkedOutHistory;
    private double totalCharge;

    public Customer(String name){
        this.name = name;
        this.totalCharge = 0;

        this.checkedOut = new ArrayList<Rental>();
        this.checkedOutHistory = new ArrayList<Rental>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Rental> getCheckedOut(){
        return this.checkedOut;
    }

    public void setCheckedOut(ArrayList<Rental> checkedOut){
        this.checkedOut = checkedOut;
    }

    public ArrayList<Rental> getCheckedOutHistory(){
        return this.checkedOutHistory;
    }

    public void setCheckedOutHistory(ArrayList<Rental> checkedOutHistory){
        this.checkedOutHistory = checkedOutHistory;
    }

    public double getTotalChage(){
        return this.totalCharge;
    }

    public void setTotalCharge(double totalCharge){
        this.totalCharge = totalCharge;
    }

    public boolean checkOut(Rental rental){
        if(rental.isCheckedOut()){
            return false;
        }
        else{
            rental.checkOut();
            this.checkedOut.add(rental);
            return true;
        }
    }

    public boolean checkIn(Rental rental, int numDays, double rating){
        if(this.checkedOut.contains(rental)){
            double cost = rental.checkIn(numDays, rating);
            this.totalCharge += cost;
            this.checkedOut.remove(rental);
            this.checkedOutHistory.add(rental);
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return  "Customer Name: " + this.name + "\n" +
                "Total Charge: " + this.totalCharge + "\n" +
                "Total Rentals Currently Checked Out: " +
                this.checkedOut.size() + "\n" +
                "Total Rentals Previously Checked Out: " +
                this.checkedOutHistory.size() + "\n";
    }
}