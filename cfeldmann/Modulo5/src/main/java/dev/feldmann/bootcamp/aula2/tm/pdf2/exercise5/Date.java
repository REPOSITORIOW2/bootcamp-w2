package dev.feldmann.bootcamp.aula2.tm.pdf2.exercise5;

public class Date {


    // 1 - 31
    private int day;
    // 1 - 12
    private int month;
    // 0 - 99999
    private int year;


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isValid() {
        if (year < 0) return false;

        if (month < 1 || month > 13) return false;

        int daysInMonth = getDaysInMonth(year,month);

        if(day < 1 || day > daysInMonth) return false;

        return true;
    }

    private boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        return year % 4 == 0 && year % 100 != 0;
    }

    public int getDaysInMonth(int year, int month) {
        int daysInMonth = 30 + ((month + (month >= 8 ? 1 : 0))  % 2);
        // February
        if (month == 2) {
            daysInMonth = isLeapYear(year) ? 29 : 28;
        }
        return daysInMonth;
    }

    public void addDay() {
        int daysInMonth = getDaysInMonth(this.year,this.month);

        if (this.day >= daysInMonth) {
            this.month++;
            this.day = 1;
            if (this.month == 13) {
                this.year++;
                this.month = 1;
            }
        } else {
            this.day++;
        }

    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }
}
