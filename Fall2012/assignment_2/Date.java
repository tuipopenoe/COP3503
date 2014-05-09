public class Date implements Comparable, Cloneable{
    private int day;
    private int month;
    private int year;

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
        if(this.year < date.year){
            return 1;
        }
        else if(this.year == date.year){
            if(this.month < date.month){
                return 1;
            }
            else if(this.month == date.month){
                if(this.day < date.day){
                    return 1;
                }
                else if(this.day == date.day){
                    return 0;
                }
                else{
                    return -1;
                }
            }
            else{
                return -1;
            }
        }
        else{
            return -1;
        }
    }

    public Object clone() throws CloneNotSupportedException{
        Date clone = (Date)super.clone();
        clone.day = this.day;
        clone.month = this.month;
        clone.year = this.year;

        return clone;
    }
}