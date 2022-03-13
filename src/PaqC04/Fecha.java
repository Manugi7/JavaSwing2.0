package PaqC04;

public class Fecha {

    private int day,month,year;

    public Fecha(){


    }

    public Fecha (int day, int month, int year){

        if(isValido(day, month, year)){

            this.day = day;
            this.month = month;
            this.year = year;

        }

    }

    public boolean isValido (int day, int month, int year){

        if((month==4 || month==6 || month==9 || month == 11) && (day>=1 && day<=30) && (year>=2022)){

            return true;

        } else if (month == 2 && (day>=1 && day<=28) && (year>=2022)){

            return true;

        } else if ((month==1 || month==3 || month==5 || month == 7 || month == 8 || month == 10 || month ==12) && (day>=1 && day<=31) && (year>=2022)){

            return true;

        }

        return false;

    }

    public int getDay() {
        return this.day;
    }

    public int getMonth(){

        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){

        return this.day + "/" + this.month + "/" + this.year;

    }

}
