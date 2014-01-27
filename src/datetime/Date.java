package datetime;

import static java.lang.Math.abs;

public class Date {
    long numberOfDays=0;
    int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    public Date(int year,int month,int date) {
        int y = year - 1900;
        int numberOfFourYears = y/4;
        numberOfDays += numberOfFourYears * 1461;
        numberOfDays += (y-(y/4))*365;
        if(year%4==0)
            days[1] = 29;
        for (int i = 0; i < month-1; i++) {
            numberOfDays+=days[i];
        }
        numberOfDays += date;
    }
    String getDifference(Date other) {
        long difference = this.numberOfDays - other.numberOfDays;
        long numberOfFourYears = difference/1461;
        long remainingDifference = difference - (numberOfFourYears*1461);
        long numberOfYears = remainingDifference/365;
        remainingDifference -= numberOfFourYears*365;
        long dy = (numberOfFourYears*4)+numberOfYears;
        long dm = 0;
        long dd = 0;
        for (int i = 0; i < days.length; i++) {
            if(remainingDifference-days[i]<0)
                break;
            remainingDifference -= days[i];
            dm++;
        }
        dd = remainingDifference;
        return abs(dy) + "-" + abs(dm) + "-" + abs(dd);
    }
}
